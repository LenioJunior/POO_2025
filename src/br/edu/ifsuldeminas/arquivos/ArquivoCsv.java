package br.edu.ifsuldeminas.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoCsv extends Arquivo {

  public ArquivoCsv(String caminho) {
    super(caminho);
  }

  @Override
  public List<String> ler() {
    List<String> rows = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
        String line;
        while ((line = reader.readLine()) != null) {
            rows.add(line);
        }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return rows;
  }

  @Override
  public void escrever(List<String> data) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
      for (String row : data) {
          writer.write(row);
          writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
