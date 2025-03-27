package br.edu.ifsuldeminas.veiculos;

public class Carro {
  private String marca;
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  private int km;
  private int numPortas;

  public int getNumPortas() {
    return numPortas;
  }

  public void setNumPortas(int numPortas) {
    this.numPortas = numPortas;
  }

  public Carro(String marca, int km){
    this.marca = marca;
    this.km = km;

    if(this.km < 0){
      System.out.println("Não é possível criar com KM menor 0");
    }
  }

  public Carro(String marca, int km, int numPortas){
    this(marca, km);
    this.numPortas = numPortas;
  }
}
