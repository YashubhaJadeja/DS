import java.util.Scanner;

public class Bubble_Sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nuber of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Unsorted : ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        Bubble_implement.bubbleSort(arr);
        System.out.print("\nSorted : "); 
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    public static void bubbleSort(int[] a) 
    {
        for (int i = 0; i < a.length-1; i++) 
        {
            for (int j = 0; j < a.length-i-1; j++) 
            {
                if (a[j]>a[j+1]) 
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
