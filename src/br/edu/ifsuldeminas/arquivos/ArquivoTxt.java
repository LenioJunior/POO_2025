package br.edu.ifsuldeminas.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTxt extends Arquivo{

  public ArquivoTxt(String caminho) {
    super(caminho);    
  }

  public List<String> ler() {
      List<String> lines = new ArrayList<>();
      try {
        lines = Files.readAllLines(Paths.get(caminho));
      } catch (IOException e) {
        e.printStackTrace();
      }
      return lines;
  }

  public void escrever(List<String> data) {
      System.out.println("Escrevendo no arquivo TXT: " + caminho);
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
        for (String line : data) {
          writer.write(line);
          writer.newLine();
      }

        System.out.println("Conteúdo escrito no arquivo TXT com sucesso!");
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
  
}
