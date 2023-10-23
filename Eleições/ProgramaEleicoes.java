package Eleições;

import java.util.Scanner;
import java.util.ArrayList;

public class ProgramaEleicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CandidatoEleicao> candidatos = new ArrayList<>();

        System.out.print("Quantos candidatos participarão da eleição? ");
        int quantidadeCandidatos = scanner.nextInt();

        for (int i = 0; i < quantidadeCandidatos; i++) {
            System.out.print("Informe o número do candidato: ");
            int numeroCandidato = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha

            System.out.print("Informe o nome do candidato: ");
            String nomeCandidato = scanner.nextLine();

            candidatos.add(new CandidatoEleicao(numeroCandidato, nomeCandidato));
        }

        System.out.print("Quantos votos serão lidos em sequência? ");
        int quantidadeVotos = scanner.nextInt();

        for (int i = 0; i < quantidadeVotos; i++) {
            System.out.print("Informe o número do candidato que recebeu o voto: ");
            int numeroCandidato = scanner.nextInt();

            // Encontre o candidato com o número informado
            CandidatoEleicao candidato = encontrarCandidatoPorNumero(candidatos, numeroCandidato);

            if (candidato != null) {
                candidato.incrementarVotos();
            } else {
                System.out.println("Número de candidato inválido: " + numeroCandidato);
            }
        }

        // Listar todos os candidatos e seus votos
        System.out.println("Resultados da eleição:");
        for (CandidatoEleicao candidato : candidatos) {
            System.out.println("Número: " + candidato.getNumero() + " - Nome: " + candidato.getNome() + " - Votos: " + candidato.getNumeroDeVotos());
        }

        scanner.close();
    }

    // Método para encontrar um candidato por número
    private static CandidatoEleicao encontrarCandidatoPorNumero(ArrayList<CandidatoEleicao> candidatos, int numero) {
        for (CandidatoEleicao candidato : candidatos) {
            if (candidato.getNumero() == numero) {
                return candidato;
            }
        }
        return null; // Retorna null se o candidato não for encontrado
    }
}
