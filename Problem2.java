package stringprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        
        List<Integer> series = generateOddSeries(a);
        System.out.println("Output: " + formatSeries(series));
        
        scanner.close();
    }

    public static List<Integer> generateOddSeries(int a) {
        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            series.add(2 * i - 1);
        }
        return series;
    }

    public static String formatSeries(List<Integer> series) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < series.size(); i++) {
            sb.append(series.get(i));
            if (i < series.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
