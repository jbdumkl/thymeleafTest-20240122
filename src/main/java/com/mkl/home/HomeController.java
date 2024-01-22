package com.mkl.home;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {

	@GetMapping(value = "/hello")
	public String hello(Model model) {
		
		model.addAttribute("member", "홍길동");
		
		return "hello";
	}
	
	@GetMapping(value = "/hyperTest")
	public String hyper() {
		return "hyperTest";
	}
	
	@GetMapping(value = "hyperResult")
	public String hyperResult() {
		
	}
	
	
	@GetMapping(value = "/iftest")
	public String iftest(Model model) {
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		for(int i=1; i<=10; i++) {
			MemberDto memberDto = new MemberDto();
			memberDto.setId("tiger"+i);
			memberDto.setName("길동")
		}
	}
}
