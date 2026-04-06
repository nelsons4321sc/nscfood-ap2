package com.nscworks.nscfoods.noticacao;

import com.nscworks.nscfoods.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
		System.out.println("Chamando o construtor Notificador");
	}
	

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do email %s, usando SMTP %s: %s\n",
				cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
