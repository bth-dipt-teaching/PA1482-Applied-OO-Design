import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Outputter {
  public void basicPattern(String filename) {
    try {
      FileWriter fw = new FileWriter(filename);        
      fw.write("Some text\n");
      fw.append("Some more text\n");
      fw.close();
    } catch(IOException e) {
      System.err.println("Error writing file " + filename);
      e.printStackTrace();
    }
  }

  public void preferredPattern(String filename) {
    try(FileWriter fw = new FileWriter(filename);
        BufferedWriter buf = new BufferedWriter(fw); ) {
      buf.write("Some preferred text");
      buf.newLine();
      buf.write("Some more preferred text");
    } catch (IOException e) {
      System.err.println("Error writing file " + filename);
      e.printStackTrace();
    }
  }

  public void otherWriter(String filename) {
    try ( PrintWriter out = new PrintWriter(filename)  ) {
      out.println("Some more more text");
      out.println("and yet some more");
    } catch(IOException e) {
      System.err.println("Error writing file " + filename);
      e.printStackTrace();
    }
  }


  public static void main(String [] args) {
    Outputter o = new Outputter();

    o.basicPattern("tst.txt");
    o.preferredPattern("tst2.txt");
    o.otherWriter("tst3.txt");
  }

}