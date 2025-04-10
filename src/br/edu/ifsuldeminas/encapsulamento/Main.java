package br.edu.ifsuldeminas.encapsulamento;

public class Main {
  public static void main(String[] args) {
    CarroCorrida carroCorrida1 = new CarroCorrida(1, "Carlos", "POO1", 100);
    CarroCorrida carroCorrida2 = new CarroCorrida(2, "Carlos", "POO1", 100);

    System.out.println(carroCorrida1);

    carroCorrida1.desligar();
    carroCorrida1.acelerar(0.3);
    carroCorrida1.isLigado();
    carroCorrida1.ligar();
    carroCorrida1.isLigado();
    carroCorrida1.acelerar(1111110.3);
    System.out.println(String.format("Velocidade Atual: %f", carroCorrida1.getVelocidadeAtual()));
    carroCorrida1.acelerar(0.3);
    System.out.println(String.format("Velocidade Atual: %f", carroCorrida1.getVelocidadeAtual()));
    carroCorrida1.acelerar(1.3);
    System.out.println(String.format("Velocidade Atual: %f", carroCorrida1.getVelocidadeAtual()));
    carroCorrida1.acelerar(188888.3);
    System.out.println(String.format("Velocidade Atual: %f", carroCorrida1.getVelocidadeAtual()));

    carroCorrida1.acelerar(188888.3);
    System.out.println(String.format("Velocidade Atual: %f", carroCorrida1.getVelocidadeAtual()));
    
    
    System.out.println(String.format("Equals: %B",  carroCorrida1.equals(carroCorrida2)));
    System.out.println(String.format("Equals: %B",  carroCorrida1.equals(carroCorrida1)));
    System.out.println(String.format("Equals: %B",  carroCorrida1.equals(null)));

    carroCorrida1.acelerar(1.2);
  }
}
