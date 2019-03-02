/**
 * 
 */
package com.starfall.ssm.test.emps;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.starfall.ssm.dao.UrlLogMapper;
import com.starfall.ssm.entity.Employee;
import com.starfall.ssm.entity.UrlLog;
import com.starfall.ssm.service.EmployeeService;
import com.starfall.ssm.service.UrlLogService;

/**
 * @name: EmpDaoServiceTest
 * @description:测试emp的DAO层、Service层的功能模块
 * @author: StarFall
 * @data: 2019年3月2日上午11:28:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" })
public class EmpDaoServiceTest {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private UrlLogMapper urlLogMapper;

	@Autowired
	private UrlLogService urlLogService;

	@Test
	public void testGetAllEmps() {
		// List<Employee> list = employeeService.getEmps();
		List<Employee> list = employeeService.getAllEmps();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	@Test
	public void testLogMapper() {
		UrlLog log = new UrlLog();
		log.setCreatTime(new Date());
		urlLogMapper.insertSelectiveGetId(log);
		System.out.println(log.getId());
	}

	@Test
	public void testLogService() {
		UrlLog log = new UrlLog();
		log.setCreatTime(new Date());
		urlLogService.addLog(log);
		System.out.println("testLogService: " + log.getId());
	}
}