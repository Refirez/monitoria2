package main;
import classes.*;

public class Main {
    public static void main(String[] args) throws EstoqueInsuficienteException {
        ClienteVip cliente = new ClienteVip("Ana", "Bernardo@gmail.com", 111, "60000-000", 0.10);
        System.out.println(cliente);

        ProdutoFisico teclado = new ProdutoFisico("F01", "Teclado", 100.0, 5, 0.8);
        ProdutoDigital ebook  = new ProdutoDigital("D01", "E-book Java", 50.0, 999, 12);
        Assinatura streaming  = new Assinatura("S01", "Streaming", 20.0, 999, 6);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(teclado);
        carrinho.adicionar(ebook);
        carrinho.adicionar(streaming);

        Pedido pedido = new Pedido(cliente, carrinho);

        System.out.println("--- Tentativa 1: Pix ---");
        pedido.finalizar(new PagamentoPix());

        System.out.println("--- Tentativa 2: Cartão 6x, limite baixo ---");
        pedido.finalizar(new PagamentoCartao(6, 100.0));

        System.out.println("Pontos de fidelidade: " + cliente.getPontosFidelidade());
    }
}