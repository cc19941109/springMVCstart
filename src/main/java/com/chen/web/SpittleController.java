package com.chen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.chen.repository.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private SpittleRepository spittleRespository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRespository){
		this.spittleRespository = spittleRespository;
	}

	@RequestMapping(method =RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(
				spittleRespository.findSpittles(Long.MAX_VALUE, 20));
		return "spilttes";
	}
}
