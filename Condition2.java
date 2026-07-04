public class Condition2
{
    public static  void main(String[] args)
        {
            int a=10;
            int b=30;
            int c=90;

            if(a>b && a>b)
            {
                System.out.println(a);
            }

            else if(b>a && b>c)
            {
                System.out.println(b);
            }
            else if(c>a && c>b)
                System.out.println(c);
            else
                System.out.println("invalid");
        }
}