package br.edu.ifsuldeminas.arquivos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Classe principal para teste
public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.showMenu();

    // txt.ler();

    // csv.ler();
    // csv.escrever(data);

    // json.ler();
    // json.escrever(data);

    // xml.ler();
    // xml.escrever(data);
  }

  private void reading(Arquivo arquivo, String tipo) {
    System.out.println("----------------------------------");
    System.out.println(String.format("Reading %s File.", tipo));
    List<String> reading = arquivo.ler();
    System.out.println("Resultado: ");
    for (String line : reading) {
      System.out.println(line);
    }
    System.out.println("----------------------------------");
  }

  private void writing(Arquivo arquivo, List<String> content, String tipo) {
    System.out.println("----------------------------------");
    System.out.println(String.format("Reading %s File.", tipo));
    arquivo.escrever(content);
    System.out.println("----------------------------------");
  }

  private void showMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    Arquivo txt = new ArquivoTxt("arquivo.txt");
    Arquivo csv = new ArquivoCsv("arquivo.csv");
    Arquivo json = new ArquivoJson("arquivo.json");
    Arquivo xml = new ArquivoXml("arquivo.xml");

    List<String> data = new ArrayList<>();
    data.add("Header 1, Header 2");
    data.add("Value 1, Value 2");

    do {
      System.out.println("==== Console Menu ====");
      System.out.println("1. Write Txt File.");
      System.out.println("2. Write Csv File.");
      System.out.println("3. Write Json File.");
      System.out.println("4. Write Xml File.");
      System.out.println("======================");
      System.out.println("5. Read Txt File.");
      System.out.println("6. Read Csv File.");
      System.out.println("7. Read Json File.");
      System.out.println("8. Read Xml File.");
      System.out.println("0. Exit");
      System.out.print("Choose an option: ");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          writing(txt, Arrays.asList("Hello", "World!"), "Txt");
          break;
        case 2:
          writing(csv, Arrays.asList("Value 1", "Value 2!"), "Csv");
          break;
        case 3:
          writing(json, Arrays.asList("{name : Nome 1}", "{age: 14}"), "Json");
          break;
        case 4:
          writing(xml, Arrays.asList("Field 1", "Field 2"), "Xml");
          break;
        case 5:
          reading(txt, "Txt");
          break;
        case 6:
          reading(csv, "Csv");
          break;
        case 7:
          reading(json, "Json");
          break;
        case 8:
          reading(xml, "Xml");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    } while (choice != 0);

    scanner.close();
  }
}