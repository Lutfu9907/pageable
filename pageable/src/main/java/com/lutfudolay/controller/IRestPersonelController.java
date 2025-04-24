package com.lutfudolay.controller;

import org.springframework.data.domain.Page;

import com.lutfudolay.model.Personel;

public interface IRestPersonelController {

	Page<Personel> findAllPageable(int pageNumber, int pageSize);
}
