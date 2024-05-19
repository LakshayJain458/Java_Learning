import java.util.*;
public class percentage {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks of 5 subjects out of 100");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        float sum=a+b+c+d+e;
        float per=(sum/500)*100;
        System.out.println("your percentage is" +per+"%");
    }

}