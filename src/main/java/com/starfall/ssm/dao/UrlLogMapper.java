package com.starfall.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starfall.ssm.entity.UrlLog;
import com.starfall.ssm.entity.UrlLogExample;

public interface UrlLogMapper {

	long countByExample(UrlLogExample example);

	int deleteByExample(UrlLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(UrlLog record);

	int insertSelective(UrlLog record);

	List<UrlLog> selectByExample(UrlLogExample example);

	UrlLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") UrlLog record, @Param("example") UrlLogExample example);

	int updateByExample(@Param("record") UrlLog record, @Param("example") UrlLogExample example);

	int updateByPrimaryKeySelective(UrlLog record);

	int updateByPrimaryKey(UrlLog record);

	int insertSelectiveGetId(UrlLog record);
}