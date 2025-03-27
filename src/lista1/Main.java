package lista1;

public class Main {
  public static void main(String[] args) throws Exception {
    //Menu
    runEx(new Ex1());
    runEx(new Ex2());
    
  }

  public static void runEx(Ex ex){
    ex.run();
  }
}
