
import java.util.Random; 
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] ar = new int[10];
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(10);
		}
	BubbleSort.display(ar);
	BubbleSort.bubbleSort(ar);
	BubbleSort.display(ar);
	}
	
	static void bubbleSort(int[] ar)
	{
		int temp; 
		boolean fixed=false; 
		while(fixed==false)
		{	
			fixed=true; 
			for(int i=0; i<ar.length-1; i++)
			{
				if(ar[i] > ar[i+1]) //if the number at bucket 0 is greater than the number at bucket 1
				{
				temp=ar[i+1]; //store number bucket 1 in temp
				ar[i+1]=ar[i];//swaps bucket 1 and 0
				ar[i]=temp;//temp is now bucket 0
				fixed=false; //loop repeats until all buckets are sorted
				
				}
				
			}
		}
	}
	 

	static void display(int[] elephant)
	{
		System.out.println("****");
		for(int i = 0; i < elephant.length; i++)
		{
			System.out.println(elephant[i]);
		}
		System.out.println("****");
	}
}
