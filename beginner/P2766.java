package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P2766 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            line = br.readLine();
            nomes.add(line);
        }
        System.out.println(nomes.get(2));
        System.out.println(nomes.get(6));
        System.out.println(nomes.get(8));
    }
}