package classes;

public class ClienteVip extends Cliente{
    private double percentualDesconto = 0.10;

    public ClienteVip(double percentualDesconto,int pontosFidelidade, String endereco, String nome, String email, int cpf){
        super(nome,email,cpf,endereco,pontosFidelidade);
    }
}
