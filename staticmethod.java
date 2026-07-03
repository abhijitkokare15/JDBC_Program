// non-static variable is not allowed in sattic variable because this vriable brlongs to thee object not class 
//to use pass object as refernced.
//allowed static memebers


class B
{
    int a=10;
    static int st =30;
    public static void show()
    {
        IO.println("Static variable");
        IO.println(st);
      //  IO.println(a); // can't access direclty
        
    }
}
 
void main()
{
    B b =new B();
    b.show();
    B.show();
}
