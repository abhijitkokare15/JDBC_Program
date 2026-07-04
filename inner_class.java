// #1
// Inner Class:-
// We can also create a class inside another class.
//  class A
//  { 
//   class B
//   {
//   }
//  }
// You can call the method of class B by using the dot operator in between both classes A and B.
//  A.B obj= new B();
// A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
//  A$B. class
// You also need to create an object of the outer class, to call the methods of an inner class.

// #2
// Static Inner Class:-
// An inner class can also be declared as static.
// When an inner class is declared as static, then you do not need to create an object for it.
// But an outer class can not be made static.

// #3
// Advantage of inner class:-
// Nested classes represent a particular type of relationship that is it can access all the members of the outer class, including private.
// Nested classes make the code more readable and maintainable.
// It makes the code more optimize.



// #4 Purpose 
// Purposes of Inner Classes
// Logical Grouping
// Keep related classes together.
// Encapsulation
// Hide helper classes from the outside world.
// Access Outer Class Members
// Inner class can directly access private members of the outer class.
// Reduce Number of Top-Level Classes
// Avoid creating many separate class files.
// Improve Code Organization
// Makes code easier to maintain and understand.
// Represent Part-Of Relationships
// Examples: Car–Engine, University–Student, Computer–CPU.
// Event Handling
// Commonly used in GUI programming for button clicks and listeners.
// One-Time Implementations
// Anonymous inner classes allow implementation of an interface or abstract class only once.
// Reduce Boilerplate Code
// Avoid creating a separate class for small tasks.
// Create Helper Classes
// Helper classes that are only useful inside the outer class.
// Increase Data Security
// Restrict access to implementation details.
// Support Closely Coupled Functionality
// When two classes are strongly related and work together.
// import java.security.Security;
// import java.sql.Time;

class Outer
{
    int num;
    void show()
    {
        System.out.println("This is the show method");

    }

 static class B
{
     int num;
    void show2()
    {
        System.out.println("This is the show method");

    }

}
 
public static void main()
{
   Outer o = new Outer();
   o.show();
//    Outer.B b = o.new B();
Outer.B b = new Outer.B();

    b.show2();
}
    
}
