package basic;
import java.io.IOException;
import java.util.Scanner;

public class P1003 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        Integer SOMA = a + b;

        System.out.println("SOMA = " + SOMA);
    }
 
}