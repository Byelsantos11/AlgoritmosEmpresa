package AlgoritmosEmpresa.Numbers;
public class numerosPares {
    public static void main(String[] args) {

        // Array de números
        int[] numeros = { 1, 2, 3, 4, 5, 6 };

        // Contadores de pares e ímpares
        int pares = 0;
        int impares = 0;

        // Loop para verificar cada número (Par ou ímpar)
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;  // Incrementa a quantidade de pares
            } else {
                impares++;  // Incrementa a quantidade de ímpares
            }
        }

        // Imprimir a quantidade total de pares e ímpares após o loop
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
