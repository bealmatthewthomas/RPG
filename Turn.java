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
      //monsterList=monsters;
      //THIS IS WHERE ERROR IS OCCURING 
      //for(int i=0; i<monsters.size()-1;i++){
         //battleOrder.add((monsters.get(i)));
       //  battleOrder.add(monsters.get(i));
       monsterList=monsters;
      //}
      //battleOrder.add(player);
   }
   public void playTurn(){
      //player attacks first
      int input;
      for(int i=0; i<monsterList.size();i++){
         System.out.println("Monster "+(i+1)+" has " +(monsterList.get(i).toString()));
         
      }
      System.out.println("which monster do you want to attack?(enter the number)");
      input=keyboard.nextInt()-1;
      (monsterList.get(input)).setHP(battleCalculator(player,monsterList.get(input)));
      
   /*
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
      }*/
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
   public double battleCalculator(Character attacker, Character defender ){
      //calculate dodge chance, then test dodge if dodge break dodge will be half of AGI
      Random r=new Random();
      double zeroToOne = r.nextInt(1001) / 1000;
      System.out.println(zeroToOne);
      //double dodgeChance=AGI;
      
      //calculate crit chance and apply multiplier if necessary
      //calculate damage mitigation of agressor on defender
      //make the changes to the HP value of the attacked
      //
      return 5;
   }
}