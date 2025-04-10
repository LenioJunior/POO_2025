package br.edu.ifsuldeminas.arquivos;

import java.util.List;

public abstract class Arquivo {

  protected String caminho;

  public Arquivo(String caminho){
    this.caminho = caminho;
  }

  public abstract List<String> ler();
  public abstract void escrever(List<String> data);
}
