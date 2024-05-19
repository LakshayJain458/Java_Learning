import java.util.*;

// Arithmetic Progression nth Term in Java?
public class arithProg {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a , d  , n; //a = first term , d = diff. b/w adjacent no. , n = nth term to find?
        System.out.println("enter the first term of series :: a = ");
        a= sc.nextInt();
        System.out.println("enter the diff. b/w adjacent no. :: d = ");
        d= sc.nextInt();
        System.out.println("Enter the nth term :: n= ");
        n= sc.nextInt();
        int s=a+(n-1)*d;      //TN = a1 + (N-1) * d [formula to find ?]
        System.out.println("The "+n+"th term of the series is : "+s);
    }
}
