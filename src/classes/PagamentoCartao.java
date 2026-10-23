package classes;

public class PagamentoCartao implements Pagamento {
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override
    public double calcularValorFinal(double valor) {
        double valorFinal = valor;
        if (parcelas > 3) {
            valorFinal = valor + valor * 0.08;   // acréscimo de 8%
        }
        if (valorFinal > limite) {
            throw new PagamentoRecusadoException(
                "Pagamento recusado: valor acima do limite do cartão");
        }
        return valorFinal;
    }

    @Override
    public String getDescricao() { return "Cartão em " + parcelas + "x"; }

    public int getParcelas() { 
        return parcelas; 
    }

    public void setParcelas(int parcelas) { 
        this.parcelas = parcelas; 
    }

    public double getLimite() { 
        return limite; 
    }

    public void setLimite(double limite) { 
        this.limite = limite; 
    }
}