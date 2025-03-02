import java.util.Scanner;

public class Q11palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pali=sc.nextLine();
        sc.close();
        for(int i=0;i<pali.length()/2;i++)
        {
            if(pali.charAt(i)!=pali.charAt(pali.length()-1-i))
            {
                System.out.println("not a palindrome");
                return;
            }

          
        }
       
        System.out.println("the string is palindrome");
    }
}
