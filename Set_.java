import java.util.*;
public class Set_ {
    public static void main()
    {
        // Set <Integer> sc = new HashSet<>();
        // sc.add(10);
        // sc.add(5);
        // sc.add(15);
        // sc.add(45);
    // Set <Integer> sc = new TreeSet<>();
    //     sc.add(10);
    //     sc.add(5);
    //     sc.add(15);
    //     sc.add(45);


    Set <Integer> sc = new LinkedHashSet<>();
        sc.add(10);
        sc.add(5);
        sc.add(15);
        sc.add(45);
       boolean b= sc.add(45);
        System.out.println(b);//false no dublicate is allowed 
       
        sc.forEach(x->System.out.println(x));


    }
    
}
