//javac =>look up file
//java =>look up class with main method 



//class can extend noraml and abstact class and implement interface
//if interface method is defined in absctsct class no neede to redeined it
//if interface and class contain same abstct method only one defination is provided
// but public is mandatory in case of interface






interface Interface
{
    // Interface variables are public static final
    int a = 10;

    void show();
    void view();
}

abstract class AbstractClass
{
    abstract void dis();
    abstract void view();

   public  void show()
    {
        System.out.println("Welcome");
    }
}

class Test extends AbstractClass implements Interface
{
    public void dis()
    {
        System.out.println("Come on");
    }

    public void view()
    {
        System.out.println("View Method");
    }
      // use this if in abstact class this method is not public default method in java is default
    // public void show()
    // {
    //     super.show();
    // }

    public static void main(String[] args)
    {
        Test t = new Test();
        t.dis();
        t.show();
        t.view();
    }
}