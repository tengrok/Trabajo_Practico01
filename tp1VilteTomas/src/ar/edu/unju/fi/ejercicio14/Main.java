package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numero;
		int suma = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ingrese el tamaño de la matriz(3,10): ");
			numero = scanner.nextInt();
		} while(!(numero >= 3 && numero <= 10));
		int[] elementos = new int[numero];
		while(i < elementos.length) {
			System.out.println("Ingrese un  valor para la matriz");
			numero = scanner.nextInt();
			elementos[i] = numero;
			suma = suma + elementos[i];
			i++;
		}
		for(i=0; i < elementos.length; i++) {
			System.out.println("elemtos en la posicion "+i+" = "+elementos[i]);
		}
		System.out.println("Suma: "+suma);
	}
}
