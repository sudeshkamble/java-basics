package streams.bytes;

import java.io.*;
public class ByteArrayOPStream
{
    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        byte[] buffer = {'J', 'A', 'V', 'A'};

        // Use of write(byte[] buffer, int offset, int maxlen)
        output.write(buffer, 0, 4);
        System.out.print("Use of write(buffer, offset, maxlen) by toByteArray() : ");

        // Use of toByteArray() :
        for (byte b: output.toByteArray())
        {
            System.out.print(" " + b);
        }

        int size = output.size();
        System.out.println("Use of size() : " + size);

        // USe of toString() :
        String toString = output.toString();
        System.out.println("Use of toString() : "+ toString);

        // Use of toString(String charsetName)
        String charset = output.toString("UTF-8");
        System.out.println("Use of toString(String charsetName) : "+ charset);
    }
}