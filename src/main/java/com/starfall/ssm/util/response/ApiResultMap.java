package com.starfall.ssm.util.response;

import java.util.HashMap;

/**
 * @name: ApiResultMap
 * @description: 接口返回结果Map
 * @author: StarFall
 * @data: 2019年2月21日下午11:03:10
 */
public class ApiResultMap<K, V> extends HashMap<K, V> {

	private static final long serialVersionUID = -2480998907522164671L;

	public ApiResultMap<K, V> add(K key, V value) {
		super.put(key, value);
		return this;
	}

}