/* 1
22
3 3
4  4
55555 */
import java.util.Scanner;
public class NumberPattern5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i || j==1 || i==n)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}