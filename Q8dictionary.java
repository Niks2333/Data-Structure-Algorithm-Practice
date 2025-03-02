import java.util.HashMap;
import java.util.Scanner;

public class Q8dictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charCount);
        sc.close();
    }
    }

