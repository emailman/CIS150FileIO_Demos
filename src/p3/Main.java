package p3;

/*
 * Created by emailman on 3/1/2016
 * Append text to a file
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Note the file is being opened in append mode using "true"
        try (PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true))) {

            for (int i = 1; i < 101; i += 2) {
                output.println(i);
            }
        }
    }
}
