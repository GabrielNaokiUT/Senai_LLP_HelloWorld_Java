import java.util.Scanner;

class HelloworldInteracao{

    public static void main(String [] args){

        System.out.print("Informe seu nome:");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Hello World " + nome);

    }
    
}
