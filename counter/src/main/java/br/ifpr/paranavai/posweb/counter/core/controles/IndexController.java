package br.ifpr.paranavai.posweb.counter.core.controles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	public Integer counter = 0;
	
	@GetMapping("contador")
	public ModelAndView receberParametro(Model model) {
		ModelAndView mavw = new ModelAndView("CounterIndex");
		counter +=1;
		model.addAttribute("access", counter);
		mavw.addObject(model);
		return mavw;
		
	}
}


