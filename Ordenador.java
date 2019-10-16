package ordenador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenador {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Cuantos numeros desea ingresar?");
		int c = leer.nextInt();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("Ingrese " +c + " numeros enteros!");
		for (int i = 0; i < c; i++) {
			int n = leer.nextInt();
			numeros.add(n);
		}
		System.out.println("ordenado de menor a mayor:");
		Collections.sort(numeros);
		numeros.forEach(System.out::println);

		// System.out.print(numeros);

	}
}
