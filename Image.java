import java.io.*;

public class Image {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("pain.jpg");
        FileOutputStream fos = new FileOutputStream("Naruto.jpg");

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("Image copied successfully.");
    }
}