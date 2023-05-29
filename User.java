public class User extends Character{
    // constructor
    public String WeaponName;
    public int WeaponDamage;
    public String ArmorName;
    public int ArmorNumber;
    public int HealthPackCount;
    public User(String CharName, int CharHealth, String UWeaponName, int UWeaponDamage, String UArmorName, int UArmorNumber,int HPCount){
      super(CharName,CharHealth);
      Health = CharHealth;
      WeaponName = UWeaponName;
      WeaponDamage = UWeaponDamage;
      ArmorName = UArmorName;
      ArmorNumber = UArmorNumber;
      HealthPackCount = HPCount;
    }
    //methods
    public void GetStats(){ // prints stats for user
      super.GetStats();//invoke super for name and health.
      System.out.println("Weapon: "+WeaponName);
      System.out.println("Attack Damage: "+ WeaponDamage);
      System.out.println("Armor: "+ArmorName);
      System.out.println("Defense: "+ArmorNumber);
      System.out.println("Health Packs available: "+HealthPackCount);
    }
  
  public int UAttack(){ // attacks enemy
    System.out.println("You have attacked your opponent!");
    return WeaponDamage;
  }
  
    public void Heal(){ // heals user
    if (HealthPackCount > 0){
      HealthPackCount = HealthPackCount - 1;
      Health = Health + 30;
      System.out.println("You have healed  yourself!");
    }
      else{System.out.println("You are out of health packs so you can not heal yourself!");}
  }
  
      public void sub(int AttackValue){//overides sub method
      Health = Health + ArmorNumber - AttackValue;
    }
  
    public void WeaponNameChange(String item){
      WeaponName = item;
    }
  
    public void WeaponDamageChange(int damage){
      WeaponDamage = damage;
    }
  
    public void ArmorNameChange(String thing){
      ArmorName = thing;
    }
  
    public void ArmorNumber(int DefNumber){
      ArmorNumber = DefNumber;
    }
  
    public void HpUp(int x){
      HealthPackCount  += x;
    }
    
    
  }
  
  
  
  
  // The sub method for some reason is the only way I am able to subtact anything from the any class.
