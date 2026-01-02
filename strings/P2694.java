package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P2694 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            s += "a";
            int sum = 0;
            String digit = "";
            for(int j =0; j < s.length(); j++) {
                if(Character.isDigit(s.charAt(j))) {
                    digit = digit + s.charAt(j);
                } else {
                    if(digit != "") {
                        sum = sum + Integer.parseInt(digit);
                    }
                    digit = "";
                }
            }
            System.out.println("" + sum);
        }

    }
}