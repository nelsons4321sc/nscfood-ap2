package com.nscworks.nscfoods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nscworks.nscfoods.noticacao.NotificadorEmail;

// é para servir como definição de beans
@Configuration
public class AlgaConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.nscmail.com");
		notificador.setCaixaAlta(true);
		
		return notificador;
		
	}
	
	

}
