package br.edu.ifsuldeminas.encapsulamento;

public class Carro {
  private boolean ligado = false;
  private boolean parado = true;
  private double velocidadeMaxima;
  
  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  private double velocidadeAtual = 0;

  public Carro(double velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void setVelocidadeAtual(double valor){
    this.velocidadeAtual = valor;
  }

  public void acelerar(int valor){
    float aceleracao = valor / 100;
    if(!ligado){
      return;
    }
    if(parado){
      velocidadeAtual = valor;
    } else {
      velocidadeAtual = velocidadeAtual * (1 + aceleracao);
    }
  }

  public void frear(int valor){

  }

  public boolean getLigado(){
    return ligado;
  }

  public void ligar(){
    ligado = true;
  }


}
