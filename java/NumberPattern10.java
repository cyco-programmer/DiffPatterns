/*Enter the value of n : 2
2 2 2 
2 1 2 
2 2 2 */
import java.util.*;
class NumberPattern10
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        //upper part
        for(int i=n;i>=1;i--)
        {
            // triangle 1
            for(int j=n;j>=i;j--)
            System.out.print(j+" ");
            //triangle 2
            for(int j=1;j<=(i-1)*2;j++)
            System.out.print(i+" ");
            //triangle 3
            if(i!=0)
            for(int j=i+1;j<=n;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        //lower part
        for(int i=1;i<n;i++)
        {
            // triangle 4
            for(int j=n;j>i;j--)
            System.out.print(j+" ");
            //triangle 5
            for(int j=1;j<=2*i-1;j++)
            System.out.print(i+1+" ");
            //triangle 6
            for(int j=1+1;j<=n;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        }
    }