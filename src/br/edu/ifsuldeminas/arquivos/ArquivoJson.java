package br.edu.ifsuldeminas.arquivos;

import java.util.List;
import java.io.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ArquivoJson extends Arquivo {

  public ArquivoJson(String caminho) {
    super(caminho);
  }

  @Override
  public List<String> ler() {
    List<String> result = null;
    try (Reader reader = new FileReader(caminho)) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>() {}.getType();
        result = gson.fromJson(reader, listType);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }

  @Override
  public void escrever(List<String> data) {
    try (Writer writer = new FileWriter(caminho)) {
      Gson gson = new Gson();
      gson.toJson(data, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }  
}
