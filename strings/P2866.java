package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = s.length()-1; j >= 0; j--) {
                if(Character.isLowerCase(s.charAt(j))) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}