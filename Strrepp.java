import java.util.*;
public class Strrepp
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println("Enter the place to replace");
        char r=sc.nextLine().charAt(0);
        System.out.println("Enter the char to replace");
        char x=sc.nextLine().charAt(0);
        String str=new String();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==r)
        {
            str=str+x;
        }
        else
        {
            str+=s.charAt(i);
        }
        }
        System.out.println("the new string is: "+str);
    }
}