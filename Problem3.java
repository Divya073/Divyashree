package stringprograms;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        scanner.close();
        
        generateSeries(a);
    }
    
    public static void generateSeries(int a) {
        int maxNumber;
        if (a % 2 == 1) 
        { 
            maxNumber = 2 * a - 1;
        } else 
        {
            maxNumber = 2 * (a - 1) - 1;
        }
        
        StringBuilder series = new StringBuilder();
        for (int i = 1; i <= maxNumber; i += 2) {
            if (series.length() > 0) {
                series.append(", ");
            }
            series.append(i);
        }
        
        System.out.println(series.toString());
    }
}
