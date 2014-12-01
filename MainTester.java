import java.util.*;
public class MainTester{
   public static void main(String[] args){
      //ask for name class and number of battles. use name and class to make player object
      //use number of battles and inject into the game
      int battleNumber=1;
      String playerName;
      String playerClass;
      Scanner keyboard= new Scanner(System.in);
      System.out.println("Welcome to Matt's RPG! What is your characters name?");
      playerName= keyboard.nextLine();
      System.out.println("What class would you like to play as? (tank/rogue/warrior)");
      playerClass=(keyboard.nextLine()).toLowerCase();
      while(!(playerClass.equals("tank")||playerClass.equals("rogue")|| playerClass.equals("warrior"))){
         System.out.println("Invalid input!");
         System.out.println("What class would you like to play as? (tank/rogue/warrior)");
         playerClass=(keyboard.nextLine()).toLowerCase();
      }
      PlayerCharacter player=new PlayerCharacter(playerName,playerClass);
      boolean good=false;
      while(!good){
      System.out.println("How many battles would you like to fight?");
      battleNumber=1;
         try{
         battleNumber=keyboard.nextInt();
         good=true;
         }catch(InputMismatchException e){
            System.out.println("Invalid input, please input a number");
            keyboard.next();
         }  
      } 
      Game myGame= new Game(battleNumber,player);
      myGame.makeBattles();
      myGame.startGame();
   }
}
