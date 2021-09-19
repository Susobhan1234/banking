import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample1 {
    HashMapExample1 ()
    {

    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> hasMap = new HashMap<String, Integer>();

        for (int loopCounter = 0; loopCounter < n; loopCounter++) {
            String name = sc.nextLine();
            String phoneNo = sc.nextLine();
            Integer phone = new Integer (phoneNo); // object

            // Check if key is not present in the map put it into the map
            hasMap.putIfAbsent (name, phone);
        }

        // Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        Integer result = (Integer) hasMap.get ("a");
        System.out.println(result);

        // Removes the mapping for the specified key from this map if present.
        hasMap.remove("a");

        // Returns the number of key-value mappings in this map.
        int length = hasMap.size();
        System.out.println(length);

        // Replaces the entry for the specified key only if it is currently mapped to some value.
        hasMap.replace("b", 789);

        hasMap.put("x", null);
        hasMap.put(null, null);

        Iterator itr = hasMap.entrySet ().iterator ();

        while (itr.hasNext ())
        {
            Map.Entry entry = (Map.Entry) itr.next ();
            String key = (String) entry.getKey ();
            Integer value = (Integer) entry.getValue ();

            System.out.println (key);
        }
    }
}
