package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.charAt(0) > s.charAt(2) && s.charAt(0) > s.charAt(4)) {
            if (s.charAt(2) > s.charAt(4)) {
                System.out.println("zezinho");
            } else {
                System.out.println("luisinho");
            }
        } else if (s.charAt(0) > s.charAt(2) && s.charAt(0) < s.charAt(4)) {
            System.out.println("huguinho");
        } else if(s.charAt(0) > s.charAt(4)) {
            System.out.println("huguinho");
        } else {
            if(s.charAt(2) > s.charAt(4)) {
                System.out.println("luisinho");
            }else {
                System.out.println("zezinho");
            }
        }
    }
}