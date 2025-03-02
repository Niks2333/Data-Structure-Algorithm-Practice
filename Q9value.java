import java.util.Scanner;

public class Q9value {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int sum=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='0')
            {
                sum+=1;
            }
            else
            {
                sum+=2;
            }
        }
        System.out.println(sum);
        sc.close();
    }

}
