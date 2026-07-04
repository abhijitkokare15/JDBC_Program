class Cal
{ // properties
    int nu   m1=10; // default is 0
    int num2=20; // default is 0

    // behaviour
    int  add()
    {
        return num1+num2;
    }

    public static void main()
{
    // object creation
    Cal cal = new Cal();
    System.out.println(cal);
    //new =>allocate dynamic (runtime) memeory.
    //cal.add() accessing methos same way for memebers
   // System.out.println(cal.add());
}
}