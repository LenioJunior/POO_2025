package br.edu.ifsuldeminas.encapsulamento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tests {

  @Test
  public void testNewCarroCorrida() {
    float velocidadeMaxima = 100;
    CarroCorrida c1 = new CarroCorrida(1, "Carlos", "POO1", velocidadeMaxima);

    assertFalse("O carro deve estar desligado!", c1.isLigado());
    assertTrue("O carro deve estar parado!", c1.isParado());
    c1.acelerar(0.3);
    assertEquals(c1.getVelocidadeAtual(), 0, 0);
    c1.ligar();
    assertTrue("O carro deve estar ligado!", c1.isLigado());
    c1.acelerar(0.3);
    assertEquals(c1.getVelocidadeAtual(), 30, 0);
    c1.acelerar(1000);
    assertEquals((double)velocidadeMaxima, (double)c1.getVelocidadeAtual(), 0);
  }

}
