package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3092 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int[] v = {0, 0, 0, 0};
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'Q') {
                    v[0] = 1;
                } else if (line.charAt(j) == 'J' && v[0] == 1) {
                    v[1] = 1;
                } else if (line.charAt(j) == 'K' && v[1] == 1) {
                    v[2] = 1;
                } else if (line.charAt(j) == 'A' && v[2] == 1) {
                    v[3] = 1;
                }
            }
            int cont = 0;
            for (int j = 0; j < 4; j++) {
                if (v[j] == 1) {
                    cont++;
                }
            }
            if (cont == 4) {
                System.out.println("Agora vai");
            } else {
                System.out.println("Agora apertou sem abracar");
            }

        }
    }
}