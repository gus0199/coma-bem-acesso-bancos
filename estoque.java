package com.comabem.model;

public class Estoque {
    private int idEstoque;
    private Produto produto;
    private double quantidade;

    public Estoque(int idEstoque, Produto produto, double quantidade) {
        this.idEstoque = idEstoque;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getIdEstoque() { return idEstoque; }
    public void setIdEstoque(int idEstoque) { this.idEstoque = idEstoque; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public double getQuantidade() { return quantidade; }
    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Estoque de " + produto.getNome() + ": " + quantidade + " " + produto.getUnidadeMedida();
    }
}
