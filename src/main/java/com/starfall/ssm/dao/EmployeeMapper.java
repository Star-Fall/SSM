package com.starfall.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starfall.ssm.entity.Employee;
import com.starfall.ssm.entity.EmployeeExample;

/**
 * @name: EmployeeMapper
 * @description: EmployeeMapper
 * @author: StarFall
 * @data: 2019年3月18日下午9:09:30
 */
public interface EmployeeMapper {
	/**
	 * 查询count
	 * 
	 * @param example
	 *            EmployeeExample
	 * @return long
	 */
	long countByExample(EmployeeExample example);

	/**
	 * 删除
	 * 
	 * @param example
	 *            EmployeeExample
	 * @return int
	 */
	int deleteByExample(EmployeeExample example);

	/**
	 * 根据id删除
	 * 
	 * @param employeeId
	 *            Integer
	 * @return int
	 */
	int deleteByPrimaryKey(Integer employeeId);

	/**
	 * 插入
	 * 
	 * @param record
	 *            Employee
	 * @return int
	 */
	int insert(Employee record);

	/**
	 * 根据条件插入
	 * 
	 * @param record
	 *            Employee
	 * @return int
	 */
	int insertSelective(Employee record);

	/**
	 * 查询列表
	 * 
	 * @param example
	 *            EmployeeExample
	 * @return List<Employee>
	 */
	List<Employee> selectByExample(EmployeeExample example);

	/**
	 * 根据主键查询对象
	 * 
	 * @param employeeId
	 *            Integer
	 * @return Employee
	 */
	Employee selectByPrimaryKey(Integer employeeId);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Employee
	 * @param example
	 *            EmployeeExample
	 * @return int
	 */
	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Employee
	 * @param example
	 *            EmployeeExample
	 * @return int
	 */
	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Employee
	 * @return int
	 */
	int updateByPrimaryKeySelective(Employee record);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Employee
	 * @return int
	 */
	int updateByPrimaryKey(Employee record);
}