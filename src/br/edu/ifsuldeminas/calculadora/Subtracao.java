package br.edu.ifsuldeminas.calculadora;

public class Subtracao extends Operacao {


  /**
   * @param y1
   * @param y2
   */
  public Subtracao(float y1, float y2){
    super(y1, y2);
  }

  @Override
  public float realizarOperacao() {
    return getNumero1() - getNumero2();  
  }
  
  public void fazAlgoDaSubtracao(){
    
  }
}
