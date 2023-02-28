import java.util.*;
public class Stringpal
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        for(i=0,j=s.length()-1;i<j;i++,j--)
        {
                if(s.charAt(i)!=s.charAt(j))
                {
                    System.out.println("not pallindrome");
                    break;
                } 
        }
        if(i>=j)
        {
            System.out.println("it is palindrome");
        }
    }
}