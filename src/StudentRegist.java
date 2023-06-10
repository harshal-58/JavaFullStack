import java.util.Scanner;
public class StudentRegist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rno;
		String Sname;
		int m1,m2,m3,total;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll_Number Student_name m1 m2 m3 ");
		rno=sc.nextInt();
		Sname=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		total=m1+m2+m3;
		System.out.println("Total = "+total);
		avg=total/3.0; // Here it may give error because total is Integer and avg is Double
		//double=int
		/* Two types of casting
		 1)Implicit 
		 2)Explicit 
		 */
		/* int a;
		 * a=(int)avg;// compile error :- doublr to Int explicit(done by programmer) 
		  double d=total; //int--->double--->Implicit
		 */
		
		
		

		 
		System.out.println("Average = "+avg);
		
		
		sc.close();
		
	}

}
