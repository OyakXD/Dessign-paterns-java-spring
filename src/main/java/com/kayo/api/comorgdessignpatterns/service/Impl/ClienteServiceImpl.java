package com.kayo.api.comorgdessignpatterns.service.Impl;

import com.kayo.api.comorgdessignpatterns.model.Cliente;
import com.kayo.api.comorgdessignpatterns.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    // TODO Singleton: Injetar os componentes Spring com @Autowired
    // TODO Strategy: Implementar a interface ClienteService
    // TODO Facade: Implementar a lógica de negócio de ClienteService

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
