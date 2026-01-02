package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P2815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        List<String> newlineList = new ArrayList<>();
        for (String s : line) {
            if (s.length() <= 3) {
                newlineList.add(s);
                continue;
            }
            int i = 0;
            String newline = "";
            if (s.charAt(2) == s.charAt(0) && s.charAt(3) == s.charAt(1)) {
                i = 2;
            }
            newline = newline + s.substring(i);
            newlineList.add(newline);
        }
        for (int j = 0; j < newlineList.size() - 1; j++) {
            System.out.print(newlineList.get(j) + " ");
        }
        System.out.println(newlineList.get(newlineList.size() - 1));

    }
}
