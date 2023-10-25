package ejfor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double nota;
		int suspensos = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe una nota: ");
			nota = sc.nextDouble();
			if (nota < 5) {
				suspensos++;
			}
		}
		if (suspensos > 0) {
			System.out.println("Hay " + suspensos + " suspensos.");
		} else {
			System.out.println("No hay suspensos.");

		}
	}

}
