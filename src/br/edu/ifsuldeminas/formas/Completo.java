//package br.edu.ifsuldeminas.formas;
// Classe abstrata Forma
// public abstract class Forma {
//   protected String cor;

//   public Forma(String cor) {
//       this.cor = cor;
//   }

//   public abstract double calcularArea(); // Método abstrato

//   public void exibirCor() { // Método concreto
//       System.out.println("Cor da forma: " + cor);
//   }
// }

// // Classe concreta para Retângulo
// class Retangulo extends Forma {
//   private double largura;
//   private double altura;

//   public Retangulo(String cor, double largura, double altura) {
//       super(cor);
//       this.largura = largura;
//       this.altura = altura;
//   }

//   @Override
//   public double calcularArea() {
//       return largura * altura;
//   }
// }

// // Classe concreta para Círculo
// class Circulo extends Forma {
//   private double raio;

//   public Circulo(String cor, double raio) {
//       super(cor);
//       this.raio = raio;
//   }

//   @Override
//   public double calcularArea() {
//       return Math.PI * raio * raio;
//   }
// }

// // Classe Principal para demonstrar
// public class Main {
//   public static void main(String[] args) {
//       // Criando instâncias das formas
//       Forma retangulo = new Retangulo("Azul", 5.0, 3.0);
//       Forma circulo = new Circulo("Vermelho", 4.0);

//       // Usando métodos da classe abstrata e implementados nas subclasses
//       System.out.println("Retângulo:");
//       retangulo.exibirCor();
//       System.out.println("Área: " + retangulo.calcularArea());

//       System.out.println("\nCírculo:");
//       circulo.exibirCor();
//       System.out.println("Área: " + circulo.calcularArea());
//   }
//}