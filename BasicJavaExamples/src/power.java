//Q1. Print x^n (with stack height = n)
public class power {
public static void main(String []args)
{
    long n=13;
    long x=8;
    long sqr=1;
    for(int i=1;i<=n;i++)
    {
        sqr*=x;
    }
    System.out.println(sqr);
}
}

//Using recursion :

//    public static int power(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return 1;
//        }
//        return x * power(x, n - 1);
//    }
//    public static void main(String []args)
//    {
//        int x=13;
//        int n=8;
//        int ans=power(x,n);
//        System.out.println(ans);
//    }
//}

    //   Q2 Print x^n (with stack height = logn)?
//    public static int power(int x, int n)
//    {
//        if (n == 0) {
//            return 1;
//        }
//        if (n % 2 == 0) {
//            return power(x, n / 2) * power(x, n / 2);
//        } else {
//            return power(x, n / 2) * power(x, n / 2) * x;
//        }
//    }
//        public static void main(String[] args)
//        {
//            int x = 8;
//            int n = 10;
//            int ans = power(x, n);
//            System.out.println(ans);
//        }
//}