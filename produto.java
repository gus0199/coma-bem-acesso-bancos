package com.comabem.model;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private String unidadeMedida;

    public Produto(int idProduto, String nome, double preco, String unidadeMedida) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.unidadeMedida = unidadeMedida;
    }

    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " (" + unidadeMedida + ")";
    }
}
