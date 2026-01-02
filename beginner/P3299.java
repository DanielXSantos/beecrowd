package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P3299 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Boolean won = true;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == '1' && s.charAt(i) == '3') {
                won = false;
                break;
            }
        }
        if(won) {
            System.out.println(s + " NO es de Mala Suerte");
        } else {
            System.out.println(s + " es de Mala Suerte");
        }
    }

}