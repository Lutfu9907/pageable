package com.lutfudolay.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lutfudolay.model.Personel;

public interface IPersonelService {

	Page<Personel>  findAllPageable(Pageable pageable);
}
