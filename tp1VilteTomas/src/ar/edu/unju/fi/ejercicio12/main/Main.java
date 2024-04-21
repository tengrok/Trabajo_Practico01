package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		Calendar fecha = Calendar.getInstance();
		
		System.out.println("Ingrese  su nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese  su Dia de Nacimiento: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese  su Mes de Nacimiento: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese  su Año de Nacimiento: ");
		int anio = scanner.nextInt();
		fecha.set(anio, mes, dia);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fecha);
		System.out.println(persona);
		
		
	}
}
