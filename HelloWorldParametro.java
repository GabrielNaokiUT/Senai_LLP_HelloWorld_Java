import java.util.Scanner;

public class HelloWorldParametro{
    public static void main(String[] args) {
        // Imprime "Hello World" e os parâmetros, se houver
        System.out.print("Hello World");
        for (String arg : args) {
            System.out.print(" " + arg);
        }
        System.out.println();
    }
}

