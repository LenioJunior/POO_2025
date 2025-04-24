package br.edu.ifsuldeminas.calculadora;

public class Soma extends Operacao {

  public Soma(float x1, float x2){
    super(x1, x2);
  }

  public Soma(int p1, int p2){
    super(p1, p2);
  }

  @Override
  public float realizarOperacao() {
    return getNumero1() + getNumero2();
  }

  public void fazAlgoDaSoma(){
    
  }
  
}
