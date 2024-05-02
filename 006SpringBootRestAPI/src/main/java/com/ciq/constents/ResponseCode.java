package com.ciq.constents;

public enum ResponseCode {

	CREATED(201), UPDATED(202), DELETED(203), OK(200), NOTFOUND(404);

	ResponseCode(int code) {
		this.code = code;
	}

	public final Integer code;

}
