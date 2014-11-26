import java.util.*;
public class Battle{
  //generate monsters in the battle
   private ArrayList<Monster> monsterList = new ArrayList<Monster>();
   private PlayerCharacter player;
   //battle constructor determines number of monstres in battle and the player
   public Battle(int numMonsters, PlayerCharacter playerC){
      for(int i=0;i<numMonsters;i++){
         Monster newMonster= new Monster();
         monsterList.add(newMonster);
      player=playerC;
      //for(int j=0;j<monsterList.size();j++){
       //  System.out.println(j);
      //}
      }
      PlayerCharacter player=playerC;
   }
   public PlayerCharacter playBattle(){
      //while monster all monster health is positive and character health is positive
      while(player.getHP()>0 && getMonsterHealth(monsterList)>0){
         Turn newTurn= new Turn(player,monsterList);
      }
      return player;
   }
   public double getMonsterHealth(ArrayList<Monster> monsterList){
      double healthTotal=0;
      for(int i=0; i<monsterList.size();i++){
         healthTotal=healthTotal+((monsterList.get(i)).getHP());
      }
      return healthTotal;
   }
}