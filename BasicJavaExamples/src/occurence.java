import java.util.*;
//Q find first and last occurence of an element?
public class occurence
{
    public static int a=-1;
    public static int b=-1;
    public static void occur(String s, int i, char n)
    {
        if(i==s.length())
        {
            System.out.println(a);
            System.out.println(b);
            return;
        }
        char currchar=s.charAt(i);
        if(currchar==n)
        {
            if(a==-1)
            {
                a=i;
            }
            else {
                b=i;
            }
        }
        occur(s,i+1,n);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string :: ");
        String s= sc.next();
        System.out.println("enter an element :: ");
        char n=sc.next().charAt(0);
        occur(s,0,n);
    }
}
