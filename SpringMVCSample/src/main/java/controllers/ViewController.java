package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewController {
	@RequestMapping(path = "/",method = RequestMethod.GET)
		public ModelAndView demo() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("home");
			return mv;
	}

}
