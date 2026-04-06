package com.nscworks.nscfoods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nscworks.nscfoods.noticacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.nscmail.com");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}
