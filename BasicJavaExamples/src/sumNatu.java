import java.util.*;
// WAP for the sum of natural numbers.
public class sumNatu {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. upto which sum is required :: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
             sum=sum+i;
        }
        System.out.println("Required sum is :: "+sum);
    }
}

    //Using recursion:
//    public static void sumnatural(int n, int sum) {
//        if(n==0)
//        {
//            System.out.println(sum);
//            return;
//        }
//        sum += n;
//        sumnatural(n-1,sum);
//    }
//    public static void main(String[]args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the no. upto which sum is required :: ");
//        int n=sc.nextInt();
//        sumnatural(n,0);
//    }
//}