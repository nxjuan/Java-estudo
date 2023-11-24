package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee_1175 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> list = new ArrayList<>();

	    for(int i = 0; i < 3; i++){
	      // System.out.print("->");
	      list.add(sc.nextInt());
	    }
	    
	    for(int j = list.size() - 1, i = 0; j >= 0; j--, i++){
	        System.out.println("N[" + i + "] = " + list.get(j));
	     }
	}

}
