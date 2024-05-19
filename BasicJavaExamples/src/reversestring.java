import java.util.*;
public class reversestring
{
    public static void reverse(String s, int i)
    {
        if(i==0)
        {
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s,i-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string :: ");
        String a= sc.nextLine();
        int i=a.length()-1;
        reverse(a,i);
    }
}
