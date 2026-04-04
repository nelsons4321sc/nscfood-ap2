package com.nscworks.nscfoods.noticacao;

import org.springframework.stereotype.Component;
import com.nscworks.nscfoods.modelo.Cliente;

// se torna um bean gerenciável pelo spring
@Component
public class Notificador {
	
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
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
