import java.util.Scanner;

public class TestStringArray {
	public static void main(String[] args) {

		// Store names of student

		Scanner sc = new Scanner(System.in);
		String[] names = new String[5]; //

		System.out.println(names.length);
		System.out.println("Enter name : ");
		for (int i = 0; i < names.length; i++) // What is length : field in array class
		{
			names[i] = sc.next();
		}

		System.out.println("Names Are : ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("--------------");
		//Advance For loop in introduced :
		//called as for each loop.
		//it start with first value till the last value.
		//by default it is forward only and Read only(U can not change value using for each)
		//Advance Collection... 
		
		int[] arr= {5,10,15,20,25};
		
		for(int i:arr)
		{
			System.out.print(i+"  ");
		}
		
		for(String str:names) // Syntax : for(data_type variable:array_name)
	  //for each string str in names (for each value in names--->str)
		{
			System.out.print(str+"  ");
		}
		
	}
}
