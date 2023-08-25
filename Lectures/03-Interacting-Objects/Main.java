
public class Main {
    public static void main(String[] args) {
        String f = "First";
        String s = "Second";
        f = f+s; // Create a new string "FirstSecond" and store a reference to it in f. Garbage collect the string "First".

        // Be wary of the == operator:
        String ss = "Second";
        String fs = "FirstSecond";

        System.out.println(s==ss);
        System.out.println(f==fs);

        // Instead, use equals():
        System.out.println(f.equals(fs));

        // Many concatenations drive the garbage collector into overtime.
        // Better to use a StringBuilder:
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
          sb.append(f);
        }

        System.out.println(sb.toString());
    }
}