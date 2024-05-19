import java.util.*;
//Q check if array is (strictly increasing) sorted or not ?
public class sortedArray
{
    public static boolean sorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]<arr[i+1])
        {
           return sorted(arr,i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[]args)
    {
        int arr[]={1,2,3,5,5};
        System.out.println(sorted(arr,0));

    }
}
