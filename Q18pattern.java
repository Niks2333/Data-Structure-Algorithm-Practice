import java.util.Scanner;

public class Q18pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) { 
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else { 
                for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
