package com.lutfudolay.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lutfudolay.dto.DtoPersonel;
import com.lutfudolay.model.Personel;

public interface IPersonelService {

	Page<Personel>  findAllPageable(Pageable pageable);
	
	List<DtoPersonel> toDTOList(List<Personel> personelList);
}