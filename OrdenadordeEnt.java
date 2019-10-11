package ordenadordeenteros;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class OrdenadordeEnt {
		public static void main(String[] args) {
			int c=0;
			Scanner le = new Scanner(System.in);
			 
			System.out.println("cuantos numeros desea ingresar");
			c = le.nextInt();
		Scanner leer = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("ingrese numeros enteros");
		for(int i=0; i<c; i++) {
		int n = leer.nextInt();
			numeros.add(n);
		} 
			System.out.println("ordenado de menor a meyor:");
			Collections.sort(numeros);
			numeros.forEach(System.out::println);

			//
			//System.out.print(numeros);
			
	}
	}