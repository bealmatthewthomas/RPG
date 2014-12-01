import java.util.*;
public class Character{
   //generate 4 stats hp for how many hits you can take, strenght for damage dealt, Agility for turn priority and dodge, and defense for hit mitigation
   private double HP;
   private double STR;
   private double AGI;
   private double DEF;
   private String name="Spooky Monster";
   private Random randomGenerator = new Random();
   //make a character with the inputted user values
   public Character(double Health, double Strength, double Agility, double Defense){
      HP=Health;
      STR=Strength;
      AGI=Agility;
      DEF=Defense;
   }
   //generate a random character
   public Character(){
      HP = randomGenerator.nextInt(2)+2;
      STR = randomGenerator.nextInt(2)+1;
      AGI = randomGenerator.nextInt(9)+1;
      DEF = randomGenerator.nextInt(3)+1;
   }
   //setters and getters
   public void setName(String s){name=s;}
   public void setHP(double H){if(H<0){HP=0;}else{HP=H;}}
   public void setSTR(double S){STR=S;}
   public void setAGI(double A){AGI=A;}
   public void setDEF(double D){DEF=D;}
   public String getName(){return name;}
   public double getHP(){return HP;}
   public double getSTR(){return STR;}
   public double getAGI(){return AGI;}
   public double getDEF(){return DEF;}
   public String toString(){
      return(name+" has "+HP+" Health, "+STR+" Strength, "+AGI+" Agility, and "+DEF+" Defense.");
   }
}