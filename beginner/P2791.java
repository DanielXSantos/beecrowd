package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2791 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("1")) {
                System.out.println(i + 1);
            }
        }
    }
}