package com.lutfudolay.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lutfudolay.model.Personel;
import com.lutfudolay.repository.PersonelRepository;
import com.lutfudolay.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService {

	@Autowired
	private PersonelRepository personelRepository;
	
	@Override
	public Page<Personel> findAllPageable(Pageable pageable) {
		
		 Page<Personel> page = personelRepository.findAllPageable(pageable);
		 return page;
	}

}
