import java.util.*;
class Q3pattern
{
    public static void main(String args[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {   
            int no=i%10;
            if(no<6&&no>0)
            {
                System.out.print(i+" ");
            }
            else if(no>5 || no==0)
            {
                System.out.print("*"+" ");
            }
        }
        sc.close();
        
    }
}