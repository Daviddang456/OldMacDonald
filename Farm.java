class Farm 
{     
   private int numAnimals = 3;
   private Animal[] FarmAnimals = new Animal[numAnimals];
   
   public Farm(){
    FarmAnimals[0] = new NamedCow("Cow", "Elise", "moo!");
    FarmAnimals[1] = new Chick("Chick", "cluck!", "click!");
    FarmAnimals[2] = new Pig("Pig", "oink!");
   }
   
   public void animalSounds(){
    for(int i = 0; i < FarmAnimals.length; i++){
      System.out.println(FarmAnimals[i].getType() + " goes " + FarmAnimals[i].getSound());
    }
    System.out.println("By the way, the cow's name is " + ((NamedCow)FarmAnimals[0]).getName() + "!");
 }
 
} 
