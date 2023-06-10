import java.util.Scanner; // java.util.*; means for all java.util library 

public class TestArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Static/Hard core/fix size
		// Declare Array

		int[] arr;
		// or
		int arr1[];

		// Instantiate array
		arr = new int[5]; // size of array is 5

		// Initialization
		arr[0] = 1;
		arr[1] = 45;
		arr[2] = 34;
		arr[3] = 90;
		arr[4] = 55;

		// Display array elements:
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
		}

		int[] arr2 = { 5, 6, 7 }; // declare,instantiate,initialization

//--------------------------------------------------------------//

		// Dynamic : Accept Size,Elements from user

		// Ask user How many number user want to store in array

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Number you want to store : ");
		int size = sc.nextInt(); // if user enter 6 : user want to enter 6 number or less than 6

		// int[] myArray; // Declaration
		// myArray=new int[size]; // Instantiation

		// OR

		int[] myArray = new int[size]; // Declare, Instantiation,Initialization

		// Either user while loop or for loop for Assigning value to the array
		// if size=8, index 0 1 2 3 4 5 6 7

		System.out.println("Enter Array Elements : ");
		for (int index = 0; index < size; index++) {
			myArray[index] = sc.nextInt(); // Accepting number from the user and assign
		}

		// Show array element
		for (int index = 0; index < size; index++) {
			System.out.print(myArray[index] + "  ");
		}
		System.out.println();
		System.out.println("-----------------Search Element from Array----------------------");
		System.out.println("Enter number to Search : ");
		int no = sc.nextInt();

		// To find number traverse in array
		
		boolean status =true;
		
		/*
		 
		for (int i = 0; i < size; i++) {
			// Check Number is in array or not

			if (no == myArray[i]) {
				System.out.println("Present");
				break;
			}
			else 
			{
				System.out.println("Not Present");
			}
		}
		*/
		
		for (int i = 0; i < size; i++) {
			// Check Number is in array or not

			if (no == myArray[i]) {
				status=true;
				//System.out.println("Present");
				break;
			}
			else 
			{
				status=false;
				//System.out.println("Not Present");
			}
		}
		
		//check status 
		if(status==true)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}

	}

}
