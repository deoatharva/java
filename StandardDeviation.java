import java.util.*;
public class StandardDeviation 
{ 
	public static void main(String[] args) 
	{ 
	int[] data; double sigma;
	data = getData();
	sigma=computeStdDev (data);
	outputStdDev (sigma);
	}
	public static int [] getData() {
	Scanner scanner = new Scanner(System.in);
	int size;
	int[] array;
	System.out.print ("Enter the number of data: ");
	size scanner.nextInt();
	array = new int [size];
	for (int i=0; i<size; i++) {
		System.out.print ("Enter the data " + (i+1)+": "); array[i] = scanner.nextInt();
	}
	return array;
}