public class Character{
    String Name;
    int Health;
    public Character(String CharName, int CharHealth){
      //constructor
      Name = CharName;
      Health = CharHealth;
    }
    //methods 
    public String GetName(){
      return Name;
    }
  
  public int GetHealth(){
    return Health;
  }
  
  public void GetStats(){
    System.out.println(" ");
    System.out.println("Name: "+Name);
    System.out.println("Health: "+Health);
  }
  
    public void sub(int AttackValue){
      Health = Health - AttackValue;
    }
    
  }
  
  
  //all methods have been checked