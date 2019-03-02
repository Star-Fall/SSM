package com.starfall.ssm.exception;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.starfall.ssm.util.response.ApiResult;

/****
 * @name: GlobalExceptionResolver
 * @description: 全局异常处理器
 * @author: StarFall
 * @data: 2019年2月23日上午10:57:42
 */
@ControllerAdvice
public class GlobalExceptionResolver {
	/**
	 * 处理Exception异常
	 * 
	 * @param ex
	 *            异常
	 * @return ApiResult.ERROR
	 */
	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public Map<String, Object> handleException(Exception ex) {
		ex.printStackTrace();
		// return ApiResult.ERROR.getMap().add("exception", ex);
		return ApiResult.ERROR.getMap().add("exception", ex.getMessage());
	}

	/**
	 * 处理自定义的SystemException异常
	 * 
	 * @param ex
	 *            异常
	 * @return ModelAndView
	 */
	@ExceptionHandler({ SystemException.class })
	public ModelAndView handlerSystemException(SystemException ex) {
		ModelAndView mv = new ModelAndView("error/error.jsp");
		mv.addObject("exception", ex);
		return mv;
	}
}
