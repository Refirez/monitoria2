package classes;

public abstract class Produto {
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;

    public Produto(String codigo, String nome, double precoBase, int estoque){
          if (precoBase < 0) {
            throw new IllegalArgumentException("Preço base não pode ser negativo");
        }
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public abstract double calcularPrecoFinal();

    public String exibirResumo(){
        return codigo +  " - " + nome + ": R$ " + String.format("%.2f",calcularPrecoFinal());
    }

    public void baixarEstoque(int quantidade){
         if (quantidade <= 0 || quantidade > estoque) {
            throw new IllegalArgumentException("Quantidade inválida para baixa de estoque");
        }
        this.estoque -= quantidade;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }


    
}
