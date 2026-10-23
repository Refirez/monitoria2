package classes;

public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;
    private String cepDestino = "";

    public ProdutoFisico(String codigo, String nome, double precoBase,
                         int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + getPrecoBase() * 0.10;
    }

    @Override
    public double calcularFrete(String cep) {
        this.cepDestino = cep;
        return 15.0 + 2.0 * pesoKg;
    }

    @Override
    public int prazoEntregaDias() {
        return cepDestino.startsWith("6") ? 7 : 12;
    }

    public double getPesoKg() { return pesoKg; }
    public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg; }
}