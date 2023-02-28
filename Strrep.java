import java.util.*;
public class Strrep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println("Enter the char to replace");
        char ch=sc.nextLine().charAt(0);
        System.out.println("Enter the replacing char");
        char newx=sc.nextLine().charAt(0);
        String str=new String();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                str=str+newx;
            }
            else
            {
                str=str+s.charAt(i);
            }
        }
        System.out.println("the new string is "+str);
    }
}