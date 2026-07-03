import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection_ {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>(); // from 1.7 we not need to right also on after =
        // // c.add(10);
        // c.add("Abhi");
        // c.add(45.6);
        // iterate collection using iterator
        c.add("Abhi");
        c.add("Sout");
        Iterator ir = c.iterator(); // this return the object of it i which innr class in array list that implement iterator 

          while(ir.hasNext())
          {
            System.out.println(ir.next());
          }
            c.remove("Sout"); // it basically return boolean if dleted or not 
        // int size = c.size();
        //usinh for loop
        // for(int i=1;i<=size;i++)
        // {
        //     System.out.println(ir.next());

        // }

          for( Object i : c)
          {
            System.out.println(i);
          }
    }
    
}
