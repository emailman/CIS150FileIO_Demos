package p2;

/*
 * Created by emailman on 3/1/2016
 * Write text to a file
 * Existing content will be overwritten
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Try with resources closes file when done
        try (PrintWriter output = new PrintWriter(new File("output.txt"))) {

            for (int i = 2; i < 102; i += 2) {
                output.println(i);
            }
        }
    }
}
