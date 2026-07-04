class Outer
{
    class A
    {
        void show()
        {
            System.out.println("Come");
        }
    }

    public class B extends A
    {
        void Go()
        {
            System.out.println("Go");
        }
    }

    public static void main(String[] args)
    {
        Outer o = new Outer();

        Another an = new Another(o);

        an.Go();
        an.show();
        an.sleep();
    }
}

class Another extends Outer.B
{
    Another(Outer o)
    {
        o.super();   // call constructor of Outer.B
    }

    void sleep()
    {
        System.out.println("Go and sleep");
    }
}