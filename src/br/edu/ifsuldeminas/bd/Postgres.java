package br.edu.ifsuldeminas.bd;

public class Postgres extends Conexao {

  public Postgres(String conexao){
    super(conexao);
  }

  @Override
  public boolean conecta() {
    System.out.println("estou conectando em um banco Postgres");
    return true;
  }

  @Override
  public int query(String consulta) {
    System.out.println("estou realizando a consulta em um banco Postgres");
    return fazQuery();
  }
  
}
