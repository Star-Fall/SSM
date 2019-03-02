package com.starfall.ssm.util.response;

/**
 * @name: ApiResult
 * @description: 接口返回结果枚举
 * @author: StarFall
 * @data: 2019年2月21日下午10:19:41
 */
public enum ApiResult {

	SUCCESS(200, "响应成功"), ERROR(400, "系统错误");

	private final int code;

	private final String msg;

	private ApiResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * 获取返回结果Map
	 * 
	 * @return
	 */
	public ApiResultMap<String, Object> getMap() {
		return new ApiResultMap<String, Object>().add("code", this.getCode()).add("msg", this.getMsg());
	}

	public ApiResultMap<String, Object> getMap(String errMsg) {
		return new ApiResultMap<String, Object>().add("code", this.getCode()).add("msg", this.getMsg()).add("errMsg",
				errMsg);
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
