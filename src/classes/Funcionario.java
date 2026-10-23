package classes;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;

    public Funcionario(String nome, int cpf, String email, 
                    String matricula, double salario){
                super(nome,cpf,email);
                this.matricula = matricula;
                this.salario = salario;
        }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario; 
    }
}
