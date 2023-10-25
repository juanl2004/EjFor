package ejfor;

public class Ejercicio6 {

	public static void main(String[] args) {

		int num = 0;
		int suma = 0;
		for (int i = 0; i < 20; i++) {
			num = i;
			
			if (num % 2 != 0) {
				suma += num;

			}
		}
		System.out.println("La suma de los 10 primeros números impares es --> " + suma);
	}

}
