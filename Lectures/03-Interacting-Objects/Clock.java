public class Clock { 
  private TimeUnit hours = new TimeUnit(24, "h");
  private TimeUnit minutes = new TimeUnit(60, "m");
  private TimeUnit seconds = new TimeUnit(60, "s");

  public Clock() {
  }

  public void update() {
    if (seconds.update()) {
      if (minutes.update()) {
        hours.update();
      }
    }
  }

  public void display() {
    StringBuilder sb = new StringBuilder();
    sb.append(hours.getDisplayValue());
    sb.append(":");
    sb.append(minutes.getDisplayValue());
    sb.append(".");
    sb.append(seconds.getDisplayValue());
    System.out.println(sb.toString());
  }

  public static void main(String [] args) {
    Clock theClock = new Clock();

    for(int i = 0; i < 10; i++) {
      theClock.update();        
      theClock.display();

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
    }

  }
}
