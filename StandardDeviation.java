import java.util.*;
public class StandardDeviation 
{ 
	public static void main(String[] args) 
	{ 
		int[] data; 
		double sigma;
		data = getData();
		sigma=computeStdDev (data);
		output.StdDev(sigma);
	}
	public static int [] getData() 
	{
		Scanner scanner = new Scanner(System.in); int size;
		int[] array;
		System.out.print ("Enter the number of data: ");
		size scanner.nextInt();
		array = new int [size];
		for (int i=0; i<size; i++) 
		{	
			System.out.print ("Enter the data " + (i+1) + ": "); 
			array[i]=scanner.nextInt();
		}
		return array;
	}
	public static double computeStdDev (int[] array) 
	{ 
		double total, mean, variance, sigma;
		total = 0;
		for (int i=0; i<array.length; i++)
		total = total + array [i];
		mean =total/array.length;
		total = 0;
		for (int i=0; i<array.length; i++)
		total total + Math.pow(array[i] - mean, 2);
		variance = 	total/array.length;
		sigma = Math.sqrt (variance);
		return sigma;
		public static void output StdDev (double sigma) {
		System.out.printf("Standard deviation: %.2f", sigma); 
		System.out.println();
		}
	}
}