package br.edu.ifsuldeminas.formas;

public class Principal {
  public static void main(String[] args) {
    System.out.println("Formas Geométricas!");

    Retangulo retangulo = new Retangulo(4, 3);
    double areaRetangulo = retangulo.calcularArea();
    System.out.println(String.format("Área do retângulo: %f", areaRetangulo));
  }
}
