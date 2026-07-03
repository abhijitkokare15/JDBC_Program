public class Finalize_method  {

    void show()
    {
        System.out.println("Welcome to the class");
    }
    
    public void finalize() throws Throwable
    {
        System.out.println("I done My job");
    }


public static void main()
{
     new Finalize_method().show();
     System.gc();

}
}
