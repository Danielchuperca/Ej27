package ej27;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FuncionesEj27 {
	public static int edadDias(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(fecha,hoy);
		return dias;
	}
	
	public static int edadMeses(LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		int meses = (int) ChronoUnit.MONTHS.between(fecha,hoy);
		return meses;
	}
		
	
	


		
	

}
