package com.nscworks.nscfoods.noticacao;

import com.nscworks.nscfoods.modelo.Cliente;

public interface Notificar {

	void notificar(Cliente cliente, String mensagem);

}