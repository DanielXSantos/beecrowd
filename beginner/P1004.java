package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1004 {

    public static void main(String[] args) throws NumberFormatException,
            IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        int A, B, PROD;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);

    }
}