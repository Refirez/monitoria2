package classes;

public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String nomeProduto, int disponivel) {
        super("Estoque insuficiente para " + nomeProduto + ". Disponível: " + disponivel);
    }
}