public class Singleton4 {
   public static void main()
   {
     Demo d = Demo.Instance;
     Demo d1 =Demo.Instance;
     
   }
    
}

enum Demo
{
    Instance;
    private Demo()
    {
        System.out.println("Cretaed Instannce");

    }

}