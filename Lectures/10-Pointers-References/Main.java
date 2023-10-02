
public class Main {
    public static void doSomething(String someString) {
      someString = "not hello"; // Only changes the reference locally
    }

    public static String doChange(String someString) {
      return "modified" + someString;
    }

    public static void main(String [] args) {
      String s = "hello";
      doSomething(s);
      System.out.println(s);
      System.out.println(doChange(s));
    }

}