/**
 * 
 */
package com.starfall.ssm.interceptor;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.starfall.ssm.entity.UrlLog;
import com.starfall.ssm.service.UrlLogService;

/**
 * @name: LoggerInterceptor
 * @description: 日志拦截器记录操作日志
 * @author: StarFall
 * @data: 2019年2月23日下午9:46:41
 */
public class LoggerInterceptor implements HandlerInterceptor {

	@Autowired
	private UrlLogService urlLogService;
	// log4j
	private Logger logger = Logger.getLogger(LoggerInterceptor.class);
	// 本地线程存储消耗时间变量
	private static final ThreadLocal<Long> costTimeThreadLocal = new NamedThreadLocal<>("costTimeThreadLocal");
	// 本地线程存储log的id
	private static final ThreadLocal<Integer> logIdThreadLocal = new NamedThreadLocal<>("logIdThreadLocal");

	/**
	 * 该方法在目标方法之前被调用.<br>
	 * 若返回值为 true, 则继续调用后续的拦截器和目标方法. <br>
	 * 若返回值为 false, 则不会再调用后续的拦截器和目标方法.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		costTimeThreadLocal.set(startTime);
		// logger日志记录
		logger.debug("********************LoggerInterceptor.begin********************");
		logger.debug(
				"OpTime:           " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").format(new Date(startTime)));
		logger.debug("RequestURL:       " + request.getRequestURL());
		logger.debug("RequestMethod:    " + request.getMethod());
		logger.debug("RequestParams:    " + getParamString(request.getParameterMap()));
		// 初始化UrlLog对象
		UrlLog log = new UrlLog();
		log.setCreatTime(new Date(startTime));
		log.setRequestUrl(request.getRequestURL().toString());
		log.setRequestMethod(request.getMethod());
		if (handler instanceof HandlerMethod) {
			HandlerMethod h = (HandlerMethod) handler;
			logger.debug("ControllerName:   " + h.getBean().getClass().getName());
			logger.debug("ControllerMethod: " + h.getMethod().getName());
			log.setControllerName(h.getBean().getClass().getName());
			log.setControllerMethod(h.getMethod().getName());
		}
		log.setRequestParams(getParamString(request.getParameterMap()));
		urlLogService.addLog(log);
		// 获取自动生成的主键
		Integer logId = log.getId();
		logIdThreadLocal.set(logId);
		return true;
	}

	/**
	 * 调用目标方法之后, 但在DispatcherServlet渲染视图之前被调用. <br>
	 * 可以处理对应的ModelAndView
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("响应状态:          " + response.getStatus());
		logger.debug("最大内存:          " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "m");
		logger.debug("已分配内存:         " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "m");
		logger.debug("已分配内存中的剩余空间: " + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "m");
		logger.debug("最大可用内存:        " + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()
				+ Runtime.getRuntime().freeMemory()) / 1024 / 1024 + "m");
		long endTime = System.currentTimeMillis();
		long startTime = costTimeThreadLocal.get();
		logger.debug("耗时:             " + (endTime - startTime) + "ms");
		// 更新log对象
		Integer logId = logIdThreadLocal.get();
		UrlLog log = new UrlLog();
		log.setId(logId);
		log.setResponseStatus(String.valueOf(response.getStatus()));
		log.setCostTime(String.valueOf((endTime - startTime) + "ms"));
		urlLogService.updateLog(log);
		logger.debug("********************LoggerInterceptor.end********************");
		// 清除本地线程
		logIdThreadLocal.remove();
		costTimeThreadLocal.remove();
	}

	/**
	 * 在DispatcherServlet渲染视图之后被调用. 主要作用是释放资源<br>
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	/**
	 * 从Map参数获取参数字符串
	 * 
	 * @param map
	 *            参数map
	 * @return
	 */
	private String getParamString(Map<String, String[]> map) {
		StringBuilder sb = new StringBuilder();
		for (Entry<String, String[]> e : map.entrySet()) {
			sb.append(e.getKey()).append("=");
			String[] value = e.getValue();
			if (value != null && value.length == 1) {
				sb.append(value[0]).append("&");
			} else {
				sb.append(Arrays.toString(value)).append("&");
			}
		}
		if (sb.length() >= 1) {
			if (sb.substring(sb.length() - 1, sb.length()).equals("&")) {
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		return sb.toString();
	}
}
