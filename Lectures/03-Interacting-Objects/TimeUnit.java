public class TimeUnit {
    private int myLimit;
    private int myValue;
    private String myUnit;

    public TimeUnit() { this(60); }

    public TimeUnit(int theLimit) { this(theLimit, ""); }

    public TimeUnit(int theLimit, String theUnit) {
      myLimit = theLimit;
      myUnit = theUnit;
      myValue = 0;
    }

    public boolean update() {
      myValue = ++myValue % myLimit;
      return (0 == myValue);
    }

    public String getDisplayValue() {
      return String.format("%02d", myValue);
/*      if (10 > myvalue) {
        return "0" + myValue;
      } else {
        return "" + myValue;
      }*/
    }
  }
