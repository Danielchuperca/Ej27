package ej27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funciones {
	public static boolean esInt(String num1) {
		try {
		int num=Integer.parseInt(num1);
		return true;
		}catch (Exception ex) {
			return false;
		}
	}
	public static boolean esDouble(String num1) {
		try {
		double num=Double.parseDouble(num1);
		return true;
		}catch (Exception ex) {
			return false;
		}
	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {
		try {
		
		System.out.println(texto);
		String s1=sc.nextLine();
		int num=Integer.parseInt(s1);
		return num;
		}catch (Exception ex) {
			System.out.println("formato incorrecto");
		}
		
		}while(true);
		}
	public static double dimeDouble(String texto, Scanner sc) {
		do {
		try {
		System.out.println(texto);
		String s1=sc.nextLine();
		double num=Double.parseDouble(s1);
		return num;
		}catch (Exception ex) {
			System.out.println("Formato incorrecto");
		}
	}while(true);
		

}
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		do {
			try {
		System.out.println(texto);
		String s=sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha=LocalDate.parse(s, formato);

		return fecha;
		
		}catch(Exception ex) {
			System.out.println("introduce bien la fecha");
			
		}
		}while(true);

	}
}
