import java.util.Scanner;

public class input_scanner {
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// simply use it
       // int n=Intger.parseInt(sc.nextLine);
       sc.nextLine();// it also conatin enter as a string 
        String s = sc.nextLine();  
        
        System.out.println(n); 
         System.out.println(s);
        
    }
}
