import java.util.Scanner;

public class factorial
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :: ");
        int n = sc.nextInt();
        int fact=1;
        int i=1;
        if(n<=0) {
            System.out.println("Invalid Input.");
        }
        else {
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
        }
    }
}

//using recursion :
//public static int  fact(int n)
//        {
//            if(n==0||n==1)
//        {
//            return 1;
//        }
//            return n*fact(n-1);
//        }
//        public static void main(String []args)
//        {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number :: ");
//        int n = sc.nextInt();
//        int ans=fact(n);
//            System.out.println(ans);
//        }
//}
