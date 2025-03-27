package br.edu.ifsuldeminas.pessoas;

public class Aluno extends Pessoa {

  private String matricula;

  public void setMatricula(String matricula){
    this.matricula = matricula;
  }

  public String getMatricula(){
    return this.matricula;
  }

  public Aluno(String nome, int idade) {
    super(nome, idade);
    System.out.println("Construtor sem matricula.");
  }

  public Aluno(String nome, int idade, String matricula){
    super(nome, idade);
    this.matricula = matricula;
    System.out.println("Construtor com parametro matricula.");    
  }

  public void souAluno(){

  }
  
}
