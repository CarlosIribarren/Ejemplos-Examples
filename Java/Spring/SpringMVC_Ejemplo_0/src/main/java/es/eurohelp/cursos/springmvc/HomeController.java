package es.eurohelp.cursos.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Gestiona las peticiones de la p�gina home de la aplicaci�n.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController: procesando petici�n...");
		return "home";
	}
}
