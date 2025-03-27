package br.edu.ifsuldeminas.animais;


public abstract class Animal {

  private int tempoVida = 100;

  private String cpf;

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getCpf(){
    return this.cpf;
  }

  public Animal(String nome){

  }

  private void morrer(){

  }

  public void sofrerAtaque(int dano){
    tempoVida -= dano;
  }

  protected void viver(){
    tempoVida--;
    if(tempoVida == 0){
      morrer();
    }
  }

  public abstract void emiteSom();

  public void metodo(){

  }
}
