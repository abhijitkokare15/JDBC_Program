// Multithreading using Runnable Interface

class A implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i = i + 2)
            {
                System.out.println("A : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 2; i <= 10; i = i + 2)
            {
                System.out.println("B : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

public class threadL3
{
    public static void main(String[] args)
    {
        // A a = new A();
        // B b = new B();

        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}