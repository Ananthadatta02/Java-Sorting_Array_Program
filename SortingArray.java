package sortingOperations;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
