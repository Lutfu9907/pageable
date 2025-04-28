package com.lutfudolay.controller.Impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lutfudolay.utils.PagerUtil;
import com.lutfudolay.utils.RestPageableEntity;
import com.lutfudolay.utils.RestPageableRequest;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return	PagerUtil.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
}
