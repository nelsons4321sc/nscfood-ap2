package com.nscworks.nscfoods.noticacao;


import org.springframework.stereotype.Component;

import com.nscworks.nscfoods.modelo.Cliente;

@Component
public class Notificador {
	
	public Notificador() {
		System.out.println("Chamando o construtor com bean gerenciável");

	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

	
	// private boolean caixaAlta;
	// private String hostServidorSmtp;
	
/*
	public Notificador(Cliente cliente, String mensagem) {
		//this.hostServidorSmtp = hostServidoerSmtp;
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		
		
	}
	
	/*
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s usando o SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	*/
	

}
