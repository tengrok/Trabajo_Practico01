package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		byte numero;
		int i = 0,j = 0;
		String nombre;
		String[] array = new String[5];
		Scanner scanner = new Scanner(System.in);
		for(i = 0; i < array.length; i++) {
			System.out.println("Ingrese un nombre: ");
			nombre = scanner.next();
			array[i] = nombre;
		}
		while(j < array.length) {
			System.out.println("Nombre: "+array[j]);
			j++;
		}
		System.out.println("Tamaño del Array: "+array.length);
		do {
			System.out.println("Ingrese una posicion para eliminar(0,4): ");
			numero = scanner.nextByte();
		} while (!(numero >= 0 && numero <= 4));
		while(numero < array.length-1) {
			array[numero] = array[numero+1];
			numero++;
		}
		array[numero] = "";
		for(i = 0; i < array.length;i++) {
			System.out.println("Posicion "+i+" Nombre: "+array[i]);
		}
	}
}
