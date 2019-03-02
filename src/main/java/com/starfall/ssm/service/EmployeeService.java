/**
 * 
 */
package com.starfall.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.starfall.ssm.dao.EmployeeMapper;
import com.starfall.ssm.entity.Employee;
import com.starfall.ssm.model.PageParam;

/**
 * @name: EmployeeService
 * @description: emp服务
 * @author: StarFall
 * @data: 2019年2月14日下午11:52:40
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * 获取所有的emps
	 * 
	 * @return
	 */
	public List<Employee> getAllEmps() {
		List<Employee> list = employeeMapper.selectByExample(null);
		return list;
	}

	public PageInfo<Employee> getEmpsByPage(PageParam pageParam) {
		PageHelper.startPage(pageParam);
		List<Employee> list = employeeMapper.selectByExample(null);
		PageInfo<Employee> page = new PageInfo<Employee>(list, pageParam.getNavigatePages());
		return page;
	}

	public boolean addEmps(Employee emp) {
		return employeeMapper.insert(emp) == 1;
	}
}
