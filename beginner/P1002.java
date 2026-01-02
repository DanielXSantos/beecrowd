package beginner;
import java.io.IOException;
import java.util.Scanner;

public class P1002 {
 
    public static void main(String[] args) throws IOException {
        Double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        Double r = scanner.nextDouble();
        System.out.println("A=" + String.format("%.4f", pi * r * r));
    }
 
}