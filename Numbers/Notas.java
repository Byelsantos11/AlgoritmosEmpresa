package AlgoritmosEmpresa.Numbers;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de notas
        System.out.println("Digite sua nota p1:");
        double prova1 = scanner.nextDouble();

        System.out.println("Digite sua nota p2:");
        double prova2 = scanner.nextDouble();

        // Calculando a média
        double media = (prova1 + prova2) / 2;

        // Chamando o método para verificar a nota
        Verificarnota(media, scanner);
    }

    // Método que verifica a média
    public static void Verificarnota(double media, Scanner scanner) {
        if (media < 6.0) {
            System.out.println("Você não passou na primeira fase. Digite sua nota da p3:");
            double prova3 = scanner.nextDouble();
            double mediaFinal = (media + prova3) / 2;
            if (mediaFinal >= 6.0) {
                System.out.println("Aprovado!" + mediaFinal);
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Aprovado!");
        }
    }
}
