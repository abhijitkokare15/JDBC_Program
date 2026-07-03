
// In this lecture, we are discussing lambda expression:
// #1 what is lambda expression in java?
// -- In Java, a lambda expression is a concise way to implement a functional interface. 
//    A functional interface is an interface that has only one abstract method, and it can be implemented using a lambda expression.
// -- In the previous lecture we see that we are making a class or inner class to implement the functional interface 
//    but using lambda expression we do not need of new class and inner class to implement.

// #2 Properties of the lambda expression
// Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
// They allow you to define the behaviour of a functional interface in a single line of code.

// Functional programming: Lambda expressions are a key component of functional programming in Java. 
// They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

// No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
// used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.

// #3 example:

// class Main{
//     public static void  main(String []args){
// A obj = new B();
// obj.show();

// //another way to implement functional interface
// A obj1 = new A(){
//     @Override
//     public void show(){
//         System.out.println("Hello");
//     }
// };
// obj1.show();

// //now we can use a lambda expression to implement the functional interface
// //you can remove new A() and public void show() and replace it with () -grater then System.out.println("Hello"); 
// //if you have single statements you need not mention curly braces and return keyword

// A obj2 = () - grater then System.out.println("Hello");
// obj2.show();

// //here you can use lambda expression to implement interface C
// C obj3= i-grater then System.out.println(i);
// obj3.show(5);
 
// }
// }
// //one way to implement functional interface
// class B implements A{
//     @Override
//     public void show(){
//         System.out.println("Hello");
//     }
// }

// //specify it is functional interface
// @FunctionalInterface //we use this annotation to specify it is functional interface
// interface A{
//     void show();
//     //void run(); //this will give error as it is not functional interface
// } 

// interface C{
//   public void show(int i);



// for function not needed to define type of a parameter because lambda check it 
//in interface declaration 
//we can pass one or more arameter if one simple parametr


@FunctionalInterface
interface A
{
    void show(int x);
     

}
public class lambada_Exp {
//    A obj = ()->System.out.println("Welcome");// one line statment 
   
//    // for multiple use {}

//    A obj2 = ()->
//    {
//     System.out.println("Come in ");
//     System.out.println("IN side the class");

//    };

   // using one argument
   A obj3 = x->{
     System.out.println("IN side the class"+x);
   };

   A obj4 =(x)->
   {
     System.out.println("IN side the class2"+x);
   };
 // for more than one para use ()and varaible inside this
   void main()
   {
    //  obj.show();
    //  obj2.show();
     obj3.show(10);
     obj4.show(45);
   }

}
