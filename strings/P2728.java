package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2728 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line != null && !line.isEmpty()) {
            int[] v = {0, 0, 0, 0, 0};
            String[] lineList = line.toLowerCase().split("-");
            for (String s : lineList) {
                if ((s.charAt(0) == 'l' || s.charAt(s.length() - 1) == 'l') && v[3] == 1) {
                    v[4] = 1;
                } else if ((s.charAt(0) == 'o' || s.charAt(s.length() - 1) == 'o') && v[2] == 1) {
                    v[3] = 1;
                } else if ((s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'b') && v[1] == 1) {
                    v[2] = 1;
                } else if ((s.charAt(0) == 'o' || s.charAt(s.length() - 1) == 'o') && v[0] == 1) {
                    v[1] = 1;
                } else if (s.charAt(0) == 'c' || s.charAt(s.length() - 1) == 'c') {
                    v[0] = 1;
                }
            }
            int cont = 0;
            for (int j = 0; j < 5; j++) {
                if (v[j] == 1) {
                    cont++;
                }
            }
            if (cont == 5) {
                System.out.println("GRACE HOPPER");
            } else {
                System.out.println("BUG");
            }
            line = br.readLine();
        }
    }
}