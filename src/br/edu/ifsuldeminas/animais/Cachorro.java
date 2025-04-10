package br.edu.ifsuldeminas.animais;

public class Cachorro extends Animal {
  
  public Cachorro(String nome){
    super(nome);
  }

  public void emiteSom(){
    viver();
    System.out.println("Au au");
  }

  public void fazerOutraCoisa(){
    System.out.println("Estou fazendo outra coisa");
  }
}
