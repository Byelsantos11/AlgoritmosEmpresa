public class Vetor {

    public static void main(String[] args) {
        
        //Vetor numeros
        int[] numeros = {10, 5, 30, 80 , 90};

        //Soma em 0
        int soma = 0;

        //Loop for somando todos os numeros
        for(int num : numeros){
            soma += num;
        }

        //Variavel que possui a média
        double media = soma / numeros.length;

        //Respostas
        System.out.println("Numero total do vetor:" + soma);
        System.out.println("Media do Vetor:" + media);
    }    
}
