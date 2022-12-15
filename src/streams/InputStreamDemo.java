package streams;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        InputStream ipStream = null;
        try {

            ipStream = new FileInputStream("input.txt");

            // read() method : reading and printing Characters
            // one by one
            System.out.println("Char : " + (char) ipStream.read());
            System.out.println("Char : " + (char) ipStream.read());
            System.out.println("Char : " + (char) ipStream.read());

            ipStream.skip(1);
            System.out.println("skip() method comes to play");

            System.out.println("Char : " + (char) ipStream.read());
            System.out.println("Char : " + (char) ipStream.read());
            System.out.println("Char : " + (char) ipStream.read());

            boolean check = ipStream.markSupported();
            if (ipStream.markSupported()) {
                // reset() method : repositioning the stram to
                // marked positions.
                ipStream.reset();
                System.out.println("reset() invoked");
                System.out.println("Char : " + (char) ipStream.read());
                System.out.println("Char : " + (char) ipStream.read());
            } else
                System.out.println("reset() method not supported.");


            System.out.println("ipStream.markSupported() supported" +
                    " reset() : " + check);

        } catch (Exception excpt) {
            // in case of I/O error
            excpt.printStackTrace();
        } finally {
            // releasing the resources back to the
            // GarbageCollector when closes
            if (ipStream != null) {
                // Use of close() : closing the file
                // and releasing resources
                ipStream.close();
            }
        }
    }
}