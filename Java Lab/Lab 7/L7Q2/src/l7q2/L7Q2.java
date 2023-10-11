
package l7q2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;

public class L7Q2 {

    public static void main(String[] args) {
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("index.htm"));
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            while (in.hasNext()) {
                outputStream.print(in.nextLine() + "\n");
            }

        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }
    
}
