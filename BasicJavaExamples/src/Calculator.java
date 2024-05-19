import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,res;
        System.out.println("Enter two numbers ::");
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("enter an operator from '+,-,*,/,% ::");
        char op=sc.next().charAt(0);
        switch (op) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;

            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res=a*b;
                System.out.println(res);
                break;
            case '/':
                res=a/b;
                System.out.println(res);
                break;
            case '%':
                res=a%b;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid Operator !!");
        }
    }
}
