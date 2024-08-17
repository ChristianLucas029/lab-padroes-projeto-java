package one.digitalinnovation.gof.observer;

import java.util.ArrayList;
import java.util.List;

interface Observador {
    void atualizar(String mensagem);
}

class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }
}

class Loja {
    private List<Observador> clientes = new ArrayList<>();

    public void adicionarCliente(Observador cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Observador cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes(String mensagem) {
        for (Observador cliente : clientes) {
            cliente.atualizar(mensagem);
        }
    }
}
