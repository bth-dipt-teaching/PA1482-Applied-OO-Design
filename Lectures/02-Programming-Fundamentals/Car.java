public class Car {

    public static void main(String[] args) {
        System.out.print("success");
    }

  private String owner;
  public boolean isAvailable() {
    if ("" == this.owner) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isAbandoned() {
    return ("" == this.owner);
  }
}