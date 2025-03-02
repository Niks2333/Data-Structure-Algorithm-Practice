import java.util.Scanner;

public class Q7pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        sc.close();

        int i = 0;  
        while (i < n) {
            int spaces = i;
            while (spaces > 0) {  
                System.out.print("  ");
                spaces--;
            }

            int j = n - i;  
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            
            System.out.println(); 
            i++;
        }
    }
}
