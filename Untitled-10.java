<!-- ws is keyword in Java which is used to suppress the errors/ exceptions. And it should write after the main method itself. To forcefully throw error, we can use throw keyword. And also we have to mention what type of error we want to throw. -->


// #1 
// -- throw keyword in Java is used to explicitly throw an exception. 
// When an exception is thrown using the throw keyword, the execution of the current method is stopped.

// syntax-
// throw new NullPointerException("Object is null");

// e.g
// public void divide(int a, int b) {
//   if (b == 0) {
//     throw new ArithmeticException("Cannot divide by zero");
//   }
//   int result = a / b;
//   System.out.println(result);
// }

// #2
// -- throw keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
// -- if you do not use try-catch then the control is passed, where the method is called.
// -- when you want to pass message to an exception 
// then you should use the parametrized constructor instead non parameterized constructor 
// e.g
// class Main{
//    public static void main(String []args){
//       int a=0;
//       try{
//          if(a==0)
// throw new ArithmeticException("a should not be zero"); // throw new ArithmeticException() is non parametrized constructor
//       }
//       catch(ArithmeticException e){
//          System.out.println("Exception caught: "+e);
//       }
    
//    }
// }

// Output: Exception caught: java.lang.ArithmeticException: a should not be zero

// if no cathc then throw the exception to the caller but throws is mandtory or throw is optional 
class Main{
   public static void main(String[] args){
      int j=30;
      int i=1;
     try{
      j=18/i;
      //handle the exception using throw
      if(j==0)
         throw new ArithmeticException("i donot want to print 0"); //try to create an exception 
     }
     catch(ArithmeticException e){//here catch is catching the exception
        System.out.println("ArithmeticException caught");
        System.out.println(e.getMessage()); //getMessage() method use to get the message
     }
       catch(Exception e){
          System.out.println("Exception caught");
       }
     
   }
}