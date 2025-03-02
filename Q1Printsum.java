import java.util.*;
public class Q1Printsum
{
    public static void main(String args[])
    {   
        int n=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}