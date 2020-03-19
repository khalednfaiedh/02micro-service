package com.org.id.micro02.proxy;

 
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@RibbonClient(name = "micro01")
@FeignClient(name = "zull-proxy")
public interface HelloServiceProxy {
	
	
	 @GetMapping("/micro01/hello")
	 String getMessageByMicro01();

}
