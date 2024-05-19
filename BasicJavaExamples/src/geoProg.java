import java.util.*;

// Geometric Progression nth Term in Java?
public class geoProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, r, n; //a = first term , d = diff. b/w adjacent no. , n = nth term to find?
        System.out.println("enter the first term of series ::  a = ");
        a = sc.nextInt();
        System.out.println("enter the diff. b/w adjacent no. :: r = ");
        r = sc.nextInt();
        System.out.println("Enter the nth term :: n = ");
        n = sc.nextInt();
        double s = a*(Math.pow(r,n-1)); //The nth term of a GP series is Tn = a*r^n-1,
        System.out.println("The "+n+"th term of the series is : "+(int)s);
    }
}
