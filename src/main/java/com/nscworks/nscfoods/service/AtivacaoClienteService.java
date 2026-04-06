package com.nscworks.nscfoods.service;

import com.nscworks.nscfoods.modelo.Cliente;
import com.nscworks.nscfoods.noticacao.Notificador;


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
