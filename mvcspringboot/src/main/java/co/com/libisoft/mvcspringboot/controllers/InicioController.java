package co.com.libisoft.mvcspringboot.controllers;

import org.springframework.stereotype.Controller;
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

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(InicioController.class);
	
	@GetMapping("/")
	public String inicio() {
		log.info("message");
		return "index";
	}
}
