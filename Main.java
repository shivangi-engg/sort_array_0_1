import java.util.*;
import java.lang.*;

public class Main 
{
	public static void main(String[] args) 
	{
		int count_0 = 0;
		int count_1 = 0;

		//take input array first
		Scanner sc  = new Scanner(System.in);

		System.out.println("enter the length of the array");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		for(int j=0; j<n; j++)
		{
			if(arr[j] == 0)
			{
				count_0++;
			}
			else
			{
				count_1++;
			}
		}

		for(int k=0; k<count_0; k++)
		{
			arr[k] = 0;
		}
		for(int l=count_0; l<n; l++)
		{
			arr[l] = 1;
		}

		System.out.println("array after sorting is:");
		for (int x=0; x<n; x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
}