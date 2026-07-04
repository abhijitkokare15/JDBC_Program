public class Constructor2 {
    double i;
  // construcot overloading  
    // Constructor2(int i) {
    //     this.i = i;
    //     System.out.println(this.i);
    // }

        Constructor2()
        {
            System.out.println(i);

        }
        //implicit coversion in constructor

        // Constructor2(double d)
        // {
        //     i=d;
        //     System.out.println("the constrcutor parametr value is:"+d);
        //     System.out.println("the value of double i:"+i);
        // } 
      Constructor2(int d) 
      {
           i=d;
            System.out.println("the constrcutor parametr value is:"+d);
            System.out.println("the value of double i:"+i);
      }
    public static void main(String[] args) {   
        Constructor2 c = new Constructor2(5); // java itself convert parmaeter from int to double.
    }
}