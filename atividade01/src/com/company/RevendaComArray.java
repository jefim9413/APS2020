package com.company;
import  java.util.Scanner;
public class RevendaComArray {
    private Produto[] produtos;
    private int indece;
    Scanner ler = new Scanner(System.in);
    RevendaComArray(int quantidade){
        this.produtos = new Produto[quantidade];
        this.indece = 0;
    }

    void inserirProduto(Produto produto){
        this.produtos[indece] = produto;
        this.indece +=1;
    }

    void comprar(int codigo,int quantidade){
        int aux = 0;
        for (Produto i: this.produtos) {
            if(i.getCodigo() == codigo){
                i.comprar(quantidade);
                aux = 1;
            }
        }
        if(aux == 0){
            System.out.println("Este Produto nâo existe !!!");
        }
    }
    void vender(int codigo,int quantidade){
        int aux = 0;
        for (Produto i: this.produtos) {
            if(i.getCodigo() == codigo){
                i.vender(quantidade);
                aux = 1;
            }
        }
        if(aux == 0){
            System.out.println("Este Produto nâo existe !!!");
        }
    }

    void consultarPrecoVenda(int codigo){
        int aux = 0;
        for (Produto i: this.produtos) {
            if(i.getCodigo() == codigo){
                System.out.println(i.getVl_compra());
                aux = 1;
            }
        }
        if(aux == 0){
            System.out.println("Este Produto nâo existe !!!");
        }
    }
    void listaPreco(){
        for (Produto i : this.produtos) {
            if(i != null)
                System.out.println("\n Codigo : " + i.getCodigo() +" \n Descrição: " + i.getDescricao() +" \n Valor de Venda: "+ i.getMargem_lucro());
        }
    }
    void editeProdutos(int codigo){
        int aux = 0;
        for (Produto i: this.produtos) {
            if(i.getCodigo() == codigo){
                System.out.println("Informe os Novos valores Para os Atributos");
                System.out.println("Valor Da Compra: ");
                int valorCompra = ler.nextInt();
                System.out.println("Custo: ");
                double custo = ler.nextDouble();
                System.out.println("Lucro: ");
                double lucro = ler.nextDouble();
                i.setVl_compra(valorCompra);
                i.setCusto(custo);
                i.setMargem_lucro(lucro);
                aux = 1;
            }
        }
        if(aux == 0){
            System.out.println("Este Produto nâo existe !!!");
        }
    }
}
