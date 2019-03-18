package com.starfall.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starfall.ssm.entity.Job;
import com.starfall.ssm.entity.JobExample;

/**
 * @name:JobMapper
 * @description: JobMapper
 * @author: StarFall
 * @data: 2019年3月18日下午9:09:39
 */
public interface JobMapper {
	/**
	 * 查询count
	 * 
	 * @param example
	 *            JobExample
	 * @return long
	 */
	long countByExample(JobExample example);

	/**
	 * 删除
	 * 
	 * @param example
	 *            JobExample
	 * @return int
	 */
	int deleteByExample(JobExample example);

	/**
	 * 根据id删除
	 * 
	 * @param jobId
	 *            String
	 * @return int
	 */
	int deleteByPrimaryKey(String jobId);

	/**
	 * 插入
	 * 
	 * @param record
	 *            Job
	 * @return int
	 */
	int insert(Job record);

	/**
	 * 根据条件插入
	 * 
	 * @param record
	 *            Job
	 * @return int
	 */
	int insertSelective(Job record);

	/**
	 * 查询列表
	 * 
	 * @param example
	 *            JobExample
	 * @return List<Job>
	 */
	List<Job> selectByExample(JobExample example);

	/**
	 * 根据主键查询对象
	 * 
	 * @param jobId
	 *            String
	 * @return Job
	 */
	Job selectByPrimaryKey(String jobId);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Job
	 * @param example
	 *            JobExample
	 * @return int
	 */
	int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Job
	 * @param example
	 *            JobExample
	 * @return int
	 */
	int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Job
	 * @return int
	 */
	int updateByPrimaryKeySelective(Job record);

	/**
	 * 更新
	 * 
	 * @param record
	 *            Job
	 * @return int
	 */
	int updateByPrimaryKey(Job record);
}