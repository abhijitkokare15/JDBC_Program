import java.util.Scanner;

class Whileloop
{
    public static void main(String[] args)
    
{
    int i=1;
    while(i<=5)

    {
        System.out.println("Hi");
        int j=1;

         while(j<=3)
         {
             System.out.println("while hi"+j);
             ++j;
         }
         ++i;
    }

    System.out.println("bye i ->"+i);

}
}