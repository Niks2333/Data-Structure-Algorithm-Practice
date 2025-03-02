import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12fibonachi {
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fib = new ArrayList<>();
        if (n <= 0) return fib;
        
        fib.add(0);
        if (n == 1) return fib;
        
        fib.add(1);
        for (int i = 2; i < n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();;
        System.out.println(generateFibonacci(n));
    }
}
