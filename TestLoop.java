import java.util.*;
public class TestLoop{
   public static void main(String[] args){
   Scanner keyboard= new Scanner(System.in);
   int battleNumber=0;
      while(true){
         try{
            battleNumber=keyboard.nextInt();
         }catch(InputMismatchException e){
            System.out.println("Invalid input try again");
            keyboard.next();
         }
      
      }
   }
}