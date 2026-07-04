// Resources are introduced in java 1.7 and later. 
// Resource should write in try as a parameter. And then no need to write catch and finally block along with the try block.
// A resource is an object that uses something outside normal Java memory and therefore may need to be released after use.

// Examples:

// File
// Database Connection
// Network Socket
// Input/Output Stream
// Scanner
// BufferedReader

// These resources often use:

// Operating System file handles
// Database connections
// Network connections

// no neede it automatically close resource

import java.io.*;


public class Excetion_resource {
    public static void main() throws Exception
    {
           try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
           {
               String sr="";
               sr=br.readLine();
           }

        //    catch(Exception e)
        //    {
        //     System.out.println(e);
        //    }
    }
 }
