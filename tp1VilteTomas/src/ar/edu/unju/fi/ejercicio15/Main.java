package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numero;
		String nombre;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el tamaño de la matriz(5,10): ");
			numero = scanner.nextInt();
		} while(!(numero >= 5 && numero <= 10));
		
		String[] elementos = new String[numero];
		
		while(i < elementos.length) {
			System.out.println("Ingrese un nombre: ");
			nombre = scanner.next();
			elementos[i] = nombre;
			i++;
		}
		System.out.println("\nMuestra los elementos de la matriz desde posicion 0 a la ultima");
		for(i=0; i < elementos.length; i++) {
			System.out.println("Nombre en la posicion "+i+" = "+elementos[i]);
		}
		System.out.println("\nMuestra los elementos de la matriz desde la ultima posicion a la 0");
		for(i = elementos.length-1; i >= 0; i--) {
			System.out.println("Nombre en la posicion "+i+" = "+elementos[i]);
		}
	}
}
