package pe.edu.upn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Medico")
public class MedicoController {
	
	@GetMapping
	public String inicio() {
		return "cualquiera";		
	}

}
