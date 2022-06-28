package com.shopnobazz.blooddoante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopnobazz.blooddoante.domain.User;
import com.shopnobazz.blooddoante.service.MemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	@Autowired
	MemberService memberService;
@RequestMapping("/all")
public String viewmember(Model model) {
	List<User> member = memberService.findAll();
	
	model.addAttribute("member",member);
	return "member";
	
}
# this code added for github tesing
system.outprintlin('This for fahim test')
for(i=0, i<10; i++){
	system.out.println('ferfrfr')
}
this is for develop branch new;
}
