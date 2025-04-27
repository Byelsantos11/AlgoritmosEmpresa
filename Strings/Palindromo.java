import java.util.Scanner; 

public class Palindromo {
    public static void main(String[] args) {
        // Cria o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número:");
        int numero = scanner.nextInt(); 

        // Converte o número para String para poder inverter
        String numOriginal = Integer.toString(numero);

        // Inverte a String usando StringBuilder e o método reverse()
        String invertido = new StringBuilder(numOriginal).reverse().toString();

        // Compara o número original com o número invertido
        if (numOriginal.equals(invertido)) {
           
            // Se forem iguais, é um palíndromo
            System.out.println("Número " + numero + " é palíndromo.");
        } else {
            
            // Se forem diferentes, não é um palíndromo
            System.out.println("Número " + numero + " não é palíndromo.");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

