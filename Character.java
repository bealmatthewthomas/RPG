import java.util.*;
public class Character{
   //generate 4 stats hp for how many hits you can take, strenght for damage dealt, Agility for turn priority and dodge, and defense for hit mitigation
   private double HP;
   private double STR;
   private double AGI;
   private double DEF;
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
      HP = randomGenerator.nextInt(4)+5;
      STR = randomGenerator.nextInt(2)+1;
      AGI = randomGenerator.nextInt(10);
      DEF = randomGenerator.nextInt(3);
   }
   //setters and getters
   public void setHP(double H){HP=H;}
   public void setSTR(double S){STR=S;}
   public void setAGI(double A){AGI=A;}
   public void setDEF(double D){DEF=D;}
   public double getHP(){return HP;}
   public double getSTR(){return STR;}
   public double getAGI(){return AGI;}
   public double getDEF(){return DEF;}
   public String toString(){
      return(HP+" Health, "+STR+" Strength, "+AGI+" Agility, and "+DEF+"Defense.");
   }
}