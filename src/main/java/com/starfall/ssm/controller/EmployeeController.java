/**
 * 
 */
package com.starfall.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.starfall.ssm.entity.Employee;
import com.starfall.ssm.exception.SystemException;
import com.starfall.ssm.model.PageParam;
import com.starfall.ssm.service.EmployeeService;
import com.starfall.ssm.util.response.ApiResult;

/**
 * @name: EmployeeController
 * @description: emp控制器,@RestController
 * @author: StarFall
 * @data: 2019年2月14日下午11:51:27
 */
@RestController
@RequestMapping("/emps")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * 获取所有的emp信息
	 * 
	 * @return Map
	 */
	@RequestMapping("/get_all_emps")
	public Map<String, Object> getAllEmps() {
		List<Employee> list = employeeService.getAllEmps();
		return ApiResult.SUCCESS.getMap().add("list", list);
	}

	@RequestMapping("/get_emps_page")
	public Map<String, Object> getEmpsByPage(PageParam pageParam) {
		PageInfo<Employee> pageInfo = employeeService.getEmpsByPage(pageParam);
		return ApiResult.SUCCESS.getMap().add("data", pageInfo);
	}

	@RequestMapping(value = "/add_emps_test", method = RequestMethod.GET)
	public Map<String, Object> addEmpsTest() {
		try {
			employeeService.addEmps(new Employee());
		} catch (Exception e) {
			throw new SystemException("addEmps有错!");
		}
		return ApiResult.SUCCESS.getMap();
	}
}
