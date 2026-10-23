package classes;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            // 1. subtotal = itens + frete (aqui o "endereco" do cliente guarda o CEP)
            double subtotal = carrinho.calcularTotal()
                            + carrinho.calcularFreteTotal(cliente.getEndereco());

            // 2. desconto VIP
            if (cliente instanceof ClienteVip) {
                double desconto = ((ClienteVip) cliente).getPercentualDesconto();
                subtotal = subtotal - subtotal * desconto;
            }

            // 3. valor final com a forma de pagamento (pode lançar PagamentoRecusadoException)
            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            // 4. 1 ponto a cada R$ 10,00 pagos
            cliente.adicionarPontos((int) (valorFinal / 10));

        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}