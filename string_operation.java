import java.util.Scanner;

public class string_operationa
{
    void main()
    {
        String s1,s2;
        System.out.println("Enter the two string:");
        Scanner sc = new Scanner(System.in);

    s1=sc.nextLine();
    s2=sc.nextLine();

    String s3=s1.concat(s2);
    String s4=s1+s2;

    System.out.println("Concatinationn of two string is"+s3);
    System.out.println("Concatinationn of two string is"+s4);

    System.out.println("s1 len:"+s1.length());
    System.out.println("s2 len:"+s2.lenght());

    System.out.println("UPPER OF S1:"+s1.toUpperCase());
    }
}

// We can perform various operation on String in java. The following are the operations:
// Length():use to can find length of string.
// Concat():use to concat two strings.
// Split():use to split a string.
// Replace:use to replace a string.
// Substring:let you select a part of string.