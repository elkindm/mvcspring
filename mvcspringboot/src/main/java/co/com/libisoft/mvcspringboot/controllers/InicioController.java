package co.com.libisoft.mvcspringboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.libisoft.mvcspringboot.service.IPersonaService;
/**
 * 
 * @author elkin
 *
 */

@Controller
public class InicioController {

	
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(InicioController.class);
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		log.info("controller iniciao index");
		var personas=service.listarPersonas();
		model.addAttribute("clientes", personas);
		return "index";
	}
}
