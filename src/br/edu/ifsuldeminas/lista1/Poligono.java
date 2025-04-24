package br.edu.ifsuldeminas.lista1;

/*
 * Em uma classe Poligono os lados de um polígono podem ser armazenados em um atributo
double lados[]. Defina a classe Poligono e seu atributo lados. No construtor da
classe, receba como parâmetro o número de lados do polígono e então crie o objeto vetor que
servirá para guardar os tamanhos dos lados. Faça um método denominado setLado(int i,
double tamanhoLado) que configura para o lado i o tamanho tamanhoLado. 
Faça um método para calcular e retornar o perímetro do polígono. Defina uma classe Main e dentro da
classe o método main. Crie um objeto Poligono, leia os tamanhos dos lados do objeto com
um objeto da classe Scanner e configure o tamanho do lado chamando o método setLado.
Em seguida, armazene em uma variável o valor do perímetro (chamando o método que calcula o
perímetro) e, por último, imprima o valor do perímetro.
 */

public class Poligono {

  private double lados[];

  public Poligono(int lados){
    this.lados = new double[lados];
  }

  public double[] getLados() {
    return lados;
  }

  public void informarLados(int indice, double tamanhoLado) {
    if (indice < 0 || indice >= this.lados.length) {
      return;
    }

    this.lados[indice] = tamanhoLado;
  }

  public double calcularPerimetro() {
    double perimetro = 0;

    for (double v : lados) {
      perimetro += v;
    }

    return perimetro;
  }
}

