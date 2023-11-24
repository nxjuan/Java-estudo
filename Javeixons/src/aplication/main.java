package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Dados;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    System.out.print("How many employees will be registerd? ");
    int n = sc.nextInt();
    Dados nome = new Dados();
    List<Dados> funcionarios = new ArrayList<>();
    
    
    
    sc.close();
  }
}
