package ordenador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ordenador {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("ingrese numeros enteros");
		for(int i=0; i<5; i++) {
		int n = leer.nextInt();
			numeros.add(n);
	} 
		System.out.println("ordenado de mayor a menor:");
		Collections.sort(numeros);
		numeros.forEach(System.out::println);

		
		//System.out.print(numeros);
		
}
}
