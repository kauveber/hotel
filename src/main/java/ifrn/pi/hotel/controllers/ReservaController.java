package ifrn.pi.hotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservaController {

	@RequestMapping("/reserva")
	public String index() {
		return "reserva/reserva";
	}
	
}
