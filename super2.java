public class super2 {
    void main()
    {
         B b =new B();
         b.show();
    }
    
}

class A
{
    int a;
    void show()
    {
       
        System.out.println("In side class A show method");
        System.out.println(a);
    }
}

class B extends A
{
    void show()
    {
       
         super.show();
          System.out.println("In side class B show method");
       
    }
}