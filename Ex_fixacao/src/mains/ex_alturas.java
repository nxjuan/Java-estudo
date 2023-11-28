package mains;

import java.util.Scanner;

import P.alturas;

public class ex_alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas?: ");
		int n = sc.nextInt();
		alturas[] pessoa = new alturas[n];	
		double med = 0;
		double sub16 = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();			
			pessoa[i] = new alturas(nome, idade, altura);
		}
		
		for(int i = 0; i < n; i++) {
			med += pessoa[i].getAltura();
			if(pessoa[i].getIdade() < 16) {
				sub16 += 1;
			}
		}
		System.out.printf("A media das alturas é de: %.2f", med/n);
		System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", (sub16/n)*100);
		for(int i = 0; i < n; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();
	}

}
