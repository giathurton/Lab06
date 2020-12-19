// by Gia Thurton

import java.util.*;
import java.io.*;  

public class Lab06
{
	
	public static double max(double[] arr) {
		double max= arr[0];
		for(int i=0; i<arr.length;i=i+1) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		
		return max;
		
	}
	
	public static double min(double[] arr) {
		double min= arr[0];
		for(int i=0; i<arr.length;i=i+1) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
		
	}
	
	public static double sum(double[] arr) {
		double sum=0;
		for(double i : arr) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static double[] ave(double[] arr) {
		double sum = sum(arr);
		double ave = sum/arr.length;
		
		return new double[] {sum,ave};
		
	}
	public static void main(String [] args) throws IOException
	{
		System.out.println("Please enter the number of items that you would like to be entered");
		Scanner inScan = new Scanner(System.in);
		double itemcount = inScan.nextDouble();
		double[] arr = new double [(int) itemcount];
		for(int i=0; i<itemcount;i=i+1) {
			System.out.println("Please enter the value of the array in the " + i + " place");
			arr[i] = inScan.nextDouble();
		}
		System.out.println("You have entered: " + Arrays.toString(arr));
		
		
		double max = max(arr);
		double min = min(arr);
		double[] ave = ave(arr);
		
		
		System.out.println("The maximum value is: " +max);
		System.out.println("The minimum value is: " +min);
		System.out.println("The sum of your values is:  " +ave[0]);
		System.out.println("The average of your values is:  " +ave[1]);
		
	}
}