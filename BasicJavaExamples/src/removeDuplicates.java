import java.util.Scanner;

public class removeDuplicates {
    public static boolean map[]=new boolean[26];
    public static void remove(String s, int i , String  newS)
    {
        if(i==s.length())
        {
            System.out.println(newS);
            return;
        }
        char currchar=s.charAt(i);
        if(map[currchar-'a']==true)
        {
            remove(s,i+1,newS);
        }
        else {
            newS+=currchar;
            map[currchar-'a']=true;
            remove(s,i+1,newS);
        }
    }
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string :: ");
        String s= sc.next();
        String newS="";
        remove(s,0,newS);
    }
}
