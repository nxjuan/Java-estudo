package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bee_1042 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      List<Integer> list = new ArrayList<>();
	      List<Integer> lista2 = new ArrayList<>();
	      for(int i = 0; i < 3; i++){
	    	  System.out.print("->");
	        list.add(sc.nextInt());
	        lista2.add(list.get(i));
	      }
	  
	      for(int p = 0; p < 2; p++){
	        int menor = p;      
	        for(int c = p; c < 3; c++){        
	          if(list.get(p) > list.get(c)){
	            menor = c;
	          }        
	        }
	        int aux = list.get(menor);
	        list.add(menor, list.get(p));
	        list.add(p, aux);      
	      }    
	  
	      for(int i = 0; i < list.size(); i++){
	        System.out.println(list.get(i));
	      }
	      for(int j = list.size()-1; j < lista2.size(); j++){
	        System.out.println(lista2.get(j));
	      }
	}
}
