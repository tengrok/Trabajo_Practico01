package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		int[] elementos = new int[8];
		Scanner scanner = new Scanner(System.in);
		while (i < elementos.length) {
			System.out.println("Ingrese una valor para la matris: ");
			int numero = scanner.nextInt();
			elementos[i] = numero;
			i++;
		}
		for(i=0 ;i < elementos.length;i++) {
			System.out.println("elementos en la posicion "+i+" = "+elementos[i]);
		}
		
	}
}
