import java.util.*;
class Q5prime
{
    public static void main(String asr[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the no is prime");
        }
        else
        {
            System.out.println("the no is odd");
        }
        sc.close();
    }
}