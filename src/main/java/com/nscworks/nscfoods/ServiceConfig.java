package com.nscworks.nscfoods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nscworks.nscfoods.noticacao.Notificador;
import com.nscworks.nscfoods.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
