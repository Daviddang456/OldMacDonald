class Chick implements Animal 
{     
  private String mySound;
  private String myType;
  private int Counter;
  
  public Chick(String type, String sound){
     myType = type;
     mySound = sound; 
  }
  
  public Chick(String type, String sound, String sound1){
    Counter = (int)(Math.random() * 100) + 1;
    
    if(Counter <= 50){
      myType = type;
      mySound = sound;
      
    }else if(Counter > 50){
      myType = type;
      mySound = sound1;
    }
    
 }
  
  public String getSound(){
    return mySound;
  }
  
  public String getType(){
     return myType;  
  }
  
}
