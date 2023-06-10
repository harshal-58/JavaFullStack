
public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Array :"+args.length);
		for(String a:args)
		{
			System.out.print(a+"  ");
		}s
		
		//make addition of first 2 number from args
		int a=Integer.parseInt(args[0]);// first number
		int b=Integer.parseInt(args[1]);// second number
		
		System.out.println("Addition="+(a+b));
		
		
		String no="12";
		String no1="90.90";
		//byte--->short--->int-->float--->double
		//int a="Abc";  but we can not convert string to int
		
		
	}

}
