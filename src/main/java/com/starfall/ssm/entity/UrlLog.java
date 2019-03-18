package com.starfall.ssm.entity;

import java.util.Date;

/**
 * @name:UrlLog
 * @description: UrlLog
 * @author: StarFall
 * @data: 2019年3月18日下午9:10:52
 */
public class UrlLog {

	private Integer id;

	private Date creatTime;

	private String opName;

	private Integer opId;

	private String requestUrl;

	private String requestMethod;

	private String requestParams;

	private String responseStatus;

	private String controllerName;

	private String controllerMethod;

	private String costTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName == null ? null : opName.trim();
	}

	public Integer getOpId() {
		return opId;
	}

	public void setOpId(Integer opId) {
		this.opId = opId;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl == null ? null : requestUrl.trim();
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod == null ? null : requestMethod.trim();
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams == null ? null : requestParams.trim();
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus == null ? null : responseStatus.trim();
	}

	public String getControllerName() {
		return controllerName;
	}

	public void setControllerName(String controllerName) {
		this.controllerName = controllerName == null ? null : controllerName.trim();
	}

	public String getControllerMethod() {
		return controllerMethod;
	}

	public void setControllerMethod(String controllerMethod) {
		this.controllerMethod = controllerMethod == null ? null : controllerMethod.trim();
	}

	public String getCostTime() {
		return costTime;
	}

	public void setCostTime(String costTime) {
		this.costTime = costTime == null ? null : costTime.trim();
	}
}