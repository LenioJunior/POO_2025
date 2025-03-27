package br.edu.ifsuldeminas;

import br.edu.ifsuldeminas.animais.Animal;

public class Gato extends Animal {

  public Gato(String nome) {
      super(nome);
    }
  
    public void emiteSom() {
    System.out.println("miau");
  }
  
}
