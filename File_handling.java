// If you want to write...	Use
// Text (.txt, .java, .properties)	✅ BufferedWriter (Best)
// Images (.jpg, .png)	✅ FileOutputStream
// PDF, MP3, ZIP, EXE	✅ FileOutputStream
// Small amount of text	FileWriter is okay
// Large amount of text	✅ BufferedWriter


//https://www.w3schools.com/java/java_files.asp

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_handling {

    public static void main(String[] args) throws Exception
    {
        File f = new File("pain.jpg");
        f.createNewFile();

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("This is the game");
        dos.close();

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        String s = dis.readUTF();

        System.out.println(s);

        dis.close();
    }
}
   
