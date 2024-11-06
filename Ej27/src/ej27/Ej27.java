package ej27;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Ej27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate cumple=Funciones.dimeFecha("Escribe el dia que naciste", sc);
		int opcion=0;
		do {
			System.out.println("1-Calcular edad en d�as.");
			System.out.println("2-Calcular edad en meses");
			System.out.println("3-Mostrar edad completa (a�os, meses y d�as).");
			System.out.println("4-Calcula d�as al pr�ximo cumplea�os");
			System.out.println("0-salir");
			int numeroEntero=Funciones.dimeEntero("dime el numero", sc);
			switch (numeroEntero) {
			case 1:
				System.out.println(FuncionesEj27.edadDias(cumple)); 
			break;
			case 2:
				System.out.println(FuncionesEj27.edadMeses(cumple));
				break;
			
			case 3:
				LocalDate hoy = LocalDate.now();
                Period p = Period.between(cumple, hoy);
                System.out.println(p.getYears()+ " a�os " + p.getMonths()+  " meses "+ "y "+ p.getDays()+" dias" );
                break;
                
			case 4:
			LocalDate hoy1 = LocalDate.now();
			LocalDate cumpleEsteA�o = LocalDate.of(hoy1.getYear(),10,28);
			LocalDate CumpleA�oSiguiente=cumpleEsteA�o.plusYears(1);
			int contdias = (int) ChronoUnit.DAYS.between(hoy1,CumpleA�oSiguiente);
			System.out.println(contdias);

	
				


			default:
				break;
			}
			
			
			
			
			
		}while(opcion!=0);

	}
	

	
}


