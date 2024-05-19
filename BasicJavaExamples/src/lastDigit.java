import java.util.*;
//WAP Find Last Digit in Java ?
public class lastDigit {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :: ");
        int n = sc.nextInt();
        int r=n%10;
        System.out.println("Last digit of number is :: "+r);

     //WAP Find first Digit in Java ?
       while(n>=10)
       {
           n=n/10;
       }
        System.out.println("First digit of number is :: "+n);

    }
}
