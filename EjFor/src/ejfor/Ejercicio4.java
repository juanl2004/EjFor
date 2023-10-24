package ejfor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero --> ");
		num = sc.nextInt();
		
		for (int contador = 0; contador <= num; contador += 1) {
			
			if (contador) {
				System.out.println("" + contador);
			}
		}

	}

}
