
public class TestForEach {
	public static void main(String[] args)
	{
		int[] arr= {3,4,45,25,47};
		
		//Advance For loop in introduced specially for collection
		//called as for each loop.
		//it start with first value till the last value.		
		//by default it is forward only and Read only(U can not change value using for each)
		//Advance Collection... 
		
		for(int no:arr) //For each loop (value)
			            //for Read purpose only not for assign.
		{
			System.out.println(no);
		}
		
		
		
		for(int i=0;i<arr.length;i++) // For loop (Index)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
