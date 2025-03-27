package br.edu.ifsuldeminas.formas;

public class Retangulo extends Geometria{
  
  private int base;

  private int altura;

  public Retangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double calcularArea(){
    return this.base * this.altura;
  }
}
