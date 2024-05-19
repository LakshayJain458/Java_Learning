import java.util.*;
public class towerOfHanoi
{
    public static void Toh(int n,String a,String b,String c)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+a+" to "+c);
            return;
        }
        Toh(n-1,a,c,b);
        System.out.println("transfer disk "+n+" from "+a+" to "+c);
        Toh(n-1,b,a,c);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of disks :: ");
        int n= sc.nextInt();
        Toh(n,"A","B","C");
    }
}
