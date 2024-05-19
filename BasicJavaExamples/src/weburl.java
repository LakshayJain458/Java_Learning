import java.util.*;
public class weburl
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your website url .__ ::");
        String url=sc.next();
        switch (url)
        {
            case ".com":
                System.out.println("your website is commercial website.");
                break;
            case ".org":
                System.out.println("your website is organisation website. ");
                break;
            case ".in":
                System.out.println("your website is indian website.");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
