package Lista_2;

import java.util.Scanner;

public class Atividade_5 {
	
public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int contador_numeros_positivos = 0;
		
		
		
	    do {
            System.out.println("Digite um número:");
            numero = lerScanner.nextInt();

            if (numero > 0) {
                soma += numero;
                contador_numeros_positivos++;
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);
       
        lerScanner.close();
    }
}
