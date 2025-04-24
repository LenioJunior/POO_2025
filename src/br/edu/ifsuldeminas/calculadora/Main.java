package br.edu.ifsuldeminas.calculadora;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o número 1");
    float n1 = sc.nextFloat();
    System.out.println("Informe o número 2");
    float n2 = sc.nextFloat();   
    executaOperacao(new Soma(n1, n2));
    executaOperacao(new Subtracao(n1, n2));

    sc.close();
  }

  public static void executaOperacao(Operacao operacao){

    if(operacao instanceof Subtracao){
      System.out.println("Subtracao");
    } else if (operacao instanceof Soma) {
      System.out.println("Soma");
    }

    float result = operacao.realizarOperacao();
    System.out.println(String.format("O resultado da operação é: %.2f", result));
  }
}
