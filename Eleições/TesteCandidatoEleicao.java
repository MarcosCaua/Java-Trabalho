package Eleições;

public class TesteCandidatoEleicao {
    public static void main(String[] args) {
        // Crie um candidato com número e nome de sua escolha
        CandidatoEleicao candidato = new CandidatoEleicao(1, "João Candidato");

        // Exiba o número e nome do candidato e o número de votos inicial
        System.out.println("Candidato: " + candidato.getNome());
        System.out.println("Número do Candidato: " + candidato.getNumero());
        System.out.println("Número de Votos Inicial: " + candidato.getNumeroDeVotos());

        // Incremente um voto
        candidato.incrementarVotos();

        // Exiba o número de votos atualizado
        System.out.println("Número de Votos Atualizado: " + candidato.getNumeroDeVotos());
    }
}
