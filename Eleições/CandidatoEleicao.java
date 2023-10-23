package Eleições;

public class CandidatoEleicao {
    private int numero;
    private String nome;
    private int numeroDeVotos;

    // Construtor para inicializar os atributos
    public CandidatoEleicao(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.numeroDeVotos = 0; // Inicializa o número de votos com zero
    }

    // Métodos de acesso para os atributos
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeVotos() {
        return numeroDeVotos;
    }

    // Método para incrementar o número de votos
    public void incrementarVotos() {
        numeroDeVotos++;
    }
}



