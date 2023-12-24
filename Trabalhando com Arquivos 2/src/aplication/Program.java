package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos 1\\ina.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		// Instanciar um bufferedReader usando um filereader torna a leitura de arquivos mais
		// obtimizada já que o bufferedReader usa buffer de memoria
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
