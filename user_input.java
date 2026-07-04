// System.in.read() in java is used to read the input from the user.
// System.in.read() gets the next byte of input from the standard input stream.


public class user_input {
    public static void main() throws Exception 
    {
        int i =System.in.read();
        System.out.println(i );// return ascii value;
        System.out.println(i-48 );// Convert ascii to number 
        System.out.println ((char)i);// character 

        String s ="";
        int j=System.in.read();
         while (j != '\n' && j != -1) {
            if (j != '\r')
                s += (char) j;

            j = System.in.read();
        }

        System.out.println(s);
    }

    }

