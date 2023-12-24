package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "good afternoon", "good night"};
		
		String path = "C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos 3\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		new File("C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos 3\\teste").mkdir();
	}

}
