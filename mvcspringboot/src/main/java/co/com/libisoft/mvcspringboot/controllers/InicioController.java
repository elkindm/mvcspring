package co.com.libisoft.mvcspringboot.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.libisoft.mvcspringboot.domain.Persona;
/**
 * 
 * @author elkin
 *
 */

@Controller
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
		
		var persona2=new Persona();
		persona2.setNombre("libi");
		persona2.setApellido("Duran");
		persona2.setEmail("gerenacia@libisoft.com.co");
		persona2.setTelefono("3214170011");
		
//		List<Persona> personas= new ArrayList();
//		personas.add(persona);
//		personas.add(persona2);
		
		var personas= Arrays.asList(persona,persona2);
		
		model.addAttribute("saludo", saludo);
		model.addAttribute("cliente", persona);
		model.addAttribute("clientes", personas);
		return "index";
	}
}
