package com.companyname.project;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
	@Test
	public void testSum() {
		System.out.println("sum");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
		
		}
	
	  @Test 
	  public void testnull_y_sum() { System.out.println("sum"); 
	  Integer x = 15;
	  //Integer y = 15; 
	  assertEquals(null, Calculator.sum(x, null)); }
	 
	  @Test
	  public void testnull_x_sum() { 
		  System.out.println("sum"); 
		  //Integer x = 15;
		  Integer y = 15;
	  assertEquals(null, Calculator.sum(null, y)); }
	 
	  @Test
	  public void testnull_all_sum() {
		  System.out.println("sum");
	  
	  assertEquals(null, Calculator.sum(null, null)); 
	  }
	 
	
	  
	  @Test
		public void testsub() {
			System.out.println("sub");
			Integer x = 15;
			Integer y = 15;
			Integer expResult = 0;
			Integer result = Calculator.sub(x, y);
			assertEquals(expResult, result);
			
			}
		
		  @Test 
		  public void testnull_y_sub() { System.out.println("sub"); 
		  Integer x = 15;
		  //Integer y = 15; 
		  assertEquals(null, Calculator.sub(x, null)); }
		 
		  @Test 
		  public void testnull_x_sub() { 
			  System.out.println("sub"); 
			  //Integer x = 15;
			  Integer y = 15;
		  assertEquals(null, Calculator.sub(null, y)); }
		 
		  @Test
		  public void testnull_all_sub() {
			  System.out.println("sub");
		  
		  assertEquals(null, Calculator.sub(null, null)); 
		  }
		 
	  
		  
		  
		  @Test
			public void testmul() {
				System.out.println("mul");
				Integer x = 15;
				Integer y = 15;
				Integer expResult = 225;
				Integer result = Calculator.mul(x, y);
				assertEquals(expResult, result);
				
				}
			
			  @Test 
			  public void testnull_y_mul() { System.out.println("mul"); 
			  Integer x = 15;
			  //Integer y = 15; 
			  assertEquals(null, Calculator.mul(x, null)); }
			 
			  @Test 
			  public void testnull_x_mul() { 
				  System.out.println("mul"); 
				  //Integer x = 15;
				  Integer y = 15;
			  assertEquals(null, Calculator.mul(null, y)); }
			 
			  @Test
			  public void testnull_all_mul() {
				  System.out.println("mul");
			  
			  assertEquals(null, Calculator.mul(null, null)); 
			  }
			 
		  
	  
	
}
