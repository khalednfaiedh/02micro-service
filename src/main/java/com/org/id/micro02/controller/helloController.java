package com.org.id.micro02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.id.micro02.model.micro02Bean;
import com.org.id.micro02.proxy.HelloServiceProxy;

@RestController
public class helloController {
	
	@Autowired
	private  HelloServiceProxy helloServiceProxy;
	
	@GetMapping("/hello")
	public  micro02Bean home()
	{
		micro02Bean bean = new micro02Bean();
		
		bean.setMessageMicro01(helloServiceProxy.getMessageByMicro01());
		bean.setMessageMicro02("hello with micro 2");
		return bean;
		
	}

}
