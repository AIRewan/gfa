import java.util.ArrayList;
import java.util.List;

public class Ship {
  public List<Pirate> Ship = new ArrayList<>();
  public int crew;
  public Pirate Captain;

  public Ship() {
    this.crew = Pirate.random(113,1);
  }

  public void getCaptain(){
    System.out.println(this.Captain.Name);
  }

  public void fillShip(Pirate p){
    if(Ship.contains(p)){
      System.out.println(p.Name + " is already part of this crew.");
    }
    else if (p.captain && this.Captain==null){
      Captain = p;
      Ship.add(p);
    }
    else{
      Ship.add(p);
    }
  }

  public boolean battle(Ship anotherShip){
    int score = this.Ship.stream().filter(p-> p.alive).toList().size()-(5-
        this.Captain.sanity);
    int anotherScore = anotherShip.Ship.stream().filter(p-> p.alive).toList().size()-(5- anotherShip.Captain.sanity);

    if (score>= anotherScore){
      randomDeath(anotherShip);
      randomDrink(this);
      return true;
    }
    else{
      randomDeath(this);
      randomDrink(anotherShip);
      return false;
    }
  }

  private void randomDeath(Ship s){
    int alive = s.Ship.stream().filter(p-> p.alive).toList().size();
    int rnd = Pirate.random(alive,0);
    for (Pirate p : s.Ship){
      if (p.alive && rnd!=0){
          p.alive = false;
          rnd--;
      }
    }
  }

  private void randomDrink(Ship s){
    for (Pirate p: s.Ship.stream().filter(n->n.alive).toList()){
      int rnd = Pirate.random(5,0);
      p.sanity=p.sanity-rnd;
    }
  }

  @Override
  public String toString() {
    return "Captain: " + this.Captain+ " is " + (this.Captain.alive ? "alive" : "dead") + ". Consumed "+ (5-
        this.Captain.sanity) +" gill of rum."+ "/n"+
    "Pirates alive on the ship: "+Ship.stream().filter(p-> p.alive).toList().size();
  }
}


