import java.util.Random;

public class Pirate {
  public int sanity;
  public boolean alive;
  public boolean captain;
  public String Name;

  public Pirate(String name, boolean cap) {
    this.sanity=5;
    this.alive=true;
    this.Name= name;
    this.captain= cap;
  }

  public void drinkSomeRum(){
    if (this.alive){
    sanity--;
    }
    else{
      isDead();
    }
  }

  public void howsItGoingMate(){
    if (sanity<2 && this.alive){
      System.out.println("Pour me anudder!");
    }
    else if (this.alive){
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
    else {
      isDead();
    }
  }

  public void brawl(Pirate anotherPirate){
    if (alive){
      if (this.alive && anotherPirate.alive){
        int chance =random(3,1);
        if (chance==1){
          int dead = random(2,1);
          if (dead==1){
            die(this);
          }
          else{
            die(anotherPirate);
          }
          System.out.println();
        }
      }
    }
    else {
      isDead(anotherPirate);
    }
  }

  private void die(Pirate p){
    p.alive=false;
    isDead(p);
  }

  private void isDead(Pirate anotherPirate){
    if(anotherPirate.alive){
      System.out.println(this.Name + "is dead.");
    }
    else {
      System.out.println(anotherPirate.Name + "is dead.");
    }
  }
  private void isDead(){
    System.out.println(this.Name + "is dead.");
  }

  public static int random(int max, int min){
    Random rand = new Random();
    return rand.nextInt((max-min)+1)+min;
  }
}
