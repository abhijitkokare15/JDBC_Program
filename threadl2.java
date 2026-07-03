public class threadl2 extends Thread
{
    public void run()
    {
        try {
            for(int i = 11; i <= 20; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception
    {
        Thread t = new threadl2();
        t.start();

         // Main thread sleeps

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
          Thread.sleep(1000); // main thread get sleep 
    }
}

// imp:->  if interface or base class doesnot write any throw then sub class aslo doesnot has a=authority to add throws for method but 
// you can handled exception inside methhod using try and catch 