package br.edu.ifsuldeminas.formas;

public class Triangulo extends Geometria {

  private int base;
  private int altura;

  public Triangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
  }

  public double calcularArea() {
    return (this.base * this.altura) / 2;
  }
  
}
