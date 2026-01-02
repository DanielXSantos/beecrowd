package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P3038 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            s = s.replaceAll("@", "a");
            s = s.replaceAll("&", "e");
            s = s.replaceAll("!", "i");
            s = s.replaceAll("\\*", "o");
            s = s.replaceAll("#", "u");
            System.out.println(s);
        }
    }
}