package com.nscworks.nscfoods.service;

import org.springframework.stereotype.Component;

import com.nscworks.nscfoods.modelo.Cliente;
import com.nscworks.nscfoods.noticacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("Chamando o construtor AtivacaoClienteService "+ notificador);
	}
	

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
			
	}

}
