
package exception;
import java.io.FileReader;
import java.io.IOException;

public class checkederror {


    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt"); // may throw FileNotFoundException
            int data = fr.read();                       // may throw IOException
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Error: " );
            e.printStackTrace();
            //nullpointerror!!!
            String CSD = null;
            System.out.println(CSD.length());
        }
    }
}



