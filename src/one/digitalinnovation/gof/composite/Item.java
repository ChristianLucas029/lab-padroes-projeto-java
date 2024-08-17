package one.digitalinnovation.gof.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    public abstract void exibir();
}

class ProdutoSimples extends Item {
    private String nome;

    public ProdutoSimples(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println(nome);
    }
}

class Caixa extends Item {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    @Override
    public void exibir() {
        for (Item item : itens) {
            item.exibir();
        }
    }
}
