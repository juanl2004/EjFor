package ejfor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num;
		int mult = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número: ");
		num = sc.nextInt();

		for (int i = 1; i<=num; i++) {
			mult = mult*i;
		}
		System.out.println("El factorial es: " + mult);

	}

}
