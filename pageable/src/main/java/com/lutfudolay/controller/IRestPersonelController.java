package com.lutfudolay.controller;

import org.springframework.data.domain.Page;

import com.lutfudolay.model.Personel;
import com.lutfudolay.utils.RestPageableRequest;

public interface IRestPersonelController {

	Page<Personel> findAllPageable(RestPageableRequest pageableRequest);
}
