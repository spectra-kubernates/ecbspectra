package com.ecb.controller;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EcbController {
	
	@Autowired
	private Configproperty configproperty;
	
	List<EcbRequest> list =new ArrayList<>();
	
	{
		list.add(new EcbRequest(1l,new BigDecimal(50000),1l, "05/05/2021"));
	}
	
	@PostMapping("/save")
	public String saveEcb(@RequestBody EcbRequest req) throws Exception {
		list.add(req);	
		
		if(req.getEcbid()==null) {
			throw new Exception(configproperty.getError());
		}
		return "success";
	}

	
	
	@GetMapping("/ecbs")
	public List<EcbRequest> saveEcb() {
		return list;	
	}
	
	
	
	
}
