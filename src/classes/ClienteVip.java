package classes;

public class ClienteVip extends Cliente{
    private double percentualDesconto;

    public ClienteVip(String nome, String email,int cpf, 
        String endereco, double percentualDesconto){
        super(nome, email, cpf, endereco);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto(){
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public String toString(){
        return super.toString() + "| VIP (" + Math.round(percentualDesconto * 100) + "%)";
    }
}
