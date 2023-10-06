import java.util.ArrayList;
public class Document {
  private ArrayList<String> contents = new ArrayList<>();
  Document() { }

  // We handle any error (by not doing anything)
  // and return false. The 
  public boolean addLine(int position, String text) {
    if ( true /* can line be added */) {
      contents.add(position, text);
      return true; // The line was added
    } else {
      return false; // The line was not added
    }
  }

  // If we throw an exception, we can use an informative class
  // so that the error can be handled in our system
  // AND we can give a good error message so that the developers
  // will know what happened.
  // There is no longer any need for a return value.
  public void removeLine(int position) {
    if (position > contents.size()) {
      throw new IndexOutOfBoundsException("Trying to remove a line outside Document bounds");
    } else {
      contents.remove(position);
    }
  }

  public static void main(String [] args) {
    Document d = new Document();
    d.addLine(0, "Hello World"); // I do not need to handle the return value
    try {
      d.removeLine(99);
    } catch(IndexOutOfBoundsException e) {
      // This is the specific error message we know we might get
      System.out.println(e.getMessage());
    } catch(Exception e) {
      // Any other error message we might get. We don't want the programme
      // to terminate, so we catch, print, and move on.
      System.out.println(e.getMessage());
    } finally {
      // Cleanup regardless of whether there was an error or not
      System.out.println("Tried to remove a line");
    }

    try {
      d.removeLine(1);
      System.out.println("This line will not be executed");
    } catch(Exception e) {
    } finally {
      System.out.println("But this one will");
    }

  }
}