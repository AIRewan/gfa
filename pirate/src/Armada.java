import java.util.ArrayList;
import java.util.List;

public class Armada {
  public List<Ship> Armada = new ArrayList<>();
  public Armada() {
  }
  public void addShip(Ship s){
    if (Armada.contains(s)){
      System.out.println("This ship is already in this armada.");
    }else{
    Armada.add(s);
    }
  }

  public boolean war (Armada anotherArmada){
    int size= 0;
    if(this.Armada.size() >= anotherArmada.Armada.size()) {
      size= this.Armada.size();
    }
    else {
      size= anotherArmada.Armada.size();
    }

    for (int i = 0; i < size; i++) {
      this.Armada.get(i).battle(anotherArmada.Armada.get(i));
    }
    // itt tartok és bajban vagyok a hajók elsüllyesztésével
    return true;
  }
}
