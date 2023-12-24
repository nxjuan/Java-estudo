package aplication;

import java.io.File;


public class Program {

	public static void main(String[] args) {
		
		File path = new File("C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos 1\\in.txt");
		
		System.out.println("Nome do arquivo: " + path.getName());
		System.out.println("Nome da pasta: " + path.getParent());
		System.out.println("Nome do caminho todo: " + path.getPath());
	}

}
