package co.com.libisoft.mvcspringboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		model.addAttribute("saludo", saludo);
		return "index";
	}
}
