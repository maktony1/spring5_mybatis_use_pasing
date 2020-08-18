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
import edu.bit.ex.board2.Bservice2;
import edu.bit.ex.board3.Bservice3;
import edu.bit.ex.board4.Bservice4;

@Controller
public class BController4 {
	
	@Inject
	Bservice4 bservice;
	
	@RequestMapping("/list4")
	public String home(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
}
 