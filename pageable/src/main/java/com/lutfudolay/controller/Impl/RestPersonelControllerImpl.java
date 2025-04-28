package com.lutfudolay.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lutfudolay.controller.IRestPersonelController;
import com.lutfudolay.dto.DtoPersonel;
import com.lutfudolay.model.Personel;
import com.lutfudolay.service.IPersonelService;
import com.lutfudolay.utils.RestPageableEntity;
import com.lutfudolay.utils.RestPageableRequest;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController{

	@Autowired
	private IPersonelService personelService;
	
	@GetMapping("/list/pageable")
	@Override
	public  RestPageableEntity<DtoPersonel> findAllPageable(RestPageableRequest pageable) {
		
		 Page<Personel> page = personelService.findAllPageable(toPageable(pageable));
		 RestPageableEntity<DtoPersonel> pageableResponse = toPageableResponse(page,personelService.toDTOList(page.getContent()));
		 
		 return pageableResponse;
	}
}
