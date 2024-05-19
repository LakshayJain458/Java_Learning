import java.util.*;
public class kM_Miles {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter distance in kilometers ::");
        double a= sc.nextDouble();
        double b=a*0.621371;
        System.out.println("distance in miles is :: "+b);
    }
}
