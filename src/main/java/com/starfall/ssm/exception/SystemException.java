package com.starfall.ssm.exception;

/**
 * @name: SystemException
 * @description: 自定义的异常类型
 * @author: StarFall
 * @data: 2019年2月23日下午6:56:32
 */
public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 2015291587058337140L;

	public SystemException() {
		super();
	}

	public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(Throwable cause) {
		super(cause);
	}

}
