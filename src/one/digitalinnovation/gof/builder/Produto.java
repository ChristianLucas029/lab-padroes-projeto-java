package one.digitalinnovation.gof.builder;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    private Produto(ProdutoBuilder builder) {
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.descricao = builder.descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public static class ProdutoBuilder {
        private String nome;
        private double preco;
        private String descricao;

        public ProdutoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ProdutoBuilder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public ProdutoBuilder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Produto build() {
            return new Produto(this);
        }
    }
}

