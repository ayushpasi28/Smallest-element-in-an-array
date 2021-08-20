package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestInArray {
      public static void main(String args[])
       {
    	 
    	System.out.print("Enter size of array:");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	System.out.println("Enter element of an array.");
    	int N=arr.length;
    	for(int i=0;i<N;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	sc.close();    	
    	System.out.println(Arrays.toString(arr));
    	int smallest=arr[0];
    	for(int i=0;i<N;i++)
    	{
    		if(arr[i]<smallest)
    		{
    			smallest=arr[i];
    		}
    			
    	}
    	System.out.println("Smallest element:"+smallest);
    	}
}
