import java.util.*;
public class GCD {
    static int greater(int a, int b)
    {
        int i;
        if(a<b)
        {
            i=a;
        }
        else {
            i=b;
        }
        return i;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter two numbers :: ");
        a= sc.nextInt();
        b= sc.nextInt();
        int max=0;
        int m=greater( a , b);
        for(int j=1;j<m;j++)
        {
            if(a%j==0 && b%j==0) {
                if (max < j)
                {
                    max = j;
                }
            }
        }
        System.out.println(max);
    }
}
