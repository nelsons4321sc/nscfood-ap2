package com.nscworks.nscfoods.service;

import org.springframework.stereotype.Component;

import com.nscworks.nscfoods.modelo.Cliente;
import com.nscworks.nscfoods.noticacao.Notificador;


// se torna um bean gerenciável pelo spring
  @Component
public class AtivacaoClienteService {
	
	private Notificador notificador;

	
	// para injetar um bean no outro, cria-se um cosntrutor e que que recebe 
	//como parametro o notificador
	/*
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService "+ notificador);
	}
	*/
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
			
	}

}
