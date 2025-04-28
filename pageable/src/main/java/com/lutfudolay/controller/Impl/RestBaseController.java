package com.lutfudolay.controller.Impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lutfudolay.utils.PagerUtil;
import com.lutfudolay.utils.RestPageableEntity;
import com.lutfudolay.utils.RestPageableRequest;
import com.lutfudolay.utils.RestRootEntity;

public class RestBaseController { //backend cevaplarının her zaman aynı standart yapıda olmasını sağladık (status, payload, errorMessage).

	public Pageable toPageable(RestPageableRequest request) {
		return	PagerUtil.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
	
	public <T> RestRootEntity<T> ok(T payload){
		return RestRootEntity.ok(payload);
	}
}
