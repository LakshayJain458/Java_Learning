import java.util.*;
public class insertionSort //time complexity = O(n^2).
{
    public static void printArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of elements in an array ::");
        int n=sc.nextInt();
        System.out.println("enter array elements :: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is :: ");
        printArray(arr);
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("sorted array is :: ");
        printArray(arr);
    }
}
