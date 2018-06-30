import java.util.Scanner;
import java.awt.Robot;
import java.awt.event.*;

public class Answer {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 Scanner ch = new Scanner(System.in);
		 
		 while(true) {

			 
			 int a = in.nextInt();
	      String b = ch.nextLine();
	      int c = in.nextInt();
	      int d  = in.nextInt();
	      in.close();
	      ch.close();
	      try{
	            Thread.sleep(100);
	         }
	         catch(Exception e)
	         {
	            e.printStackTrace();
	         }
	      	      
	      if(b.equals("+") && a + c == d)
	       	  correct();
	     
	      else if(b.equals("-") && a - c == d)
	       	  correct();
	      else if(d != 0 && b.equals("/") && a / c == d)
	      		correct();
	      else if(b.equals("×") && a * c == d)
	    	  correct();
	      else
	      {
	    	  incorrect();
	    	  System.out.println("Wrong");
	      }
    	  System.out.println(a+""+b+""+c+"="+d);	      
		 }
	}
	   public static void correct(){
		      try{
		         Robot bot = new Robot();
		         bot.mouseMove(60, 930);    
		         bot.mousePress(InputEvent.BUTTON1_MASK);
		         bot.mouseRelease(InputEvent.BUTTON1_MASK);
		      } 
		      catch(Exception e)
		      {
		         e.printStackTrace();
		      }
		   
		   }
	   
	   public static void incorrect(){
		      try{
		         Robot bot = new Robot();
		         bot.mouseMove(230, 930);    
		         bot.mousePress(InputEvent.BUTTON1_MASK);
		         bot.mouseRelease(InputEvent.BUTTON1_MASK);
		      } 
		      catch(Exception e)
		      {
		         e.printStackTrace();
		      }
		   
		   }


}
