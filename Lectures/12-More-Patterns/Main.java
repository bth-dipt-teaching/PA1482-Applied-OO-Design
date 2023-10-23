import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Lists (of objects) have an iterator
        List<Integer> intList = new ArrayList<Integer>();
        Iterator<Integer> iter = intList.iterator();
        while(iter.hasNext()) {
          Integer element = iter.next();
        }

        for(Integer element : intList) { /* ... */  }

        // As to other data structures, e.g. Maps
        Map<String, Integer> stringHash = new HashMap<String, Integer>();
        Iterator<String> stringIter = stringHash.keySet().iterator();
        while(stringIter.hasNext()) { String element = stringIter.next(); }

        iter = stringHash.values().iterator();
        while(iter.hasNext()) { Integer element = iter.next(); }

        // But what about an intArray?
        // Arrays do not provide an iterator
        // and especially not one for built-in datatypes.
        int [] intArray = new int[10];

        // We could use the streams API to convert
        // our int[] to a List<Integer>
        iter = IntStream
          .of(intArray)                 // start with the int array
          .boxed()                      // Convert to a stream of Integers
          .collect(Collectors.toList()) // collect it as a List<Integer>
          .iterator();                  // and get the iterator.

        while(iter.hasNext()) {
          Integer element = iter.next();
          System.out.print(element.toString());
        }

        // But if we are already using streams, why not jump full in?
        IntStream.of(intArray).forEach( (elem) -> { System.out.print(elem); } );

    }
}