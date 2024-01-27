package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			System.out.println("Hello World");
//			int i = 1 / 0;
//			System.out.println("Completed");
//		} catch (Exception e) {
//			System.out.println("I am inside the catch block!");
//			System.out.println("Message: "+ e.getMessage());
//			System.out.println("Cause: "+ e.getCause());
//			e.printStackTrace();
//		} finally {
//			System.out.println("I am inside finally");
//		}
	}
	
	public static void demo() throws Exception {
		System.out.println("Hello World");
		throw new ArithmeticException("This is not a valid operation");
//		int i = 1 / 0;
//		System.out.println("Completed");
	}
}
