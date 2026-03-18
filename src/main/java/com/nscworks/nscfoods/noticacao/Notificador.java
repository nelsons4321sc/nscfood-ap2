package com.nscworks.nscfoods.noticacao;

import org.springframework.stereotype.Component;
import com.nscworks.nscfoods.modelo.Cliente;

// se torna um bean gerenciável pelo spring
@Component
public class Notificador implements Notificar {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	

	public Notificador(String hostServidoerSmtp) {
		this.hostServidorSmtp = hostServidoerSmtp;
		System.out.println("Notificador");
	}
	
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
	
	

}
