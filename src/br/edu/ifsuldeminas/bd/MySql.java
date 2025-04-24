package br.edu.ifsuldeminas.bd;

public class MySql extends Conexao{

  public MySql(String con){
    super(con);    
  }

  @Override
  public boolean conecta() {
    System.out.println("estou conectando em um banco MySql");
    return true;
  }

  @Override
  public int query(String consulta) {
    System.out.println("estou realizando a consulta em um banco MySql");
    return fazQuery();
  }
  
}
