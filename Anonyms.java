// Object creation in Java
// Anonymous objects in Java
// Difference between Simple objects and Anonymous objects


// #1
// In JVM, we have both stack memory and heap memory.
// Object is created in the heap memory that contains  variable and methods, it also have some address.
// A obj=new A();
//   obj.show();
// here, A is the classname.
//          obj refers to the address say 101
//     show() is a method that is called using reference variable obj.
// Every time you call an object, it will call the constructor as well.
// Object creation can be done in two ways:
//  1. Declare an object  - creating a reference
//  2. Creating an object  - and assigning the value to it
// e,g.,  A obj;
//   obj=new A();
//  *new A() shows that you are creating an object.
// Reference of an object is created in the stack.


// #2
// Anonymous Objects:- 
// Anonymous objects are simply created by using the new keyword.
// It does not have any reference for an anonymous object.
// e.g., new A();
// A method can directly be called using this object.
//   new A().show();
// We can't use the same anonymous object again. It will be use only for one tim
class Anonyms
{
  int i;
  
  void show(int i)
  {
    // if(count==5)
    //   return;
     this.i=i;
     System.out.println("the value of i:  "+this.i+"  for  "+this);
    // this.show(i+1,++count);


  }
}

void main()
{
  new Anonyms().show(1);
  //this.show(5);
   run();
  //new Anonyms().show(20);
}

void run()
{
  IO.println("come here");

}