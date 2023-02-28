import java.util.*;
class Student
{
    Scanner sc=new Scanner(System.in);
    String sub[]={"Maths","OOP","DS","PE","SE"};
    int mark[]=new int[5];
    String name;
    int rno,i;

    void input()
        {
        System.out.println("Enter the Student");
        System.out.println("\n Name :");
        name=sc.nextLine();
        System.out.println("\n Roll Number: ");
        rno=sc.nextInt();
        System.out.println("Enter the 5 marks: ");
        for(i=0;i<5;i++)
        {
            System.out.println(sub[i]+" = ");
            mark[i]=sc.nextInt();
        } 
        }
    
    void display()
    {
        System.out.println("Student Details");
        System.out.println("Name ="+name+"\n Roll Number ="+rno+"\n Marks");
        for(i=0;i<5;i++)
        {
            System.out.println(sub[i]+"="+mark[i]);
        }
    }
}
    public class Stufun
    {
    public static void main(String args[])
    {
       
        Student[] s1=new Student[3];
        
        for(int i=0;i<3;i++)
        {
            s1[i]=new Student();
            s1[i].input();
        }
        for(int i=0;i<3;i++)
        {
            s1[i].display();
        }
        
        
    }
}