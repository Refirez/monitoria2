package classes;

public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String endereco, String nome, int cpf, String email){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }

    public void adicionarPontos(int pontos){
        if(pontos > 0){
            pontosFidelidade += pontos;
        }
        else{
            System.out.println("o valor precisa ser maior que zero");
            return;
        }
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getPontosFidelidade(){
        return pontosFidelidade;
    }
}