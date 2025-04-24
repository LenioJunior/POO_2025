package br.edu.ifsuldeminas.lista1;

import java.util.Scanner;

/*
 * Defina uma classe Main e dentro da classe o método main. 
 * Crie um objeto Poligono, leia os tamanhos dos lados do objeto com um objeto da classe Scanner 
 * e configure o tamanho do lado chamando o método setLado.
Em seguida, armazene em uma variável o valor do perímetro (chamando o método que calcula o
perímetro) e, por último, imprima o valor do perímetro.
 */

public class Main {
  public static void main(String[] args) throws Exception {
    Poligono poligono = new Poligono(3);
    
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println(String.format("Informar o valor do lado '%d'", i + 1));
      double valor = sc.nextDouble();
      poligono.informarLados(i, valor);
    }
    double perimetro = poligono.calcularPerimetro();
    String message = String.format("O valor do perímetro é: %.2f", perimetro);
    System.out.println(message);
    sc.close();
  }

  public static void runEx(Ex ex){
    ex.run();
  }
}
