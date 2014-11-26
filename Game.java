import java.util.*;
import java.lang.*;
public class Game{
   private int battles;
   private static int DEFAULTNUM=3;
   private PlayerCharacter player;
   private ArrayList<Integer> battleCount = new ArrayList<Integer>();
   public Game(int battles, PlayerCharacter player){
      this.battles=battles;
      this.player=player;
      
   }
   public Game(){
      battles=DEFAULTNUM;
   }
   public void makeBattles(){
      for(int i=0; i<battles; i++){      
         battleCount.add(i);
      }
   }
   public void startGame(){
      for(int i=0; i<battleCount.size();i++){
         System.out.println("Welcome to battle "+(i+1));
         Battle newBattle= new Battle(3,player);
         newBattle.playBattle();
         //make sure to return and update playerHealth before ending this loop also maybe change the number of monsters
      }
   }
}
