package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.board1.Bservice;

@Controller
public class BController {
	
	@Inject
	Bservice bservice;
	
	@RequestMapping("/list")
	public String home(Model model) throws Exception {
		System.out.println("list()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
}
