import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_interface {
    public static void main(String[] args) {
        // List<Integer> li = new ArrayList<>();
        // li.add(45);
        // li.add(10);//0
        // li.add(50);
        // li.add(1);
        // li.add(78);
        // li.add(89);
        // li.add(896);
        // li.add(5,20);
        // li.add(5,96);
        // li.add(10);
      
        //   List li = new ArrayList<>();
        //   li.add("Abc");
        //    li.add(89);
        //  li.add(896);
        //  li.add(56.3);
        //   li.add("pqr");
        //   li.add("xyz");

        // for(Integer l : li)
        // {
        //     System.out.println(l);
        // }

        // System.out.println("The size is :"+li.size());
       
    //    li.set(1,56900); // chnage the element position or set element at specified index
        
        // for(int i=0;i<li.size();i++)
        //     System.out.println(li.get(i));


        // Collections.sort(li);
        // System.out.println("After sorting:");
        //    
// li.remove(1);// remove ele at index one
// li.remove((Integer)1);// remove obj 1 wala object 
// li.remove(Integer.valueOf(45));//remove obj 45 wala object 
//  System.out.println("After remove:");
//  for(int i=0;i<li.size();i++)
//      System.out.println(li.get(i));
// // li.remove()
        
// li.forEach(System.out::println);
// li.forEach(x->System.out.println(x));//jvm automatically dete type and make x of this tye like (Intergr)x->
//something like this
// for different type it considerd x as object type 



//get(index) :=> return the element from  specified index
// we can use remove() to specified or at index value

//  List<Integer> li = new ArrayList<>()
//  {{

//  s
//         add(45);
//          add(10);//0
//          add(50);
//           add(1);
//  }};
//       li.forEach(x->System.out.println(x));
      

        List<Integer> li = Arrays.asList(50,60,70);
        System.out.println(li);

    }
}
