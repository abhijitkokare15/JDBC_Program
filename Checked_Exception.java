// A checked exception is a type of exception that must be either caught or declared in the method in which it is thrown. 
//  The java.io.IOException is a checked exception.We can write one try block with multiple catch blocks.


import java.io.*;
public class Checked_Exception {
    
   public static void main(String[] args) {
   try {

    BufferedReader br = new BufferedReader(new FileReader("fgt.txt"));
       

    String s = br.readLine();

    System.out.println(s);

    br.close();
}

catch(IOException e) {

    try {

        BufferedReader br2 =new BufferedReader(new FileReader("abc.txt"));

        String s = br2.readLine();

        System.out.println(s);

        br2.close();
    }

    catch(IOException ex) {
        ex.printStackTrace();
    }
}
    }
}
