package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException{		
		
		DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Coment c1 = new Coment("Have a nice trip");
		Coment c2 = new Coment("Wow, that's awesome!");
		String data1 =  "12/06/2018 15:05:44";
		LocalDateTime d1 = LocalDateTime.parse(data1, dfmt);
		
		Post p1 = new Post(
				d1,
				"Taveling to new Zeland",
				"I'm going to visit this wonderful country",
				14
		);
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		Coment c3 = new Coment("Good night!");
		Coment c4 = new Coment("May the force be with you!");
		
		String data2 =  "28/07/2018 23:14:19";
		LocalDateTime d2 = LocalDateTime.parse(data2, dfmt);
		
		Post p2 = new Post(
				d2,
				"Good night guys", 
				"See you tomorrow",
				5
		);
		
		p2.addComent(c3);
		p2.addComent(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
