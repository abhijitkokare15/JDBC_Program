import java.util.*;

public class Map_ {
  public static void main()
  {
    // Map<Integer,String> mp = new HashMap();
    // mp.put(101,"Abhijit");
    // // mp.put(102,"Show");
    //  mp.put(103, "Java");

    //     System.out.println("Map : " + mp);

    //     // get() -> Returns value of given key
    //     System.out.println("get(101) : " + mp.get(101));

    //     // containsKey() -> Checks whether key exists
    //     System.out.println("containsKey(102) : " + mp.containsKey(102));

    //     // containsValue() -> Checks whether value exists
    //     System.out.println("containsValue(\"Java\") : " + mp.containsValue("Java"));

    //     // size() -> Returns number of key-value pairs
    //     System.out.println("Size : " + mp.size());

    //     // keySet() -> Returns all keys
    //     System.out.println("Keys : " + mp.keySet());

    //     // values() -> Returns all values
    //     System.out.println("Values : " + mp.values());

    //     // entrySet() -> Returns all key-value pairs
    //     System.out.println("Entries : " + mp.entrySet());

    //     // Traversing using entrySet()
    //     System.out.println("\nUsing entrySet()");
    //     for (Map.Entry<Integer, String> entry : mp.entrySet()) {
    //         System.out.println(entry.getKey() + " -> " + entry.getValue());
    //     }

    //     // replace() -> Replaces value of existing key
    //     mp.replace(103, "Python");
    //     System.out.println("\nAfter replace : " + mp);

    //     // remove() -> Removes key-value pair
    //     mp.remove(102);
    //     System.out.println("After remove : " + mp);

    //     // isEmpty() -> Checks whether map is empty
    //     System.out.println("Is Empty : " + mp.isEmpty());

    //     // clear() -> Removes all entries
    //     mp.clear();
    //     System.out.println("After clear : " + mp);

    //     System.out.println("Is Empty : " + mp.isEmpty());

    // System.out.println(mp);

    Map<Integer,String> mp = new Hashtable<>();
    mp.put(101,"Abhijit");
    mp.put(102,"Show");
    System.out.println(mp);
   


    
  }
  
    
}
