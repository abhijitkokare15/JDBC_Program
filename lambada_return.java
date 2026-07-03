@FunctionalInterface
interface  A
{
    int add(int a, int b);
}

public class lambada_return {
   // with differnet varaible
    A a =(x,y)->x+y; // only if only one return statment is present it tereaded as result
    A b =(a,b)->
    {
        int p=a;
        int q=b;
        int k = p+q;
        return k;
    };
    
    void main()
    {
      int c= a.add(10,20);
       int d=b.add(60,10);
       IO.println(c);
       IO.println(d);
    }
}
