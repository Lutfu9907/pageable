package com.lutfudolay.controller;

import com.lutfudolay.dto.DtoPersonel;
import com.lutfudolay.utils.RestPageableEntity;
import com.lutfudolay.utils.RestPageableRequest;
import com.lutfudolay.utils.RestRootEntity;

public interface IRestPersonelController {

	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageableRequest);
}
