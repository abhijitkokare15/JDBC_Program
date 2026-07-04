// Java finally block must be followed by try or catch block.
// Whether exception is handled or not Java finally block is always execute

public class Exception_Finally
{
    public static void main()
    {

         try
         {
            int c=10/0;
        
         }

         catch(Exception e)
         {
            e.printStackTrace();
         }
        finally
        {
            System.out.println("Bye");
        }
    }
}