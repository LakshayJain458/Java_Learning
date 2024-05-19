import java.util.*;
public class swaptwo { //using a third variable.
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter no. a :: ");
        a= sc.nextInt();
        System.out.println("enter no. b :: ");
        b= sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("swapped no a = "+a+" and b = "+b);
        
        // not using a third variable.
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("swapped no a = "+a+" and b = "+b);

    }
}
