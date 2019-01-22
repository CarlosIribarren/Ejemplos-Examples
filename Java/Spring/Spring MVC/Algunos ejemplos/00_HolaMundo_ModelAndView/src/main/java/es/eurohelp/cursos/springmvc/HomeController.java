package es.eurohelp.cursos.springmvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Gestiona las peticiones de la p�gina home de la aplicaci�n.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView home() {
		System.out.println("HomeController: procesando petici�n...");
		
        String now = (new Date()).toString();
        ModelAndView modelAndView = new ModelAndView("WEB-INF/jsp/home.jsp");
        modelAndView.addObject("now",now);
        
        return modelAndView;
		
	}
	
	
}
