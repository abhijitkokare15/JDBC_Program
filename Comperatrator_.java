import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Demo implements Comparator<Integer> {

//     @Override
//     public int compare(Integer o1, Integer o2) {

//         if ((o1 % 10) < (o2 % 10))
//             return -1;      // o1 comes before o2

//         else if ((o1 % 10) > (o2 % 10))
//             return 1;       // o1 comes after o2

//         else
//             return 0;       // Both have same last digit
//     }
// }

public class Comperatrator_{

    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        li.add(45);
        li.add(10);
        li.add(50);
        li.add(1);
        li.add(78);
        li.add(89);
        li.add(896);
        li.add(20);
        li.add(96);
        li.add(10);

        System.out.println("Before Sorting:");
        li.forEach(System.out::println);

       // Comparator<Integer> comp = new Demo();
    //    Comparator<Integer> comp = new Comparator<Integer>() {
    //     public int compare(Integer o1, Integer o2) {

    //     if ((o1 % 10) < (o2 % 10))
    //         return -1;      // o1 comes before o2

    //     else if ((o1 % 10) > (o2 % 10))
    //         return 1;       // o1 comes after o2

    //     else
    //         return 0;       // Both have same last digit
    // }
    //    };

            //  Comparator<Integer> comp = (o1,o2)->{
        //     if ((o1 % 10) < (o2 % 10))
        //        return -1;     
        //    else if ((o1 % 10) > (o2 % 10))
        //     return 1;      
        //     else
        //     return 0; 
        
           
            //  };


        Collections.sort(li,(o1,o2)->{return ((o1 % 10) < (o2 % 10) ? -1:(o1 % 10) > (o2 % 10)? 1 : 0);});

        System.out.println("\nAfter Sorting (By Last Digit):");
        li.forEach(System.out::println);
    }
}