package Boletim;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Boletim {

	public static void main(String[] args) {
		
		List<Double> bimestre1 = new ArrayList<Double>(4);
		List<Double> bimestre2 = new ArrayList<Double>(4);
		List<Double> bimestre3 = new ArrayList<Double>(4);
		List<Double> bimestre4 = new ArrayList<Double>(4);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------- BOLETIM ---------------\n");

		System.out.println("Informe as notas do 1º bimestre");
		double notas1 = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.printf("Informe a %dª nota: ", i);
			double nota1 = scanner.nextDouble();
			bimestre1.add(nota1);
			notas1 += nota1;
		} 
		double media1 = notas1/4;
		System.out.println("Sua média no 1º bimestre é " + media1);
		
		//----------------------------------------------------------
		
		System.out.println("\nInforme as notas do 2º bimestre");
		double notas2 = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.printf("Informe a %dª nota: ", i);
			double nota2 = scanner.nextDouble();
			bimestre2.add(nota2);
			notas2 += nota2;
		} 
		double media2 = notas2/4;
		System.out.println("Sua média no 2º bimestre é " + media2);
		
		//----------------------------------------------------------
		
		System.out.println("\nInforme as notas do 3º bimestre");
		double notas3 = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.printf("Informe a %dª nota: ", i);
			double nota3 = scanner.nextDouble();
			bimestre3.add(nota3);
			notas3 += nota3;
		} 
		double media3 = notas3/4;
		System.out.println("Sua média no 3º bimestre é " + media3);
		
		//----------------------------------------------------------
		
		System.out.println("\nInforme as notas do 4º bimestre");
		double notas4 = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.printf("Informe a %dª nota: ", i);
			double nota4 = scanner.nextDouble();
			bimestre4.add(nota4);
			notas4 += nota4;
		} 
		double media4 = notas4/4;
		System.out.println("Sua média no 4º bimestre é " + media4);
		
		//----------------------------------------------------------
		
		System.out.println("\n	       1º    2º    3º    4º    FINAL");
		System.out.print("1º bimestre | ");
		for (Double bimestre : bimestre1) {
			System.out.printf("%.1f   ", bimestre);
		}
		System.out.printf("  %.1f\n", media1);
		
		System.out.print("2º bimestre | ");
		for (Double bimestre : bimestre2) {
			System.out.printf("%.1f   ", bimestre);
		}
		System.out.printf("  %.1f\n", media2);
		
		System.out.print("3º bimestre | ");
		for (Double bimestre : bimestre3) {
			System.out.printf("%.1f   ", bimestre);
		}
		System.out.printf("  %.1f\n", media3);
		
		System.out.print("4º bimestre | ");
		for (Double bimestre : bimestre4) {
			System.out.printf("%.1f   ", bimestre);
		}
		System.out.printf("  %.1f", media4);

	}

}
