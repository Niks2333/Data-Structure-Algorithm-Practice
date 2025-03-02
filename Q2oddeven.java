import java.util.*;
class Q2oddeven
{
    public static void main(String ag[])
    {
        int n=0;
        

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] even=new int[n/2];
        int[] odd=new int[n/2];
        int  evencurr=0;
        int oddcurr=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even[evencurr++]=i;
            }
            else
            {
                odd[oddcurr++]=i;
            }
        }
        for(int num:even)
        {
            System.out.print(num+" ");
            
        }
        System.out.println();
        for(int num:odd)
        {
            System.out.print(num+" ");
        }
        sc.close();

    }
}