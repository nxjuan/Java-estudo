package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException{		
		
		DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Coment c1 = new Coment("Have a nice trip");
		Coment c2 = new Coment("Wow, that's awesome!");
		LocalDate d1 = LocalDate.parse("12/06/2018 15:05:44")
		
		Post p1 = new Post(
				LocalDate.parse(d1, dfmt),
				"Taveling to new Zeland",
				"I'm going to visit this wonderful country",
				14
		);
		
		Coment c3 = new Coment("z");
		Coment c4 = new Coment("z");
		Coment c5 = new Coment("z");
		
		
	}

}
