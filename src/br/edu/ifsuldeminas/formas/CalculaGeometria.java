package br.edu.ifsuldeminas.formas;

public class CalculaGeometria {

    public double calcular(int p1, int p2, Tipos tipo){
      switch (tipo) {
        case TRIANGULO:
          return p1 * p2 / 2;
        case RETANGULO:
          return p1 * p2;
        case CIRCULO:
          return Math.PI * Math.pow(p1, 2);
        default:
          break;
      }
      return 0;
    }

}


