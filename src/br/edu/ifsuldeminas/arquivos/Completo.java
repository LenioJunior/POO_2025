package br.edu.ifsuldeminas.arquivos;

// Classe abstrata para manipulação de arquivos
// public abstract class Arquivo {
//   protected String caminho;

//   public Arquivo(String caminho) {
//       this.caminho = caminho;
//   }

//   public abstract void ler();
//   public abstract void escrever(String conteudo);
// }

// // Implementação para arquivos TXT
// public class ArquivoTXT extends Arquivo {
//   public ArquivoTXT(String caminho) {
//       super(caminho);
//   }

//   @Override
//   public void ler() {
//       System.out.println("Lendo arquivo TXT: " + caminho);
//       // Código para leitura do arquivo TXT
//   }

//   @Override
//   public void escrever(String conteudo) {
//     System.out.println("Escrevendo no arquivo TXT: " + caminho);
//       try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
//         writer.write(conteudo);
//         System.out.println("Conteúdo escrito no arquivo TXT com sucesso!");
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
//   }
// }

// // Implementação para arquivos CSV
// public class ArquivoCSV extends Arquivo {
//   public ArquivoCSV(String caminho) {
//       super(caminho);
//   }

//   @Override
//   public void ler() {
//       System.out.println("Lendo arquivo CSV: " + caminho);
//       // Código para leitura do arquivo CSV
//   }

//   @Override
//   public void escrever(String conteudo) {
//       System.out.println("Escrevendo no arquivo CSV: " + caminho);
//       try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
//         for (List<String> linha : linhas) {
//             writer.write(String.join(",", linha));
//             writer.newLine();
//         }
//         System.out.println("Conteúdo escrito no arquivo CSV com sucesso!");
//     } catch (IOException e) {
//         e.printStackTrace();
//     }

//   }
// }

// // Implementação para arquivos JSON
// public class ArquivoJSON extends Arquivo {
//   public ArquivoJSON(String caminho) {
//       super(caminho);
//   }

//   @Override
//   public void ler() {
//       System.out.println("Lendo arquivo JSON: " + caminho);
//       // Código para leitura do arquivo JSON
//   }

//   @Override
//   public void escrever(String caminho, Map<String, Object> dados) {
//       System.out.println("Escrevendo no arquivo JSON: " + caminho);
//       // Código para escrita no arquivo JSON
//       JSONObject jsonObject = new JSONObject(dados);
//       try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
//           writer.write(jsonObject.toString(4)); // Indentação de 4 espaços
//           System.out.println("Conteúdo escrito no arquivo JSON com sucesso!");
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//   }
// }

// // Implementação para arquivos XML
// public class ArquivoXML extends Arquivo {
//   public ArquivoXML(String caminho) {
//       super(caminho);
//   }

//   @Override
//   public void ler() {
//       System.out.println("Lendo arquivo XML: " + caminho);
//       // Código para leitura do arquivo XML
//   }

//   @Override
//   public void escrever(String caminho, Map<String, String> elementos) {
//       System.out.println("Escrevendo no arquivo XML: " + caminho);
//       try {
//         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//         DocumentBuilder builder = factory.newDocumentBuilder();
//         Document doc = builder.newDocument();

//         Element rootElement = doc.createElement("root");
//         doc.appendChild(rootElement);

//         for (Map.Entry<String, String> entry : elementos.entrySet()) {
//             Element elemento = doc.createElement(entry.getKey());
//             elemento.appendChild(doc.createTextNode(entry.getValue()));
//             rootElement.appendChild(elemento);
//         }

//         TransformerFactory transformerFactory = TransformerFactory.newInstance();
//         Transformer transformer = transformerFactory.newTransformer();
//         DOMSource source = new DOMSource(doc);
//         StreamResult result = new StreamResult(new File(caminho));
//         transformer.transform(source, result);

//         System.out.println("Conteúdo escrito no arquivo XML com sucesso!");
//     } catch (Exception e) {
//         e.printStackTrace();
//     }

//   }
// }

// // Classe principal para teste
// public class Main {
//   public static void main(String[] args) {
//       Arquivo txt = new ArquivoTXT("arquivo.txt");
//       Arquivo csv = new ArquivoCSV("arquivo.csv");
//       Arquivo json = new ArquivoJSON("arquivo.json");
//       Arquivo xml = new ArquivoXML("arquivo.xml");

//       txt.ler();
//       txt.escrever("Conteúdo para TXT");

//       csv.ler();
//       csv.escrever("Conteúdo para CSV");

//       json.ler();
//       json.escrever("Conteúdo para JSON");

//       xml.ler();
//       xml.escrever("Conteúdo para XML");
//   }
//}