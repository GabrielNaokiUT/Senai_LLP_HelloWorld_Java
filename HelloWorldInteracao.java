import java.util.Scanner;

public class HelloWorldInteracao{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Hello World " + nome +"!");
    }
} 
