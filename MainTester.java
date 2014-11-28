import java.util.*;
public class MainTester{
   public static void main(String[] args){
      //ask for name class and number of battles. use name and class to make player object
      //use number of battles and inject into the game
      int battleNumber;
      String playerName;
      String playerClass="lol";
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
      System.out.println("How many battles would you like to fight?");
      battleNumber=keyboard.nextInt();
      Game myGame= new Game(battleNumber,player);
      myGame.makeBattles();
      myGame.startGame();
   }
}