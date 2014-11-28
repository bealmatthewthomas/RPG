public class PlayerCharacter extends Character{
   //private String playerName;
   private String playerClass;
   public PlayerCharacter(String playName, String playerClass){
      setName(playName);
      if(playerClass.equals("warrior")){
         setWarrior();
      }else if(playerClass.equals("tank")){
         setTank();
      }else if(playerClass.equals("rogue")){
         setRogue();
      }
   }
   //public void setName(String playName){
   //   setName(playName);
   //}
   public void setWarrior(){
      setHP(20);
      setSTR(5);
      setAGI(7);
      setDEF(2);
   }
   public void setTank(){
      setHP(25);
      setSTR(3);
      setAGI(5);
      setDEF(4);
   }
   public void setRogue(){
      setHP(15);
      setSTR(5);
      setAGI(10);
      setDEF(1);
   }
}