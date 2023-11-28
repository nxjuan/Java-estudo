package mains;

import java.util.Scanner;

import P.quartos;

public class pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?: ");
		int n = sc.nextInt();
		quartos[] morador = new quartos[10];
		
		for(int c = 0; c < n; c++) {
			System.out.printf("Dados da %iª pessoa", c+1);
			System.out.print("Name: ");
			String nome = "juan";//sc.next();
			System.out.print("Email: ");
			String email = "pedregoso";//sc.next();
			System.out.print("Quarto: ");
			int quarto = c;//sc.nextInt();
			morador[quarto - 1] = new quartos(quarto, nome, email);
		}
		
		for(int c = 0; c < 10; c++) {
			if(morador[c].getNome() == null) {

			}	
			else {
				System.out.print(c + ": " + morador[c].getNome());
				System.out.print(", " + morador[c].getEmail());
			}
		}
		sc.close();		
	}
}
