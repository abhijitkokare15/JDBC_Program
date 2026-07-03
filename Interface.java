 // interface object is n ot created because it is like incomplete just like abstact class
//  Java does not support multiple inheritance because A Java class can only extend one parent class.
// Multiple inheritance is not allowed. with the help of "Interface" we can use multiple inheritance.
// Interfaces are not classes, however, and an interface can extend more than one parent interface. 
// The extends keyword is used once, and the parent interfaces are declared in a comma-separated list.
// if class implement interface must also defined all its method
 // interface can not have cconstrcutor so no object 
 // we can crate  reference of interface
 // use : implement multipple inheritance and 
// use 2 : provide security by hiding base class methods 
// method must be public in implemented class


interface A
{
    void show(); // by defaut public and abstact 
} 

class Interface implements A 
{
   public  void show()

    {
        System.out.println("show ");
    }

    void dis()
    {
        System.out.println("dis ");
    }
    public static void main()
    {
       Interface b = new Interface();
       b.show();
       b. dis();

       A a = new Interface();
       a.show();
       //a.dis();// beacuse  this does not belongs to intrface 
    }
}