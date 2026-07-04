// The String class and all the wrapper classes implements java.io.Serializable interface by default. Deserialization is the reverse operation of serialization.
// Serialization in java is a mechanism of writing the state of an object into a byte stream. 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serailization implements Serializable  {
    int i=20;
    int j=30;
    public static void main() throws Exception
    { // searlization => stored current object state in file 
        Serailization se = new Serailization();
        File f = new File("pqrst.txt");
        f.createNewFile();

        FileOutputStream fs = new FileOutputStream(f);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(se);

        // Desearilization 
//         When readObject() executes:

// JVM allocates memory for a new object.
// It fills that object with the saved data from the file.
// It returns a reference to this newly created object.

The old object may not even exist anymore when you deserialize.

        FileInputStream is = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(is);
       Serailization sr = (Serailization)oi.readObject();

        System.out.println(sr.i);
        System.out.println(sr.j);
        
         se.i=20;
         se.j=56;

         
        System.out.println(se.i);
        System.out.println(se.j);

        
        System.out.println(sr.i);
        System.out.println(sr.j);

        //== give false;

    }
}
