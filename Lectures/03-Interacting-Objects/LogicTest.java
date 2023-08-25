public class LogicTest {
  public static boolean test(int i) {
    System.out.println("" + i + " : " + (0==i%5));
    return 0==i%5;
  }

  public static void main(String[] args) {
    if( test(1) || test(2) || test(3) || test(4) || test(5) || test(6) || test(7)) {
      System.out.println(true);
    }

    if( test(1) && test(2) && test(3) && test(4) && test(5) && test(6) && test(7)) {
      System.out.println(true);
    }

    boolean result = test(1) && test(2) && test(3) && test(4) && test(5) && test(6) && test(7);
  }
}