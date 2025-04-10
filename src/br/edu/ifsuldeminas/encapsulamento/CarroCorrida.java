package br.edu.ifsuldeminas.encapsulamento;

public class CarroCorrida{

  private int numeroCarro;
  private String piloto;
  private String equipe;
  private float velocidadeMaxima;
  private float velocidadeAtual;
  private boolean ligado;

  public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima){
    this.numeroCarro = numeroCarro;
    this.piloto = piloto;
    this.equipe = equipe;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public double getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(double velocidadeAtual) {
    this.velocidadeAtual = (float)velocidadeAtual;
  }
 
  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public String getPiloto() {
    return this.piloto;
  }

  public void setPiloto(String piloto) {
    this.piloto = piloto;
  }

  public String getEquipe() {
    return equipe;
  }

  public void setEquipe(String equipe) {
    this.equipe = equipe;
  }

  public int getNumeroCarro() {
    return numeroCarro;
  }

  public void setNumeroCarro(int numeroCarro) {
    this.numeroCarro = numeroCarro;
  }

  public boolean isLigado() {
    System.out.println(String.format("IsLigado: %B", ligado));
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isParado() {
    System.out.println(String.format("IsParado: %B", ligado));
    return velocidadeAtual == 0;
  }

  public void ligar(){
    if(ligado){
      System.out.println("O carro já está ligado!");
      return;
    } 
    
    ligado = true;
  }

  public void desligar(){
    if(!ligado){
      System.out.println("O carro já está desligado!");
      return;
    } 
    
    ligado = false;
  }

  /**
   * Utilize este método para aumentar a velocidade do carro de corrida
   * 
   * @param valor  Indica o percentual de incremento da velocidade. Informar no formato 0.3 (Incrementa 30% da velocidade)
   * @param ligado Indica se o veículo está ligado ou não
   */
  public void acelerar(double porcentagem) {
  // Caso o carro estiver ligado, acelera o
  // veículo em certa porcentagem (modifica a variável velocidadeAtual). O valor da
  // velocidade atual nunca poderá ser maior que o de sua velocidade máxima. Se o carro
  // estiver parado, o carro ganha como velocidade inicial o equivalente à porcentagem de sua
  // velocidade máxima.
    if(!ligado){
      System.out.println("O carro não está ligado. Não é possível acelerar.");
      return;
    }

    if(velocidadeAtual == velocidadeMaxima){
      System.out.println("O carro já está na velocidade máxima. Não é possível acelerar.");
      return;
    }

    if(isParado()){
      velocidadeAtual = (float)(velocidadeMaxima * porcentagem);
      if (velocidadeAtual > velocidadeMaxima){
        velocidadeAtual = velocidadeMaxima;
      }
    } else {
      velocidadeAtual *= 1 + porcentagem;
      if(velocidadeAtual > velocidadeMaxima){
        velocidadeAtual = velocidadeMaxima;
      }
    }
  }

  public void frear(double porcentagem) {
    if(isParado()){
      return;
    }

    if(velocidadeAtual == 0){
      return;
    }

    double mudancaVelocidade = velocidadeAtual * porcentagem;
    velocidadeAtual -= mudancaVelocidade;

    if(velocidadeAtual < 0){
      velocidadeAtual = 0;
    }
  }

  @Override
  public String toString() {
    String msg = String.format("-------\nCarro num: %d\nPiloto: %s\nVelocidade Atual: %f\nVelocidade Máxima: %f\n-------\n",
      numeroCarro, piloto, velocidadeAtual, velocidadeMaxima);
    return msg;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    
    if (obj == null || getClass() != obj.getClass()) return false;

    if (!(obj instanceof CarroCorrida)) return false;

    CarroCorrida outro = (CarroCorrida)obj;
    return this.numeroCarro == outro.numeroCarro;
  }
}
