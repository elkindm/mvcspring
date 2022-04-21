package co.com.libisoft.mvcspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author elkin
 *
 */

@RestController
@Slf4j
public class InicioController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(InicioController.class);
	
	@GetMapping("/")
	public String inicio() {
		log.info("message");
		log.debug("prueba");
		return "Hola mundo  mvc Spring";
	}
}
