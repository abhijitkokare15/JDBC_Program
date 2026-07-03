// Java language uses exceptions to handle errors and other exceptional events. It is used to handle the runtime errors such as such as ClassNotFound. Three types of exceptions:
// 1) Checked Exception
// 2) Unchecked Exception
// 3) Error

// Throwable class is used to handle all exception which is extended by exception and error. In exception there are two types, checked exception and unchecked exception
// There are multiple types of errors:
// 1. Syntax error
// 2. Runtime error
// 3. Logical error

// Arithmetic exception is a sub type of runtime exception.





public class Exception1 {
 public static void main()
 {
   try
   {
     int c=10/0;
     IO.println(c);

   }
      catch(Exception e)
      {
        System.out.println("welcome");
      }
    
 }

    
}
