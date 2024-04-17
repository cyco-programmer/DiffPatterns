/* 1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 */
class NumberPattern3
{
    public static void main(String args[])
    {
        int n=5,j,i;
        for( i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}