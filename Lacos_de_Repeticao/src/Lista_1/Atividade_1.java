package Lista_1;

import java.util.Scanner;

public class Atividade_1 {
	
	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número:" );
		numero1 = lerScanner.nextInt();
		
		System.out.println("Digite o segundo número");
		numero2 = lerScanner.nextInt();
		
		if (numero1 >= numero2) {
			
			System.out.println ("Intervalo inválido!");
			
			} else {
				
				System.out.println("Múltiplos de 3 e 5 no intervalo:");
			
			for(int x =numero1; x <= numero2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println(x + " é múltiplo de 3 e 5");
				}
			}
		}
		
		
		
		
	}

	}

