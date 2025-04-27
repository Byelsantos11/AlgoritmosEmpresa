import java.util.Arrays;

public class BubleSort {

     public static void main(String[] args) {

            int[] numeros = {10, 5, 5, 40, 35, 80, 11, 6};

        Arrays.sort(numeros);

        System.out.println("Vetor organizado:");


        for(int num : numeros){
            System.out.println(num + "");
        }
     }}
