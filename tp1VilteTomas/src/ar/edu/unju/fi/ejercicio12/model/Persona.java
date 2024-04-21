package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
    
    public Persona() {
    	
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
    
	public int calcularEdad() {
		Calendar hoy =  Calendar.getInstance();
		return hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
	}
	
	public String signoZodiacal() {
		String aux = "";
		int dia = getFechaNacimiento().get(Calendar.DATE);
		int mes = getFechaNacimiento().get(Calendar.MONTH);
		
		if((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
			aux = "Aries";
		}
		if((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
			aux = "Tauro";
		}
		if((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
			aux = "Geminis";
		}
		if((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
			aux = "Cancer";
		}
		if((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
			aux = "Leo";
		}
		if((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
			aux = "Virgo";
		}
		if((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
			aux = "Libra";
		}
		if((dia >= 23 && mes == 10) || (dia <= 22 && mes == 11)) {
			aux = "Escorpio";
		}
		if((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
			aux = "Sagitario";
		}
		if((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
			aux = "Capricornio";
		}
		if((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
			aux = "Acuario";
		}
		if((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
			aux = "Piscis";
		}
		return aux;
	}
	
	public String estacion() {
		String aux = "";
		int dia = getFechaNacimiento().get(Calendar.DATE);
		int mes = getFechaNacimiento().get(Calendar.MONTH);
		
		if (mes == 1 && dia >= 1 && dia <= 31) return aux = "Verano";
		if (mes == 2 && dia >= 1 && dia <= 28) return aux = "Verano";
		if (mes == 3 && dia >= 1 && dia <= 20) return aux = "Verano";
		if (mes == 3 && dia >= 21 && dia <= 31) return aux = "Otoño";
		if (mes == 4 && dia >= 1 && dia <= 30) return aux = "Otoño";
		if (mes == 5 && dia >= 1 && dia <= 31) return aux = "Otoño";
		if (mes == 6 && dia >= 1 && dia <= 20) return aux = "Otoño";
		if (mes == 6 && dia >= 21 && dia <= 30) return aux = "Invierno";
		if (mes == 7 && dia >= 1 && dia <= 31) return aux = "Invierno";
		if (mes == 8 && dia >= 1 && dia <= 31) return aux = "Invierno";
		if (mes == 9 && dia >= 1 && dia <= 21) return aux = "Invierno";
		if (mes == 9 && dia >= 22 && dia <= 30) return aux = "Primavera";
		if (mes == 10 && dia >= 1 && dia <= 31) return aux = "Primavera";
		if (mes == 11 && dia >= 1 && dia <= 30) return aux = "Primavera";
		if (mes == 12 && dia >= 1 && dia <= 21) return aux = "Primavera";
		if (mes == 12 && dia >= 22 && dia <= 31) return aux = "Verano";
		return aux;
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nFecha de naciminto: ").append(getFechaNacimiento().get(Calendar.YEAR));
        sb.append("-").append(getFechaNacimiento().get(Calendar.MONTH));
        sb.append("-").append(getFechaNacimiento().get(Calendar.DAY_OF_MONTH));
        sb.append("\nEdad: ").append(calcularEdad());
        sb.append("\nSigno del Zodiaco: ").append(signoZodiacal());
        sb.append("\nEstacion: ").append(estacion());
        return sb.toString();
    }
    
}
