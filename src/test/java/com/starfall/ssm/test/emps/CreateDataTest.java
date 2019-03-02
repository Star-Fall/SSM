/**
 * 
 */
package com.starfall.ssm.test.emps;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.starfall.ssm.dao.DepartmentMapper;
import com.starfall.ssm.dao.EmployeeMapper;
import com.starfall.ssm.dao.JobMapper;
import com.starfall.ssm.entity.Department;
import com.starfall.ssm.entity.Employee;
import com.starfall.ssm.entity.Job;
import com.starfall.ssm.util.RandomUtil;

/**
 * @name: CreateDataTest
 * @description: 生成测试数据
 * @author: StarFall
 * @data: 2019年3月2日上午11:31:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-config.xml" })
public class CreateDataTest {

	@Autowired
	private SqlSessionTemplate sqlSessionBatch;

	@Test
	public void testCreateData() {
		try {
			DepartmentMapper depMapper = sqlSessionBatch.getMapper(DepartmentMapper.class);
			List<Department> depList = depMapper.selectByExample(null);
			JobMapper jobMapper = sqlSessionBatch.getMapper(JobMapper.class);
			List<Job> jobList = jobMapper.selectByExample(null);

			EmployeeMapper mapper = sqlSessionBatch.getMapper(EmployeeMapper.class);
			for (int i = 1; i < 5000; i++) {
				String upWord1 = RandomUtil.getRandomStringEnUp(1);
				String upWord2 = RandomUtil.getRandomStringEnUp(1);
				int num1 = RandomUtil.getRandomNumRange(3, 6);
				int num2 = RandomUtil.getRandomNumRange(3, 6);
				int num3 = RandomUtil.getRandomNumRange(5, 7);
				String firstName = upWord1 + RandomUtil.getRandomStringEnLow(num1);
				String lastName = upWord2 + RandomUtil.getRandomStringEnLow(num2);
				String email = RandomUtil.getRandomStringEnUp(num3);
				String phoneNumber = RandomUtil.getRandomStringNum(3) + "." + RandomUtil.getRandomStringNum(3) + "."
						+ RandomUtil.getRandomStringNum(4);
				Date hireDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(RandomUtil.getRandomDateRange("2016-01-01", "2019-01-01", "yyyy-MM-dd"));
				String jobId = jobList.get(RandomUtil.getRandomNumRange(0, jobList.size() - 1)).getJobId();
				BigDecimal salary = new BigDecimal(RandomUtil.getRandomNumRange(1000, 20000));
				Integer managerId = depList.get(RandomUtil.getRandomNumRange(0, depList.size() - 1)).getManagerId();
				Integer departmentId = depList.get(RandomUtil.getRandomNumRange(0, depList.size() - 1))
						.getDepartmentId();
				Employee employee = new Employee();
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setEmail(email);
				employee.setPhoneNumber(phoneNumber);
				employee.setHireDate(hireDate);
				employee.setJobId(jobId);
				employee.setSalary(salary);
				employee.setManagerId(managerId);
				employee.setDepartmentId(departmentId);
				mapper.insertSelective(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("执行成功！");
	}
}
