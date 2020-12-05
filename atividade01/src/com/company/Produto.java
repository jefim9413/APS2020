package com.company;

public class Produto {
    private int codigo;
    private String descricao;
    private double vl_compra;
    private double custo;
    private double margem_lucro;
    private int qtd_estoque;

    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro, int qtd_estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_estoque = qtd_estoque;
    }

    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }


    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void comprar(int quantidade){
        this.qtd_estoque +=quantidade;
    }

    public void vender(int quantidade){
        this.qtd_estoque -=quantidade;
    }

    double calculaPreçoVenda(){
        return vl_compra + custo + margem_lucro*(vl_compra+custo);
    }

    public double getVl_compra() {
        return vl_compra;
    }

    public void setVl_compra(double vl_compra) {
        this.vl_compra = vl_compra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
