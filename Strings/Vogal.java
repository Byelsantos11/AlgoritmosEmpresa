package Strings;
import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {

        // Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Contador inicial em 0
        int contador = 0;

        // Digitação de frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();

        // Loop por todas as letras da frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            // If para verificar se possui vogal e incrementar no contador
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        // Impressão do resultado após o loop
        if (contador > 0) {
            System.out.println("Quantidade de vogais: " + contador);
        } else {
            System.out.println("Não existe nenhuma vogal.");
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
