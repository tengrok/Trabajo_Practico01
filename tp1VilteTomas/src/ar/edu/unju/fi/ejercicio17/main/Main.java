package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner sc;
	private static List<Jugador> jugadores;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		jugadores = new ArrayList<>();
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
				case 1: cargarJugador(); break;
				case 2: mostrar();
				break;
				case 8:System.out.println("Fin del programa");
				break;
			default:System.out.println("Opcion incorreta");
			}
		} while (opcion != 8);
		
		
		/**for(int i = 0; i < jugadores.size(); i++) {
			if(jugadores.get(i) instanceof Jugador) System.out.println(jugadores.get(i));
		}*/
	}
	
	public static int menu() {
		int respuesta;
		System.out.println("1_ Alta jugador: ");
		System.out.println("2_ Mostrar datos del jugador: ");
		System.out.println("3_ Jugadores ordenados por apellido: ");
		System.out.println("4_ Modificar datos del jugador: ");
		System.out.println("5_ Eliminar un jugador: ");
		System.out.println("6_ Mostrar cantidad de jugadores: ");
		System.out.println("7_ Misma nacionalidad: ");
		System.out.println("8_ Salir: ");
		System.out.println("Elija una opcion: ");
		respuesta = sc.nextInt();
		sc.nextLine();
		sc.close();
		return respuesta;
	}
	
	public static void cargarJugador() {
		
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.next();
		System.out.println("Ingrese el apellido: ");
		String apellido = sc.next();
		System.out.println("Ingrese el dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.println("Ingrese el mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.println("Ingrese el año de nacimiento: ");
		int anio = sc.nextInt();
		System.out.println("Ingrese su nacionalidad: ");
		String nacionalidad = sc.next();
		System.out.println("Ingrese su estatura: ");
		float altura = sc.nextInt();
		System.out.println("Ingrese su peso: ");
		float peso = sc.nextInt();
		System.out.println("Ingrese su posicion: ");
		String posicion = sc.next();
		jugadores.add(new Jugador(nombre,apellido,LocalDate.of(anio, mes, dia),nacionalidad,altura,peso,posicion));
	}
	
	public static void mostrar() {
		System.out.println("##### Lista de Jugadores #####");
		jugadores.forEach(j->System.out.println(j));
	}
	
}
