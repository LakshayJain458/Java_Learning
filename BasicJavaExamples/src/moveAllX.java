import java.util.*;
//Q move all 'x' to the end of the string ?
public class moveAllX
{
    public static void move(String s, int i , int count , String newS)
    {
        if(i==s.length())
        {
            for(int j=0;j<count;j++)
            {
                newS+='x';
            }
            System.out.println(newS);
            return;
        }
        char currchar=s.charAt(i);
        if(currchar=='x')
        {
            count++;
            move(s,i+1,count,newS);
        }
        else{
            newS+=currchar;
            move(s,i+1,count,newS);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string :: ");
        String s= sc.next();
        String newS="";
        move(s,0,0,newS);
    }
}
