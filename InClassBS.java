import java.util.Random;
public class InClassBS 
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
			int swap; 
			int theFollower; 
			
			for(int currStart = 1; currStart < ar.length; currStart++)
			{
				theFollower=currStart; 
				while(theFollower != 0 && ar[theFollower] < ar[theFollower -1]) 
				{
					//than we need to swap and follow
					swap = ar[theFollower]; //swap is at the position ar[theFollower]
					ar[theFollower] = ar[theFollower -1]; 
					ar[theFollower-1] = swap; 
					theFollower--; 
					
				}
			} //what is true when we are here? currStart integer is in its final position
		}//the aray is in order
		


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

