import java.beans.XMLEncoder;
import java.io.ObjectOutputStream;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;


// XMLEncoder does not use Java's serialization mechanism.

// Instead, it does this:

// Calls the public no-argument constructor.
// Calls the getter methods to get the values.
// Writes those values as XML.
public class Serailization_xml {

    int rollno;
    //String name = "Readdy";
    

    

    public static void main(String[] args) throws Exception {
              
        FileOutputStream fo = new FileOutputStream("efgh.xml");

        XMLEncoder xe = new XMLEncoder(fo);

        Serailization_xml xm = new Serailization_xml();
                   xm.setRollno(45);


        xe.writeObject(xm);
        xe.close();
    }




    public int getRollno() {
        return rollno;
    }




    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}



   