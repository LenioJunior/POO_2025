package br.edu.ifsuldeminas.bd;

public class Main {
  public static void main(String[] args) {
    //MySql mySql = new MySql("user=lenio,password=123,schema=api,database=poo");
    Postgres postgres = new Postgres("username:lenio;password:123;collation:api;db:poo");
    //int qtdeRegistros = doOperacao(mySql);
    int qtdeRegistros = doOperacao(postgres);
    System.out.println("Registros obtidos: " + qtdeRegistros);
  }

  public static int doOperacao(Conexao c){
    boolean conectou = c.conecta();
    if(!conectou){
      System.out.println("Não foi possível conectar no banco");
      return -1;
    }

    return c.query("Select * from tabela");
  }
}
