package br.edu.ifsuldeminas.animais;

public class Main {
  public static void main(String[] args) {
    //Animal a = new Animal("");
    Cachorro c = new Cachorro("Cachorro 1");
    Gato g = new Gato("Gato");
    
    c.fazerOutraCoisa();
    emitirSom(c);
    emitirSom(g);
  }

  public static void emitirSom(Animal animal){
    animal.emiteSom();
    
    if (animal instanceof Cachorro){
      Cachorro cachorro = (Cachorro)animal;
      cachorro.fazerOutraCoisa();
    }
  }
}
