package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3170 {

    public static void main(String[] args) throws IOException {
        Integer a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        Double ans = ((Math.ceil(b / 2)) - a);

        if (ans > 0) {
            System.out.printf("Faltam %.0f bolinha(s)\n", ans);
        } else {
            System.out.println("Amelia tem todas bolinhas!");
        }
    }
}
