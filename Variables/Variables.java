package AlgoritmosEmpresa.Variables;

public class Variables {
    
    // Definindo as variáveis com tipos básicos
    String nome; // Variável para armazenar texto (String)
    Boolean a = false; // Variável booleana (True ou False)
    int numero; // Variável para armazenar números inteiros
    double numeros; // Variável para armazenar números com ponto flutuante (decimais)

    // Método principal para demonstrar como usar as variáveis
    public static void main(String[] args) {

        // Criando uma instância da classe Variables
        Variables variaveis = new Variables();

        // Atribuindo valores para as variáveis
        variaveis.nome = "Gabryel";
        variaveis.a = true; // Atribuindo valor 'true' para a variável booleana
        variaveis.numero = 10;
        variaveis.numeros = 3.14;

        // Exibindo os valores das variáveis
        System.out.println("Nome: " + variaveis.nome);
        System.out.println("Valor da variável booleana (a): " + variaveis.a);
        System.out.println("Número inteiro: " + variaveis.numero);
        System.out.println("Número com vírgula (double): " + variaveis.numeros);
    }
}
