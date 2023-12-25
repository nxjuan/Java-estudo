package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Items;

public class Program {

	public static void main(String[] args) {
		File input = new File("C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos exercicio\\input.csv");
		File output = new File("C:\\Users\\jxavier\\eclipse-workspace\\Trabalhando com Arquivos exercicio\\summary.csv");
		Locale.setDefault(Locale.US);
		List<Items> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(input)); BufferedWriter bw = new BufferedWriter(new FileWriter(output))){
			String line = br.readLine();
			while(line != null) {
				String temp[] = new String[3];
				temp = line.split(",");
				System.out.println(temp[0]);
				String name = temp[0];
				System.out.println(temp[1]);
				double price = Double.valueOf(temp[1]);
				System.out.println(temp[2]);
				int quantity = Integer.parseInt(temp[2]);
				list.add(new Items(name, price, quantity));
				line = br.readLine();
			}
			for(Items i : list) {
				bw.write(i.getName() + "," + (String.format("%.2f", i.getPrice()* i.getQuantity())));
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
