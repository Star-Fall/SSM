/**
 * 
 */
package com.starfall.ssm.model;

import java.io.Serializable;

/**
 * @name: 分页参数对象
 * @description: 包括页码、数据大小、排序、导航页码 等
 * @author: StarFall
 * @data: 2019年2月15日下午10:11:10
 */
public class PageParam implements Serializable {

	private static final long serialVersionUID = 1L;

	private int pageNum = 1;

	private int pageSize = 10;

	private String orderBy;

	// 导航页码 【1,2,3,4,5】
	private int navigatePages = 5;

	public PageParam() {
	}

	public PageParam(int pageNum) {
		this.pageNum = pageNum;
	}

	public PageParam(int pageNum, int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public PageParam(int pageNum, int pageSize, int navigatePages) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.navigatePages = navigatePages;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getNavigatePages() {
		return navigatePages;
	}

	public void setNavigatePages(int navigatePages) {
		this.navigatePages = navigatePages;
	}
}
