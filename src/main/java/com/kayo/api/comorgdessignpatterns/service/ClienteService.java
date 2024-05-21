package com.kayo.api.comorgdessignpatterns.service;

import com.kayo.api.comorgdessignpatterns.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no dominio de cliente. Com isso,
 * se necessário, podemos ter várias implementações de serviço de cliente.
 * @Author OyakXD
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
