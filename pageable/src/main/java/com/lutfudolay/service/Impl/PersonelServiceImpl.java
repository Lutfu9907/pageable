package com.lutfudolay.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lutfudolay.dto.DtoDepartment;
import com.lutfudolay.dto.DtoPersonel;
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

	@Override
	public List<DtoPersonel> toDTOList(List<Personel> personelList) {
		List<DtoPersonel> dtoList = new ArrayList<>();
		
		for (Personel personel : personelList) {
			DtoPersonel dtoPersonel = new DtoPersonel();
			DtoDepartment dtoDepartment = new DtoDepartment();
			
			BeanUtils.copyProperties(personel, dtoPersonel);
			BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);
			
			dtoPersonel.setDepartment(dtoDepartment);
			
			dtoList.add(dtoPersonel);
		}
		

		return dtoList;
	}

}
