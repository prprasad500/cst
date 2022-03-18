package com.slokam.java.jdp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller2 {
	@GetMapping("inputdata")
	public String inputdata(String Str) {
		
		Str = Str+"Extradata";
		
		return Str;		
	}
	@GetMapping("inputdata2")
	public String inputdata2(String str,Integer value) {
		
		str = str+"ExtraData"+value;
		return str;
		
	} 
	@GetMapping("inputdata234")
public String inputdata3(@RequestParam("reqstr") String str,
		@RequestParam("reqint")Integer value) {
	
	str = str+"ExtraData"+value;
	//
	return str;
}
	@GetMapping("index")
	public String inputdata() {
		return "index.jsp";		
	}
}
