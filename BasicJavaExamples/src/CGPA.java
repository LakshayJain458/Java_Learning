import java.util.*;
public class CGPA {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks of 1st semester of three subjects out of 100::");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float sum1=a+b+c;
        float p1=(sum1/300)*100;
        System.out.println("enter your marks of 2nd semester of three subjects out of 100::");
        float d= sc.nextFloat();
        float e= sc.nextFloat();
        float f= sc.nextFloat();
        float sum2=d+e+f;
        float p2=(sum2/300)*100;
        float sum3=p1+p2;
        double cp=(sum3/2)/(9.5);
        System.out.println("your CGPA OF 1st year is - "+cp);
    }
}