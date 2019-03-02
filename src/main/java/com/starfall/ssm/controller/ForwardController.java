/**
 * 
 */
package com.starfall.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name:
 * @description:
 * @author: StarFall
 * @data: 2019年2月14日下午11:54:00
 */
@Controller
@RequestMapping("/to")
public class ForwardController {

	@RequestMapping("/emps")
	public String toEmps() {
		return "emps.html";
	}

	@RequestMapping("/success")
	public String toSuccess() {
		double a = 110 / 0;
		return "success.jsp";
	}
}
