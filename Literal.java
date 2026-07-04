public class Literal
{
    public static void main(String[] args)
    {
        // literals = direct value assignment to the variable not taken from user at run time

        int dec=545;// stores decimal number fromt,
        int bin =0b101; int bin2 =0B101;// stores number in binary format //101=5 but memory stored 5
        System.out.println(bin); 
        System.out.println(bin); // returnes five
        int x=0x7E; // stores hexadecimal
        /*
        7 × 16¹ + E × 16⁰
        7 × 16 + 14 × 1
         =  112 + 14
            = 126
         */
        System.out.println(x); //126

        int num=100_00_00_00; // also valid
        System.out.println(num);// but stored withoutb _ symbol;
        double d = 12e10;

         //e means 10th power of 12;
        System.out.println(d);
        boolean b =true;
        char c='A';
       // c=c+1; // inavalid beacuse + add two integers
        c++; // valid
        System.out.println(c);







    }
}