package co.com.libisoft.mvcspringboot.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.libisoft.mvcspringboot.dao.IPersonaDao;
import co.com.libisoft.mvcspringboot.domain.Persona;
/**
 * 
 * @author elkin
 *
 */

@Controller
public class InicioController {

	
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(InicioController.class);
	
	@Autowired
	private IPersonaDao personaDao;
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		log.info("controller iniciao index");
		var personas=personaDao.findAll();
		model.addAttribute("clientes", personas);
		return "index";
	}
}
