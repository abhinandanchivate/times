package com.times.employeemanagement;

public class Main3 {
	
	public static int div(int a, int b) {
		int c = 0;
		try {
			c = a/b;
			// exception will be raised
			// JVM will create an instance of ArithmeticException
			// it will hold statements which may raise the exceptions.
			// if we have 100s of statements where exception may raise then 
			// try block will handle the exception which is raised first.
//			String s = null;
//			System.out.println(s.length()); // nullpointer 
//			
			System.out.println(c);
			return c;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("exception caught is of type arithmetic");
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName());
		}
	
		catch (Exception e) {
			// to handle the exception 
			// 
			// TODO Auto-generated catch block
			System.out.println("exception caught");
			System.out.println(e.getClass().getName());
			e.printStackTrace();
		}
		finally {
			// it must be executed irrespective of exceptional situation.
			System.out.println("hello from finally");
	}
//		return c;
			return c;
	
	}
	public static void main(String[] args) {
		
		div(10,0);
			
		
		
	}

}
