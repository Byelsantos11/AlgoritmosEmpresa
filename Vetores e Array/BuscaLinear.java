import java.util.Scanner; 

public class BuscaLinear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        // Vetor de números disponíveis
        int[] numero = {10, 35, 40, 89};
        int vidas = 5; // Quantidade inicial de tentativas

        //Pergunta ao usuario
        System.out.println("Digite o número que deseja encontrar:");

        int busca = scanner.nextInt();

        //Variavel booleana para acerto 
        boolean encontrado = false; 

        // Laço for-each para percorrer todos os números do vetor
        for (int num : numero) {
            
            // numero for igual a busca
            if (num == busca) { 
                System.out.println("Você acertou o número: " + num);
                encontrado = true; // Marca que encontrou
                break; // Sai do loop pois já encontrou
            } else {
                vidas--; // Diminui uma vida a cada erro
                System.out.println("Você errou o número. Vidas restantes: " + vidas);
            }
        }

        // Se terminou o loop sem encontrar
        if (!encontrado) {
            System.out.println("Fim de jogo! Você não encontrou o número.");
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
