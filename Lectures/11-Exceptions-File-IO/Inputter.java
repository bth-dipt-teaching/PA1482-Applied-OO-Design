import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.*;
import java.util.ArrayList;

public class Inputter {

  public ArrayList<String> oldSchool(String filename) {
    ArrayList<String> contents = new ArrayList<String>();
    try (
      FileReader file = new FileReader(filename);
      BufferedReader buf = new BufferedReader(file);
      ) {
      String line;
      while ((line = buf.readLine()) != null) {
        contents.add(line);
      }
    } catch (IOException e) {
      System.out.println(e);
    }

    return contents;
  }

  public ArrayList<String> hipster(String filename) {
    ArrayList<String> contents = new ArrayList<String>();
    Path path = Paths.get(filename);

    try(BufferedReader buf = Files.newBufferedReader(path)) {
      String line;
      while ((line = buf.readLine()) != null) {
        contents.add(line);
      }
    } catch (IOException e) {
      System.out.println(e);        
    }

    return contents;
  }

  public static void main(String [] args) {
    Inputter in = new Inputter();
    ArrayList<String> contents;

    contents = in.oldSchool("tst.txt");
    for (String l : contents) { System.out.println(l); }

    contents = in.hipster("tst2.txt");
    for (String l : contents) { System.out.println(l); }

  }
}
