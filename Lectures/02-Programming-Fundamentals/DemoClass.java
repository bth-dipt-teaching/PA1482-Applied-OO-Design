public class DemoClass {
  int demoMethod(int oneParameter, String otherParameter) {
    System.out.println(otherParameter);
    return 10+oneParameter;
  }

  public static void main(String [] args) {
    DemoClass dc = new DemoClass();

    int returnValue = dc.demoMethod(10, "Hello?");
    System.out.println(returnValue);
  }
}