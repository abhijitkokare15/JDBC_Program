import java.util.Random;
import java.util.Vector;

public class vector_ {
    public static void main(String[] args) {
       Vector<Integer> v = new Vector<>();
          
   System.out.println(v.capacity());
       for(int i=1;i<=11;i++)
       {
        v.add(new Random().nextInt(1,101));
       }
       System.out.println(v.capacity());

    //    System.out.println(v);

     v.forEach(x->System.out.println(x));

       // same method as list interfae have



    }
    
}
