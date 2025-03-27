package br.edu.ifsuldeminas.formas;

public class Circulo extends Geometria {

  private float raio;

  public float getRaio() {
    return raio;
  }

  public void setRaio(float raio) {
    this.raio = raio;
  }

  public Circulo(float raio){
    this.raio = raio;
  }

  public double calcularArea() {
    return Math.PI * Math.pow(this.raio, 2);
  }
  
}
