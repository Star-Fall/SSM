package com.starfall.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starfall.ssm.entity.Department;
import com.starfall.ssm.entity.DepartmentExample;

/**
 * @name: DepartmentMapper
 * @description: DepartmentMapper
 * @author: StarFall
 * @data: 2019年3月18日下午9:09:16
 */
public interface DepartmentMapper {
	/**
	 * 查询count
	 * 
	 * @param example
	 *            DepartmentExample
	 * @return long
	 */
	long countByExample(DepartmentExample example);

	/**
	 * 删除
	 * 
	 * @param example
	 *            DepartmentExample
	 * @return int
	 */
	int deleteByExample(DepartmentExample example);

	/**
	 * 根据id删除
	 * 
	 * @param departmentId
	 *            Integer
	 * @return int
	 */
	int deleteByPrimaryKey(Integer departmentId);

	/**
	 * 插入
	 * 
	 * @param record
	 *            Department
	 * @return int
	 */
	int insert(Department record);

	/**
	 * 根据条件插入
	 * 
	 * @param record
	 *            Department
	 * @return int
	 */
	int insertSelective(Department record);

	/**
	 * 查询列表
	 * 
	 * @param example
	 *            DepartmentExample
	 * @return List<Department>
	 */
	List<Department> selectByExample(DepartmentExample example);

	/**
	 * 根据主键查询对象
	 * 
	 * @param departmentId
	 *            Integer
	 * @return Department
	 */
	Department selectByPrimaryKey(Integer departmentId);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Department
	 * @param example
	 *            DepartmentExample
	 * @return int
	 */
	int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Department
	 * @param example
	 *            DepartmentExample
	 * @return int
	 */
	int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Department
	 * @return int
	 */
	int updateByPrimaryKeySelective(Department record);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Department
	 * @return int
	 */
	int updateByPrimaryKey(Department record);
}