package br.edu.ifsuldeminas.arquivos;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoXml extends Arquivo {

  public ArquivoXml(String caminho) {
    super(caminho);
  }

  @Override
  public List<String> ler() {
    List<String> elements = new ArrayList<>();
    try {      
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.parse(new File(caminho));
      doc.getDocumentElement().normalize();
      NodeList nodeList = doc.getDocumentElement().getChildNodes();

      for (int i = 0; i < nodeList.getLength(); i++) {
          Node node = nodeList.item(i);
          if (node.getNodeType() == Node.ELEMENT_NODE) {
              elements.add(node.getTextContent());
          }
      }      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return elements;
  }

  @Override
  public void escrever(List<String> data) {
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document doc = builder.newDocument();

      Element root = doc.createElement("Root");
      doc.appendChild(root);

      for (String value : data) {
          Element element = doc.createElement("Element");
          element.appendChild(doc.createTextNode(value));
          root.appendChild(element);
      }

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File(caminho));
      transformer.transform(source, result);
    } catch (Exception e) {
      e.printStackTrace();
    }    
  }  
}
