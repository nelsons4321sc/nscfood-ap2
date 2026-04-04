package com.nscworks.nscfoods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nscworks.nscfoods.modelo.Cliente;
import com.nscworks.nscfoods.service.AtivacaoClienteService;

@Controller
public class PrimeiroController {
	
	// Injetando o bean
	//private AtivacaoClienteService ativacaoClienteService;
	/*	
	public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("PrimeiroController: "+ ativacaoClienteService);
	}
*/


	@GetMapping("ola")
	@ResponseBody
	public String hello() {
		
		//Cliente joao = new Cliente("João", "joao@gmail.com","32565985");
		
		// ativacaoClienteService.ativar(joao);
		
		return "Olá";
	}

}
