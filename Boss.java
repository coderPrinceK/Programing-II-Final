public class Boss extends Character{
    //constructor
    public int AttackOneDamage;
    public int AttackTwoDamage;
    public int AttackThreeDamage;
    public int Healing;
    public Boss(String CharName, int CharHealth, int Aone, int Atwo, int Athree, int H){
      super(CharName,CharHealth);
      Health = CharHealth;
      AttackOneDamage = Aone;
      AttackTwoDamage = Atwo;
      AttackThreeDamage = Athree;
      Healing = H;
    }
    //methods
  
  public void GetStats(){// overides character function.
      System.out.println("Enemy: "+Name);
      System.out.println("Health: "+Health);
      System.out.println("Attacks: Headbutt, Tail Whip, Fire");
      System.out.println("Abilities: Heal");
    }
  
  public int HeadButt(){
    System.out.println("The dragon has headbutted you!");
    return AttackOneDamage;
  }
  
    public int TailWhip(){
      System.out.println("The Dragon has Tail Whiped you!");
      return AttackTwoDamage;
    }
  
    public int Fire(){
      System.out.println("The dragon has set you on fire!");
      return AttackThreeDamage;
    }
  
    public void DHeal(){
      Health = Health + Healing;
      System.out.println("The Dragon has healed itself!");
    }
    
  }
