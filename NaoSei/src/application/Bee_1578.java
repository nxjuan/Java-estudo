package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee_1578 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("numero de matrizes: ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int area = sc.nextInt();
			Integer[][] mat = new Integer[area][area];
			for(int l = 0; l < area; l++) {
				for(int c = 0; c < area ; c++) {
					mat[l][c] = sc.nextInt();
				}
			}
			//list.get(0) = mat;
		}
	}
}
