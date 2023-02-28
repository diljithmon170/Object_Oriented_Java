import java.util.*;
import java.io.*;
public class CreateFile
{
    public static void main(String args[])
    {
        try
        {
            File f1=new File("hellow.txt");
            if(f1.createNewFile())
            {
                System.out.println("new file is created");
            }
            else
            {
                System.out.println("already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}