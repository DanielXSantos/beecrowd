package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3358 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            String s = str;
            s = s.toLowerCase();
            int cont = 0;
            Boolean easy = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != 'a' && s.charAt(j) != 'e' && s.charAt(j) != 'i'
                        && s.charAt(j) != 'o' && s.charAt(j) != 'u') {
                    cont++;
                } else {
                    cont = 0;
                }
                if (cont == 3) {
                    easy = true;
                    break;
                }
            }
            if (easy) {
                System.out.printf("%s nao eh facil\n", str);
            } else {
                System.out.printf("%s eh facil\n", str);
            }
        }
    }
}