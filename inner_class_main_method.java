class Outer
{
    void show()
    {
        System.out.println("This is the method of outer  class");
    }
   static class inner
    { 
        void show()
        {
            System.out.println("This is the show method of inner class");
        }
       public static void main()
       {
              inner i = new inner();
              i.show();
              Outer o = new Outer();
              o.show();
            //   Outer.inner ik =o.new inner();
            //   ik.show();
       }
      
    }

    public static void main()
    {
          System.out.println("This is outer main method");
    }
}