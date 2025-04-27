package com.lutfudolay.controller.Impl;

import org.springframework.data.domain.Pageable;

import com.lutfudolay.utils.PagerUtil;
import com.lutfudolay.utils.RestPageableRequest;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return	PagerUtil.toPageable(request);
	}
}
