// <!-- Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.

// The idea behind inheritance in java is that you can create new classes that are built upon existing classes.

//  When you inherit from an existing class, you can reuse methods and fields of parent class, and you can add new methods and fields also.

// Inheritance represents the IS-A relationship, also known as parent-child relationship.

// In the terminology of Java, a class that is inherited is called a super class. The new class is called a subclass.

// Types of inheritance in java are:
// 1 simple/single level inheritance
// 2 multilevel
// 3 hierarchical -->


// Inheritance in java is a mechanism in which one object acquires all the properties and
// behaviors of parent object.
// The idea behind inheritance in java is that you can create new classes that are built upon
// existing classes.
// When you inherit from an existing class, you can reuse methods and fields of parent class,
// and you can add new methods and fields also.
// Inheritance represents the IS-A relationship, also known as parent-child relationship.
// The extends keyword indicates that you are making a new class that derives from an existing
// class.
// A class that is inherited is called a super class.
// The new class is called a subclass.

// There can be three types of inheritance in java: single, multilevel and hierarchical.
// In java programming, multiple and hybrid inheritance is supported through interface only.


class A
{
    int i,j;
    void sum()
    {
       System.out.println(i+j);   
    }

    public static void main(String[]args)
    { 
        c obj = new c();
        obj.i=20;
        obj.j=30;
       obj.sum();
       obj.sub();
       obj.mul();

    
      

    } 
}

class  B extends A
{

    void sub()
    {
        System.out.println(i-j);
    }

}

class c extends B
{
    void mul()
    {
        System.out.println(i*j);
    }
}

