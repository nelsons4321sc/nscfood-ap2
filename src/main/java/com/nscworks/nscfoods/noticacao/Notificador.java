package com.nscworks.nscfoods.noticacao;

import com.nscworks.nscfoods.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}