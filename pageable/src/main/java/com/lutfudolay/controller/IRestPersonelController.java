package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoPersonel;
import com.lutfudolay.utils.RestPageableEntity;
import com.lutfudolay.utils.RestPageableRequest;

public interface IRestPersonelController {

	public RestPageableEntity<DtoPersonel> findAllPageable(RestPageableRequest pageableRequest);
}
