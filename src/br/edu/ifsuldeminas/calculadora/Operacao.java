package br.edu.ifsuldeminas.calculadora;

public abstract class Operacao {
  
  private float numero1;
  private float numero2;

  public float getNumero1(){
    return numero1;
  }

  public float getNumero2(){
    return numero2;
  }

  public Operacao(float n1, float n2){
    numero1 = n1;
    numero2 = n2;
  }

  public abstract float realizarOperacao();
}
