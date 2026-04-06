package com.nscworks.nscfoods.noticacao;

import org.springframework.stereotype.Component;

import com.nscworks.nscfoods.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	
	public NotificadorEmail() {
		System.out.println("Chamando o construtor Notificador");
	}
	

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
