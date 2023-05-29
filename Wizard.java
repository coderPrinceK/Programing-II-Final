public class Wizard extends Character{
    //constructor
    public int FirstAttackDamage;
    public int HealAmount;
    public Wizard(String CharName, int CharHealth, int AttackOne, int Healing){
      super(CharName,CharHealth);
      Name = CharName;
      Health = CharHealth;
      FirstAttackDamage = AttackOne;
      HealAmount = Healing;
    }
    //methods
    public void GetStats(){// overides character function.
      System.out.println(" ");
      System.out.println("Enemy: "+Name);
      System.out.println("Health: "+Health);
      System.out.println("Attacks: Fireball");
      System.out.println("Abilities: Heal");
    }
  
    
  public int FireBall(){ // Attacks the player
    System.out.println("The Wizard has attacked you with a Fireball!");
    return FirstAttackDamage;
  }
  
  public void WHeal(){
    Health = Health + HealAmount;
    System.out.println("The Wizard has healed himself "+HealAmount+" points!");
  }
  
    
  }
  
  
  
  // WHeal checked