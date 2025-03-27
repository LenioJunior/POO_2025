package br.edu.ifsuldeminas.pessoas;

public class Pessoa {

  private String nome;
  private int _idade;

  public int getIdade(){
    return this._idade;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public Pessoa(String nome, int idade){
    this.nome = nome;
    _idade = idade;
  }

  public boolean alteraNome(String novoNome, int idade){
    if(idade < 14){
      System.out.println("Não é possível alterar o nome!");
      return false;
    }
    this.nome = novoNome;
    return true;
  }

  public void exibeNome(){
    System.out.println(this.nome);
  }
}
