package ejfor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int suma = 0;
		float media = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe un numero: ");
			int num = sc.nextInt();

			suma += num;
			
		}
		media = suma / 10;
		System.out.println("La media de estos: " + media);

	}

}
