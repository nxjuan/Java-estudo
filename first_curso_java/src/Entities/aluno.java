package Entities;

import java.util.Scanner;

public class aluno {
	Scanner sc = new Scanner(System.in);
	public double notas=0;
	
	public void recebeNota() {
		for(int c=1; c<4;c++) {
			System.out.print("Insira a " + c + "° nota: ");
			notas += sc.nextDouble();
		}
	}
	
	public void resultado() {
		System.out.printf("FINAL GRADE = %.2f \n%s", notas, (notas < 60)? "FAILED\n" : "PASS");
		if(notas<60) {
			for(int c = 1; c + notas <= 60; c++) {
				if (notas + c >= 60) {
					System.out.println("MISSING " + c + " POINTS");
				}
			}
		}
	}
}
