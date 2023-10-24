package ejfor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número -->");
		num = sc.nextInt();
		
		for (int contador = 1; contador<=num; contador++) {
			System.out.println(contador);
		}
	}

}
