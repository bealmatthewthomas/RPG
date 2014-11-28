import java.util.*;
import java.lang.*;
public class Game{
   private int battles;
   private static int DEFAULTNUM=3;
   private PlayerCharacter player;
   private ArrayList<Integer> battleCount = new ArrayList<Integer>();
   //takes in the player and number of battles
   public Game(int battles, PlayerCharacter player){
      this.battles=battles;
      this.player=player;
      
   }
   public Game(){
      battles=DEFAULTNUM;
   }
   //make an array of integers counting the battles this is not necessary now thati tthink about it
   public void makeBattles(){
      for(int i=0; i<battles; i++){      
         battleCount.add(i);
      }
   }
   public void startGame(){
      //for each battle
      for(int i=0; i<battleCount.size();i++){
         //tell player which battle it is and then input the number of monsters and the player object
         if(player.getHP()<=0){
            break;
         }
         System.out.println("Welcome to battle "+(i+1));
         Battle newBattle= new Battle(3,player);
         newBattle.playBattle();
         //make sure to return and update playerHealth before ending this loop also maybe change the number of monsters
      }
      if(player.getHP()<=0){
         System.out.println("You lose!");
      }else if(player.getHP()>0){
         System.out.println("You win!");
      }
   }
}
