package com.lutfudolay.utils;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestRootEntity <T>{//backend cevaplarının her zaman aynı standart yapıda olmasını sağladık (status, payload, errorMessage).

	private Integer status;
	
	private T payload;
	
	private String errorMessage;
	
	public static <T> RestRootEntity <T> ok(T payload) {
		
		RestRootEntity<T> rootEntity = new RestRootEntity<>();
		rootEntity.setStatus(HttpStatus.OK.value());
		rootEntity.setErrorMessage(null);
		rootEntity.setPayload(payload);
		
		return rootEntity;
	}
}
