// Final is a keyword in Java
// Final keyword can be used with variable to make it constant.
// It can be used with method to stop overriding
// It can be used with class to stop Inheritance.


public class FinalKeyword
{
    final  int a =20;
    // a=10;
    void show()
    {
        System.out.println(a);
    }

    public static void main()
    {
        // FinalKeyword f = new FinalKeyword();
        // f.show();

        B b = new B();
        b.show();
    }

}

final class A
{
    final int p =10;

}

class B extends A
{
    
    void show()
    {
        p=20;
        System.out.println(p);
    }
}


