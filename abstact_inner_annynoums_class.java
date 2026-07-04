// public In this lecture we will learn:
// Abstract and anonymous inner class
// Use of anonymous class with an abstract class
// Example of abstract and anonymous inner class.

// #1
// When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
// You can also provide the implementation for multiple methods in an anonymous inner class.
// Anonymous inner class can implement only one interface at s time.
// Anonymous inner class can either extend a class or implement an interface at a time.
// We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
// e.g.,
// abstract class A
// {
//  public abstract void show();
// }

// In main methid:
// A obj=new A()
// {
//  public void shoe()
//  {
//   statement;
//  }
// }; {
    
// }


// Anonymous Inner Class
// Anonymous class is a class without a name.
// It is declared and instantiated at the same time.
// Used when implementation is needed only once.
// It is a type of inner class.
// Why Anonymous Class?
// Avoid creating a separate class.
// Useful for one-time implementation of interfaces and abstract classes.
// Reduces code.
// Relationship with Interface and Abstract Class
// Can implement an interface.
// Can extend an abstract class.
// Must either extend a class or implement an interface.
// Cannot exist independently.
// Object Creation
// The object belongs to the anonymous class, not directly to the interface or abstract class.
// Reference type belongs to the parent type (interface/abstract class).
// Actual object type is the compiler-generated anonymous class.
// Interface Case
// new A(){} does not call a constructor of A.
// Interfaces do not have constructors.
// A only tells Java which interface to implement.
// Abstract Class Case
// Anonymous class extends the abstract class.
// Abstract methods must be implemented.
// Parent constructor can be executed.
// Meaning of A()
// Normal class → constructor call.
// Abstract class → parent constructor may be called through inheritance.
// Interface → not a constructor call; only specifies the interface to implement.
// Hidden Class Generation
// Compiler creates a hidden class automatically.
// Anonymous class gets names like:
// Demo$1
// Demo$2
// Can be viewed using javap.
// $ Symbol
// Used by compiler for inner/nested classes.
// Demo$1 means first anonymous class inside Demo.
// Demo$Inner means named inner class.
// Number of Classes and Objects
// One anonymous class expression ⇒ one hidden class.
// Every execution of new ⇒ one object.
// One anonymous class can create multiple objects.
// Multiple Inheritance Discussion
// Anonymous class cannot directly extend a class and implement an interface together.
// Can extend one class OR implement one interface.
// If parent class already implements interfaces, anonymous class inherits them.
// Anonymous Class Nature
// Has no name.
// Cannot have a named constructor.
// Cannot be declared as a top-level class.
// Exists inside another class/method/block.
// Important Understanding
// new A(){} does not mean creating an object of interface A.
// It means creating an object of a hidden class that implements/extends A.

// Similar to:

// A obj = new HiddenClass();
// javap Discussion
// Compile code using javac.
// Use javap Demo$1.
// You can see:
// implements A
// or extends A
// This proves the compiler creates a separate hidden class.



 abstract class A
{
abstract void show();
}

class Demo extends A
{
void show()
{
// Demo's implementation
}

void test()
{
    A a = new A()
    {
        public void show()
        {
            System.out.println("Implementation");
        }
    };

    a.show();
}
// one annonyms class crate one object for multiple make this :

A method_Any_Name()
{
    return new A()
    {
        public void show()
        {
            System.out.println("Implementation");
        }
    };
}

public static void main(String[] args)
{
    Demo d = new Demo();

    d.test();

    A obj = d.method_Any_Name();
    obj.show();
}

}


// approach 2 as a instance 

// abstract class A
// {
//     abstract void show();
// }

// class Demo
// {
//     // Instance variable
//     A a = new A()
//     {
//         public void show()
//         {
//             System.out.println("Anonymous Class");
//         }
//     };

//     public static void main(String[] args)
//     {
//         Demo d = new Demo();

//         d.a.show();
//     }
// }
