package co.com.libisoft.mvcspringboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.com.libisoft.mvcspringboot.model.PersonaEntity;
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
	
	@GetMapping("/agregar")
	public String agregar(Model model) {
		model.addAttribute("persona", new PersonaEntity());
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(PersonaEntity persona) {
		service.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(PersonaEntity persona,Model model) {
		persona=service.encontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(PersonaEntity persona,Model model) {
		service.eliminar(persona);
//		model.addAttribute("persona", persona);
		return "redirect:/";
	}
}
