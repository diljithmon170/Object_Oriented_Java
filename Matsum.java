import java.util.*;
public class Matsum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,r1,r2,c1,c2;
        
        System.out.println("Enter the 1st matrix row and column");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the 2st matrix row and column");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        if(r1==r2 && c1==c2)
        {
            System.out.println("Multiplication is possible");
            System.out.println("enter the values into the 1st matrix");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                a[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter the values into the 2nd matrix");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                b[i][j]=sc.nextInt();
                }
            }
            System.out.println("1st");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                   System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
            System.out.println("2nd");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                   System.out.print(b[i][j]+" ");
                }
                System.out.println(" ");
            }
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                   c[i][j]=a[i][j]+b[i][j];
                }
            } 
            System.out.println("The sum is");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                   System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
            System.out.println("The sum transpose is");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                   System.out.print(c[j][i]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}