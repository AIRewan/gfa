public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }
  public void eat(){
    this.hunger+=-1;
  }
  public void drink(){
    this.thirst+=-1;
  }
  public void play(){
    this.thirst++;
    this.hunger++;
  }
}
