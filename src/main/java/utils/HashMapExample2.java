import java.util.*;

public class HashMapExample2
{
    HashMapExample2()
    {

    }

    public static void main(String [] argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> hasMap = new HashMap<String, Integer>();

        if ((1 <= n) || (n <= 100000)) {

            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                String phoneNo = in.nextLine();
                Integer phone = new Integer(phoneNo); // object

                hasMap.putIfAbsent(name, phone);
            }

            String s = in.nextLine();

            Integer result = (Integer) hasMap.get(s);

            if (result == null)
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println(s + "=" + result.intValue());
            }

            displayAllValue (hasMap);
        }
    }

    public static void displayAllValue (HashMap map)
    {
        Iterator itr = map.entrySet ().iterator ();

        while (itr.hasNext ())
        {
            Map.Entry entry = (Map.Entry) itr.next ();
            String key = (String) entry.getKey ();
            Integer value = (Integer) entry.getValue ();

            System.out.println (key + " " + value.intValue());
        }
    }
}
