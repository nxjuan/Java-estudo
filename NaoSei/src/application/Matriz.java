package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of columns");
		int c = sc.nextInt();
		System.out.println("enter the number of lines");
		int l = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		System.out.println();
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j <c ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Number: ");
		int num = sc.nextInt();
		
		List<Integer> posX = new ArrayList<>();
		List<Integer> posY = new ArrayList<>();;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j <c ; j++) {
				if(mat[i][j] == num) {
					posX.add(i);
					posY.add(j);
				}
			}
		}
		
		for(int v = 0; v < posX.size(); v++) {
			System.out.println();
			System.out.println("Position: " + posX.get(v) + ", " + posY.get(v));
			System.out.println();
			
			
			if(posY.get(v) - 1 > 0) {
				System.out.println("Left: " + mat[posX.get(v)][posY.get(v) - 1]);
			}
			else {
				System.out.println("Left: ");
			}
			if(posX.get(v) - 1 > 0) {
				System.out.println("Up: " + mat[posX.get(v) - 1][posY.get(v)]);
			}
			else {
				System.out.println("Up: ");
			}
			if(posY.get(v) + 1 < l) {
				System.out.println("Right: " + mat[posX.get(v)][posY.get(v) + 1]);
			}
			else {
				System.out.println("Right: ");
			}
			if(posX.get(v) + 1< c) {
				System.out.println("Down: " + mat[posX.get(v) + 1][posY.get(v)]);
			}
			else {
				System.out.println("Down: ");
			}
		}		
	}
}
