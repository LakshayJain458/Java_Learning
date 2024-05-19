import java.util.*;
public class leapyear
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year::");
        int y= sc.nextInt();
        if(y%4==0||y%400==0&&y%100==0)
        {
            System.out.println("year is a leap year.");
        }
        else {
            System.out.println("year is not a leap year");
        }
    }
}