// Java Programming/Keywords/super. 

// It is used inside a sub-class method definition to call a method defined in the super class. 

// Private methods of the super-class cannot be called. 

// Only public and protected methods can be called by the super keyword.
// Super is a keyword used in java to refer the super class or base class.

// If the method overrides one of its superclass&#3  9;s methods, overridden method can be

// invoked through the use of the keyword super. It can be also used to refer to a hidden field.

// super key word refer to parent class and it must be differnet for all classes
// super keyword is always excuted even no constructor is in parent class because in super works to initilaiz
//parent class memebrs as it it used for sub class
// IMP : no sub keyword is present.

 public class supersub {
    public static void main()
    {
      new B();
    }
}


class A
{
    int a;
   //  A(int a)
   //  {
   //    System.out.println("In class A value of a :"+a);
   //  }

    

}

class B extends A
{
   public B()
   {
      //int d;
     // super(10);
      System.out.println("Welcome");
      // super();
   }
   public void show()
   {
     // A a = new A();
    // super();
    // super.a=10;
     // System.out.println(a);
      
   }
}