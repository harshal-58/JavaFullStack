import java.util.Scanner;
// ctl+shift+s : Formatting (Proper in line code)

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array : fixed size collection of similar data type
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3 }; // Static : 3 elements ( Hard Coded : Always size is fix )
		
		System.out.println("Enter How many Elements : ");
		int no=sc.nextInt();
		
		int[] arr2 = new int[no]; // Accept limit from user (Dynamic)
		
		int[] arr1 = new int[5]; // storing 5 int values (fix)

		// arr1[0]=10;arr1[1]=20;arr1[2]=30;arr1[3]=40;arr1[4]=50;
		System.out.println("Enter Array Element : ");
		
		/*
		for (int i = 0; i < 5; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array Elements ");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i] + "  ");
		}
		*/
		
		for (int i = 0; i < no; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Array Elements ");
		for (int i = 0; i < no; i++) {
			System.out.print(arr2[i]+"  ");
		}
		
		//Not worry about memory allocated to Heap JAVA : Why
		//We have inbuilt automatic memory management 
		//Garbage Collector:

	}

}
