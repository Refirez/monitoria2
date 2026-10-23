package classes;

public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade = 0;

    public Cliente(String endereco, int pontosFidelidade, String nome, int cpf, String email){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = pontosFidelidade;
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

    

    @Override
    public String toString(){
        return "Endereco :" + endereco + "| Pontos de Fidelidade: " + pontosFidelidade;
    }
}