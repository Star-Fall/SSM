/**
 * 
 */
package com.starfall.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.starfall.ssm.dao.UrlLogMapper;
import com.starfall.ssm.entity.UrlLog;

/**
 * @name: UrlLogService
 * @description: log日志记录服务
 * @author: StarFall
 * @data: 2019年2月23日下午10:45:08
 */
@Service
public class UrlLogService {

	@Autowired
	private UrlLogMapper urlLogMapper;

	/**
	 * 记录log
	 * 
	 * @param log
	 *            UrlLog
	 */
	@Transactional(rollbackFor = Exception.class)
	public void addLog(UrlLog log) {
		urlLogMapper.insertSelectiveGetId(log);
	}

	/**
	 * 更新log
	 * 
	 * @param log
	 *            UrlLog
	 */
	@Transactional(rollbackFor = Exception.class)
	public void updateLog(UrlLog log) {
		urlLogMapper.updateByPrimaryKeySelective(log);
	}
}
