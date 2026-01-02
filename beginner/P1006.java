package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1006 {

    public static void main(String[] args) throws IOException, NumberFormatException {
        double A,B,C,MEDIA;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Double.parseDouble(br.readLine());
        B = Double.parseDouble(br.readLine());
        C = Double.parseDouble(br.readLine());

        MEDIA = ((A * 2 + B * 3 + C * 5) / 10);

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}