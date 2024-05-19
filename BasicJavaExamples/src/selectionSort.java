import java.util.*;
public class selectionSort //time complexity = O(n^2)
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
        for(int i=0;i<n-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array is :: ");
        printArray(arr);
    }

}
