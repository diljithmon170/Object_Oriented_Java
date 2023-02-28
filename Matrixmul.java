import java.util.*;
public class Matrixmul
{
    public static void main(String args[])
    {
        System.out.println("Enter the 1st Matrix \n Row: ");
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        System.out.println("\n Column: ");
        int c1=sc.nextInt();
        System.out.println("Enter the 2nd Matrix \n Row: ");
        int r2=sc.nextInt();
        System.out.println("\n Column: ");
        int c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("Multiplication is not possible ");
        }
        else
        {
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int c[][]=new int[r1][c2];
            int i,j,k;
            System.out.println("Enter the values into the 1st Matrix: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the values into the 2nd Matrix: ");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            // multiplication
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    c[i][j]=0;
                    for(k=0;k<c1;k++)
                    {
                    c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            // result
            System.out.println("The result is: ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}