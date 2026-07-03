// In Java, base class  constructor with no argument gets automatically called in derived class constructor. 
// if you want to call parameterized contructor of base class, then  use super()

class A
{
    A()
    {
        IO.println("inside the parent class A" );
    }

  A(int i)
  {
     IO.println("inside the parent class A with para" );
  }

    void show()
    {
        IO.println("Welcome to the Inheritance");
    }

    public static void main()
    {
        B obj = new B(10);

    }
}

class B extends A
{
    B()
    {
        //super();
         IO.println("inside the parent class B" );
    }
    B(int i)
    {
        super(i);
        IO.println("inside the parent class B with para" );
        
    }
    void display()
    {
        IO.println("Welcome to the Inheritance II");
    }
}