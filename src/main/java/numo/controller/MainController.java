package numo.controller;

import numo.common.constants.SessionAttrs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {

	@RequestMapping(value = "main.do")
	public ModelAndView main(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pv", "main");
		mv.setViewName("main");
		return mv;
	}

}
