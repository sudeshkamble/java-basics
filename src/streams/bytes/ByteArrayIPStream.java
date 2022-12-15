package streams.bytes;

// Java Program to Demonstrate ByteArrayInputStream Class
// Via mark(), read(), skip(), available(),
// markSupported(), close(), reset() Method

// Importing required classes
import java.io.*;

// Main class
public class ByteArrayIPStream {

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        // Declaring and initializing byte array
        byte[] buffer = { 74, 65, 86, 65, 56};
        ByteArrayInputStream ipStream = null;

        // Try block to check for exceptions
        try {
            ipStream = new ByteArrayInputStream(buffer);

            // Telling the no. of bytes to be read
            // using available() method
            int number = ipStream.available();
            System.out.println("Use of available() method : " + number);

            // Reading and printing Characters one by one
            // using read() method
            System.out.println("\nChar : "
                    + (char)ipStream.read());
            System.out.println("Char : "
                    + (char)ipStream.read());
            System.out.println("Char : "
                    + (char)ipStream.read());



            // Skipping 'A' from "JAVA8"
            // using skip() method
            ipStream.skip(1);
            System.out.println(
                    "skip() method comes to play");

            System.out.println("Char : "
                    + (char)ipStream.read());

            // Usage of markSupported() method
            boolean check = ipStream.markSupported();
            System.out.println("\nmarkSupported() : "
                    + check);

            if (ipStream.markSupported()) {

                // Repositioning the stream to marked
                // positions using reset() method
                ipStream.reset();

                System.out.println("\nreset() invoked");
                System.out.println("Char : "
                        + (char)ipStream.read());
                System.out.println("Char : "
                        + (char)ipStream.read());
            }
            else {
                System.out.println(
                        "reset() method not supported.");
            }

            System.out.println(
                    "ipStream.markSupported() supported reset() : "
                            + check);
        }

        // Catch block to handle the exceptions
        catch (Exception except) {

            // Displaying the exception along with line
            // number using printStackTrace() method
            except.printStackTrace();
        }

        // finally block that execute for sure
        finally {

            // Releasing the resources back to GC when
            // closes
            if (ipStream != null) {

                // Closing the file and releasing resources
                // using close() method
                ipStream.close();
            }
        }
    }
}

