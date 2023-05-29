//imports

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);

// weapons list
ArrayList<String>WeaponsList = new ArrayList <String>();
    WeaponsList.add("Wooden Sword"); // 0
    WeaponsList.add("Steel Sword"); // 1
    WeaponsList.add("Dragon Sword");//2

    
    //weapons hashmap
    HashMap<String,Integer> WeaponsMap = new HashMap<String,Integer>();
    WeaponsMap.put("Wooden Sword", 10);
    WeaponsMap.put("Steel Sword", 15);
    WeaponsMap.put("Dragon Sword",30);

// armor list
    ArrayList<String>ArmorList = new ArrayList <String>();
ArmorList.add("Light Armor"); //0
ArmorList.add("Steel Armor"); //1
ArmorList.add("Dragon Armor");//2
    
    //armor hashmap
    HashMap<String,Integer> ArmorMap = new HashMap<String,Integer>();
    ArmorMap.put("Light Armor",20);
    ArmorMap.put("Steel Armor",35);
    ArmorMap.put("Dragon Armor",45);

    //--------------------------------------
    //Answers for Sphinx riddle
ArrayList<String>SphinxAnswers = new ArrayList <String>();
    SphinxAnswers.add("Newspaper");
    SphinxAnswers.add("Building");
    SphinxAnswers.add("Horse");
    SphinxAnswers.add("Cave");
    SphinxAnswers.add("Pen");
    

// creating user
System.out.println("Welcome to Dungeons, Dungeons, and more Dungeons JAVA edition!");
    System.out.println("It is time to create your Character! What is your Name?");
    String NameAnswer = myInput.nextLine();

String UserName = NameAnswer;
int UserHealth = 100;
String UserWeaponName = WeaponsList.get(0);
int UserWeaponDamage = WeaponsMap.get(UserWeaponName);
String UserArmorName = ArmorList.get(0);
int UserArmorDefense = ArmorMap.get(UserArmorName);
int Hp = 5;
    // this gets the name from the list and then the key for the value
    // aray list start their count at zero not with stings so spencify what weapon you want with a number
    User Player = new User(UserName, UserHealth, UserWeaponName, UserWeaponDamage, UserArmorName, UserArmorDefense, Hp);
    Player.GetStats();
    System.out.println(" ");
    System.out.println("Above are your player Stats! It shows your health, weapons, armor, and your health potions. Potions are the only way you can heal yourself so use them wisely!");
    System.out.println("Well then, lets start your adventure to conqueror the Dragon!");
    System.out.println("You will battle a few enemies on the way so you have a chance to win some rewards from them.");
    System.out.println("Your first enemy is a wizard, prepare for battle!");
// enemy set up

int WizHealth = 50;
Wizard wizard = new Wizard("Wizard", WizHealth, 30, 20);
 Sphinx sphinx = new Sphinx("Sphinx", 1,"What is black, white, and red all over?");
    Boss dragon = new Boss("Dragon",150,50,55,60,35);




int key =0;
//end of set up
    
while(wizard.GetHealth()>0){
  if(Player.GetHealth()>0){
  Player.GetStats();
  wizard.GetStats();
  System.out.println("Enter 1 to attack or 2 to heal yourself");
  int WizAnswer = myInput.nextInt();

  if(WizAnswer == 1){
    wizard.sub(Player.UAttack());
  }
  else if(WizAnswer == 2){
    Player.Heal();
  }
  else{System.out.println("That was not one of the options so you did nothing!");}
  if(wizard.GetHealth()<=0){
    System.out.println("GAME OVER! You lost, play again?");
    break;
  }
  else if(wizard.GetHealth()>0){
    
   Random RandomWiz = new Random();
   int WizRandomNum = RandomWiz.nextInt(101);

    if(WizRandomNum<20){
      wizard.WHeal();
    }
    else{
      Player.sub(wizard.FireBall());
    }
  }
    
  }
  
  
}
if(Player.GetHealth()>0){
System.out.println("Now that you have beaten the Wizard you can pick your reward! enter 1 to recive upgraded armor and a better weapon or enter 2 to recive 5 health potions!");
  int WizReward = myInput.nextInt();
  if(WizReward == 1){
    Player.WeaponNameChange("Steel Sword");
    Player.WeaponDamageChange(WeaponsMap.get("Steel Sword"));
    Player.ArmorNameChange(("Steel Armor"));
    Player.ArmorNumber(ArmorMap.get("Steel Armor"));
    Player.GetStats();
  }
  else if(WizReward == 2){
    Player.HpUp(5);
    Player.GetStats();
  }
  else{System.out.println("That was not one of the options so you get nothing as a reward.");}

  
  //Start of sphinx
  if(Player.GetHealth()>0){

System.out.println("Your next opponent is a sphinx. to defeat the sphinx you will have to answer it's riddle...");
System.out.println(" ");
sphinx.PrintRiddle();
System.out.println("Here are your options:");
System.out.println(SphinxAnswers);
System.out.println("Enter 1 for Newspaper, 2 for Building, 3 for Horse, 4 for Cave, or 5 for Pen");
   int RiddleAnswer = myInput.nextInt();
    if(RiddleAnswer == 1){
      System.out.println("Your correct!");
      System.out.println("Now you may pick your reward! Enter 1 for upgraded armor and a better weapon or enter 2 for 5 more health potions.");
      int SphReward = myInput.nextInt();
      
      if(SphReward == 1){
    Player.WeaponNameChange("Dragon Sword");
    Player.WeaponDamageChange(WeaponsMap.get("Dragon Sword"));
    Player.ArmorNameChange("Dragon Armor");
    Player.ArmorNumber(ArmorMap.get("Dragon Armor"));
    Player.GetStats();
  }
  else if(SphReward == 2){
    Player.HpUp(5);
    Player.GetStats();
  }
  else{System.out.println("That was not one of the options so you get nothing as a reward.");}
      // Start Dragon
System.out.println("You have made it to the final boss the Dragon!");
      while(dragon.GetHealth()>0){

        if(Player.GetHealth()>0){

          Player.GetStats();
          System.out.println(" ");
          dragon.GetStats();
          System.out.println("Enter 1 to attack or 2 to heal yourself");
          int BossAnswer = myInput.nextInt(); 
          if(BossAnswer == 1){
            dragon.sub(Player.UAttack());
          }
          else if (BossAnswer == 2){
            Player.Heal();
          }
          else{System.out.println("That was not an option so you did nothing.");}
          if(dragon.GetHealth()<=0){
            key = 100;
            break;
          }
          else if(dragon.GetHealth()>0){
             Random RandomDragon = new Random();
   int DragonRandomNum = RandomDragon.nextInt(101);
            if(DragonRandomNum <= 10){
              dragon.DHeal();
            }
            else if(DragonRandomNum <= 15){
              Player.sub(dragon.Fire());
            }
            else if(DragonRandomNum <= 50){
              Player.sub(dragon.TailWhip());
            }
            else{
              Player.sub(dragon.HeadButt());
            }
          }
        }
        
      }

    if(key == 100){
      System.out.println("Congratulations! You have beaten the Dragon and have won the Game!");
    }
    else{System.out.println("GAME OVER! You lost, play again?");}









      
    }
    else{System.out.println("Incorrect! GAME OVER!");}


    
  }
}
else{System.out.println("GAME OVER! You lost, play again?");}



    

    
   
  }}