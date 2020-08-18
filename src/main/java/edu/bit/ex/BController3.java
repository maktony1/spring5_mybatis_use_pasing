package edu.bit.ex;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.bit.ex.board3.Bservice3;

@Controller
public class BController3 {
	
	@Inject
	Bservice3 bservice;
	
	@RequestMapping("/list3")
	public String home(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
}
 