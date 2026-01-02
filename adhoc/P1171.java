package adhoc;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
        }
        scanner.close();
    }
}