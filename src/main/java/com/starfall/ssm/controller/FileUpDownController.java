package com.starfall.ssm.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.starfall.ssm.util.response.ApiResult;

/**
 * @name: FileUpDownController
 * @description: 文件上传下载控制器
 * @author: StarFall
 * @data: 2019年2月26日下午10:39:52
 */
@RequestMapping("/file")
@Controller
public class FileUpDownController {
	/**
	 * 文件上传
	 * 
	 * @param desc
	 *            文件描述
	 * @param file
	 *            文件
	 * @return
	 * @throws Exception
	 *             异常
	 */
	@RequestMapping("/file_up_load")
	@ResponseBody
	public Map<String, Object> fileUpLoad(@RequestParam(value = "desc", required = false) String desc,
			@RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
		String path = "D:/temp/";
		if (file != null && !file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			File temp = new File(path, fileName);
			file.transferTo(temp);
			return ApiResult.SUCCESS.getMap();
		} else {
			return ApiResult.ERROR.getMap("文件不能为空！");
		}
	}

	/**
	 * 文件下载
	 * 
	 * @param fileName
	 *            文件名称
	 * @return
	 * @throws Exception
	 *             异常
	 */
	@RequestMapping(value = "/file_down_load")
	public ResponseEntity<byte[]> fileDowanLoad(@RequestParam(value = "fileName", required = false) String fileName)
			throws Exception {
		// 下载文件名称
		if (fileName == null) {
			fileName = "新建文本文档.txt";
		}
		// 下载文件路径
		String realPath = "D:/temp";
		File file = new File(realPath + File.separator + fileName);
		InputStream in = new FileInputStream(file);// 将该文件加入到输入流之中
		byte[] body = null;
		// 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
		body = new byte[in.available()];
		// 读入到输入流里面
		in.read(body);
		// 下载显示的文件名，解决中文名称乱码问题
		fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");

		// 设置响应头,通知浏览器以attachment（下载方式）打开图片
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=" + fileName);
		HttpStatus statusCode = HttpStatus.OK;// 设置响应吗
		ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(body, headers, statusCode);
		return responseEntity;
	}

}
