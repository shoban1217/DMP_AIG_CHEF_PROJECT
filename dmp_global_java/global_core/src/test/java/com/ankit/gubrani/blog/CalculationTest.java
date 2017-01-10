package blog;

import org.junit.Test;
//import junit.framework.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//import static org.junit.Assert;

   
public class CalculationTest {
   
   Calculation cal = new Calculation();
   
   
   @Test
   public void testAdd1() {
	   
	   assertEquals("Add is Success!",110, cal.add(100, 10));
	 //  assertEquals("Add is Success!",10101010, cal.add(10, 100));
   }
   

   @Test
   public void testAdd2() {
	   assertEquals("Add is Success!",120, cal.add(100, 20));
   }

   @Test
   public void testAdd3() {
	   try{
	   assertEquals("Add is Success!",220, cal.add(120, 100));
	   }catch(Exception e){
		System.out.println("Test Failed" + e.getMessage());
	   }
   }
   
   @Test
   public void testSub1() {
	   assertEquals("Substraction is Success!", 90, cal.sub(100, 10)); 	  
   }
 
   @Test
   public void testSub2() {
	   assertEquals("Substraction is Success!", 95, cal.sub(100, 5)); 	  
   }
  
   @Test
   public void testSub3() {
	   assertEquals("Substraction is Success!", 85, cal.sub(100, 15)); 	  
   }

   @Test
   public void testMul() {
	   assertEquals("Multiplication is Success!", 1000, cal.mul(100, 10)); 	  
   }
   
   @Test
   public void testDiv() {
	   assertEquals("Division is Success!", 10, cal.div(100, 10)); 	  
   }
   
 }