package io.acaeronte;


import junit.textui.ResultPrinter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ResultPrinter resultPrinter = new ResultPrinter(new PrintStream(new File("hola.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new RuntimeException(e);
        }

        System.out.println( "Hello World!" );
    }
}
