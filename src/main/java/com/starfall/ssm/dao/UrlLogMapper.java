package com.starfall.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starfall.ssm.entity.UrlLog;
import com.starfall.ssm.entity.UrlLogExample;

/**
 * @name:UrlLogMapper
 * @description: UrlLogMapper
 * @author: StarFall
 * @data: 2019年3月18日下午9:09:49
 */
public interface UrlLogMapper {
	/**
	 * 查询count
	 * 
	 * @param example
	 *            UrlLogExample
	 * @return long
	 */
	long countByExample(UrlLogExample example);

	/**
	 * 删除
	 * 
	 * @param example
	 *            UrlLogExample
	 * @return int
	 */
	int deleteByExample(UrlLogExample example);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 *            Integer
	 * @return int
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 插入
	 * 
	 * @param record
	 *            UrlLog
	 * @return int
	 */
	int insert(UrlLog record);

	/**
	 * 根据条件插入
	 * 
	 * @param record
	 *            UrlLog
	 * @return int
	 */
	int insertSelective(UrlLog record);

	/**
	 * 查询列表
	 * 
	 * @param example
	 *            UrlLogExample
	 * @return List<UrlLog>
	 */
	List<UrlLog> selectByExample(UrlLogExample example);

	/**
	 * 根据主键查询对象
	 * 
	 * @param id
	 *            Integer
	 * @return UrlLog
	 */
	UrlLog selectByPrimaryKey(Integer id);

	/**
	 * 更新
	 * 
	 * @param record
	 *            UrlLog
	 * @param example
	 *            UrlLogExample
	 * @return int
	 */
	int updateByExampleSelective(@Param("record") UrlLog record, @Param("example") UrlLogExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            UrlLog
	 * @param example
	 *            UrlLogExample
	 * @return int
	 */
	int updateByExample(@Param("record") UrlLog record, @Param("example") UrlLogExample example);

	/**
	 * 更新
	 * 
	 * @param record
	 *            UrlLog
	 * @return int
	 */
	int updateByPrimaryKeySelective(UrlLog record);

	/**
	 * 更新
	 * 
	 * @param record
	 *            UrlLog
	 * @return int
	 */
	int updateByPrimaryKey(UrlLog record);

	/**
	 * 插入
	 * 
	 * @param record
	 *            UrlLog
	 * @return int
	 */
	int insertSelectiveGetId(UrlLog record);
}