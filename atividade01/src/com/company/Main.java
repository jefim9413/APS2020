package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);
        Produto produto;
        RevendaComArray revenda = new RevendaComArray(10);
        int opc ,codigo, quantidade;
        System.out.println(" 1ºCriar Produto 2ºComprar 3ºVender \n 4ºConsultar Preço 5ºListar Preços e Alterar atributos 6ºSair\n");
        opc = ler.nextInt();

        do{
            switch (opc){
                case 1:
                    System.out.println("Informe os Atibutos Do Novo Produto ");
                    System.out.println("Codigo: ");
                    codigo = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Descrição: ");
                    String descricao = ler.nextLine();
                    System.out.println("Valor da Compra: ");
                    double vl_compra = ler.nextDouble();
                    System.out.println("Custo: ");
                    double custo = ler.nextDouble();
                    System.out.println("Margem De Lucro: ");
                    double margem_lucro = ler.nextDouble();
                    System.out.println("Quantidade No Estoque:");
                    int qtd_estoque = ler.nextInt();
                    produto = new Produto(codigo, descricao ,vl_compra ,custo ,margem_lucro ,qtd_estoque);
                    revenda.inserirProduto(produto);
                    break;
                case 2:
                    System.out.println("Digite O Codigo Do Produto Que Deseja Comprar :");
                    codigo = ler.nextInt();
                    System.out.println("Qual A quantidade Que Deseja Comprar");
                    quantidade = ler.nextInt();
                    revenda.comprar(codigo,quantidade);
                    break;
                case 3:
                    System.out.println("Digite O Codigo Do Produto Que Deseja Comprar :");
                    codigo = ler.nextInt();
                    System.out.println("Qual A quantidade Que Deseja Comprar");
                    quantidade = ler.nextInt();
                    revenda.comprar(codigo,quantidade);
                    break;
                case 4:
                    System.out.println("Informe o Codigo do Produto Que de Saber o Peços de Venda: ");
                    codigo = ler.nextInt();
                    revenda.consultarPrecoVenda(codigo);
                    break;
                case 5:
                    System.out.println("Informe o Codigo do Produto Que deseja editar: ");
                    codigo = ler.nextInt();
                    revenda.editeProdutos(codigo);
                    break;
                case 6:
                    System.out.println("Até Mais !!");
                    break;
                default:
                    System.out.println("opção invalida!!!");
                    break;
            }
        }while(opc != 6);
    }
}
