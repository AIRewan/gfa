import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
  List<Cloth> Wardrobe = new ArrayList<>();
  public void addCloth(Cloth cloth){
    Wardrobe.add(cloth);
  }

  public void printInfo(){
    Wardrobe.forEach(Cloth::getInfo);
  }

  public void washAllClothes(){            //i->i.needsToBeWashed
    Wardrobe.stream().filter(Cloth::needsToBeWashed).forEach(Cloth::wash);
  }

  public void repairAllClothes(){
    Wardrobe.stream().filter(i->i.Condition>0).forEach(Cloth::repair);
  }

  public List<Cloth> purge() {
    List<Cloth> a = Wardrobe.stream().filter(i -> i.Condition == 0).toList();
    Wardrobe.removeAll(a);
    return a;
  }
}
