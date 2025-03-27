package br.edu.ifsuldeminas;

import br.edu.ifsuldeminas.animais.Animal;

public class Cachorro extends Animal {
  
  public Cachorro(String nome){
    super(nome);
  }

  public void emiteSom(){
    viver();
    System.out.println("Au au");
  }
}
