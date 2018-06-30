import java.awt.Robot;
import java.awt.event.*;   

public class Math {
   public static void main(String[] args) {
      click(150,910);
      for(int i=1; i<=10; i++){
         var(870,236);
            
         var(885,315);
      
         var(870,388);
      
         var(600,654);
         
         
         try
         {
            Thread.sleep(100);
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
         
         System.out.println(i);
      }
   }
   
   public static void click(int x, int y){
      try{
         Robot bot = new Robot();
         bot.mouseMove(x, y);    
         bot.mousePress(InputEvent.BUTTON1_MASK);
         bot.mouseRelease(InputEvent.BUTTON1_MASK);
      } 
      catch(Exception e)
      {
         e.printStackTrace();
      }
   
   }
   
   public static void copy(){
      try{
         Robot instance = new Robot();
      
         instance.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(20); 
         instance.keyPress(KeyEvent.VK_C); 
         Thread.sleep(20); 
         instance.keyRelease(KeyEvent.VK_C); 
         Thread.sleep(20); 
         instance.keyRelease(KeyEvent.VK_CONTROL); 
         Thread.sleep(20);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   
   }
   
   public static void paste(){
      try{
         Robot instance = new Robot();
      
         instance.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(20); 
         instance.keyPress(KeyEvent.VK_V); 
         Thread.sleep(20); 
         instance.keyRelease(KeyEvent.VK_V); 
         Thread.sleep(20); 
         instance.keyRelease(KeyEvent.VK_CONTROL); 
         Thread.sleep(20);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   
   }
         
   public static void enter(){
      try{
         Robot instance = new Robot();
         instance.keyPress(KeyEvent.VK_ENTER); 
         Thread.sleep(20); 
         instance.keyRelease(KeyEvent.VK_ENTER); 
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   
   }
   
   public static void var(int x, int y){
      click(x,y);
      click(x,y);
      copy();
      click(1862,987);
      paste();
      enter();
   }
}