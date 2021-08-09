package demo;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception { 
		
		ExceptionH();
	
	}	
	/*	try {
			System.out.println("Hello World!!");
			
			int i=1/0;									//Arithmetic Exception
			
			System.out.println("Completed");
			
		} catch (Exception e) {
			
			System.out.println("I am inside the Catch Block");
			System.out.println("Message is:"+ e.getMessage());
			System.out.println("Cause is:"+ e.getCause());
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("I am inside the finally block");
		}						*/
		
							
		public static void ExceptionH() throws Exception
		{
			System.out.println("Hello World!!");
			throw new ArithmeticException("Not valid Operation");					//Deliberately throwing exception
			//int i=1/0;									//Arithmetic Exception
			//System.out.println("Completed");
			
		}

	}

