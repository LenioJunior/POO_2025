package br.edu.ifsuldeminas.bd;

public abstract class Conexao {

  String connectionString;


  public Conexao(String strConexao){
    connectionString = strConexao;
  }

  protected int fazQuery(){
    // Fazendo consulta usando SELECT * FROM usuarios
    return 8;
  }

  public abstract boolean conecta();

  public abstract int query(String consulta);
  
  // MySql -- user=lenio,password=123,schema=api,database=poo
  // Postgres -- username:lenio;password:123;collation:api;db:poo

  // conecta - true or false
  // query SELECT * FROM usuarios
}
