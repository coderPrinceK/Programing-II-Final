public class Sphinx extends Character{
    // constructor
    public String Riddle;
    public Sphinx(String CharName, int CharHealth, String Question){
      super(CharName,CharHealth);
      Riddle = Question;
    }
    //methods
    public void PrintRiddle(){
      System.out.println(Riddle);
    }
    
  
    
  }