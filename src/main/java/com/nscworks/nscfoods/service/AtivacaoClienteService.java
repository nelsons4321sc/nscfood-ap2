package com.nscworks.nscfoods.service;

import com.nscworks.nscfoods.modelo.Cliente;
import com.nscworks.nscfoods.noticacao.Notificador;


public class AtivacaoClienteService {
	
	private Notificador notificador;
	

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
			
	}

}
