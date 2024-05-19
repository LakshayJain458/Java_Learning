import java.util.*;
public class fibonacci
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. upto which series is required :: ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b );
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}


//using recursion :
//public static void  fib(int a,int b,int n)
//        {
//            if(n==0)
//        {
//            return ;
//        }
//            System.out.println(a);
//           int  c=a+b;
//        fib(b,c,n-1);
//        }
//        public static void main(String []args)
//        {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number :: ");
//        int n = sc.nextInt();
//            fib(0,1,n);
//        }
//}
