package co.com.libisoft.mvcspringboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.libisoft.mvcspringboot.domain.Persona;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author elkin
 *
 */

@Controller
@Slf4j
public class InicioController {

	@Value("${index.saludo}")
	private String saludo;
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(InicioController.class);
	
	@GetMapping("/")
	public String inicio(Model model) {
		log.info("message "+saludo);
		var persona=new Persona();
		persona.setNombre("elkin");
		persona.setApellido("Duran");
		persona.setEmail("gerenacia@libisoft.com.co");
		persona.setTelefono("3214170011");
		model.addAttribute("saludo", saludo);
		model.addAttribute("cliente", persona);
		return "index";
	}
}
