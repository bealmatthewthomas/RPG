import java.util.*;
public class Turn{
   //generate player, scanner, arraylists
   private PlayerCharacter player;
   private Scanner keyboard=new Scanner(System.in);
   private ArrayList<Monster> monsterList;
   private ArrayList<Character> battleOrder;
   //private int characterCount=1;
   public Turn(PlayerCharacter p, ArrayList<Monster> monsters){
      player=p;
      monsterList=monsters;
      for(int i=0; i<monsterList.size()-1;i++){
         battleOrder.add((monsterList.get(i)));
      }
      battleOrder.add(player);
   }
   public void playTurn(){
      getPriority();
      for(int i=0;i<battleOrder.size();i++){
         if(battleOrder.get(i)==player){
            //determine which monster to attack
            System.out.println("Which Monster do you want to attack?");
            for(int j=0; j<battleOrder.size();j++){
               if(i!=j){
                  System.out.println("Monster "+i+" has "+(battleOrder.get(i).getHP()) +" health.");
               }
               System.out.println("Input the number of the monster you want to attack");
            }
            
         }else{
            //monster x attack player
         }
      }
   }
   public void getPriority(){
      //Make the monster list= to the char list sort the monster list 
      
      for(int i=0; i<battleOrder.size();i++){
         while(battleOrder.get(i).getAGI() < battleOrder.get(i+1).getAGI());
            Character place=battleOrder.get(i+1);
            battleOrder.add(i+1,battleOrder.get(i));
            battleOrder.add(i,place);
      }
   }
   public void BattleCalcualtor(){
      //calculate dodge chance, then test dodge if dodge break
      //calculate crit chance and apply multiplier if necessary
      //calculate damage mitigation of agressor on defender
      //make the changes to the HP value of the attacked
      //
   }
}