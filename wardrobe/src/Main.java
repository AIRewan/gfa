import java.util.List;

public class Main {

  public static void main(String[] args) {
    Wardrobe myWardrobe = new Wardrobe();
    Cloth ts=  new Overwear("T-shirt","black");
    myWardrobe.addCloth(ts);
    Cloth undies = new Underwear(1,"Panties", "pink");
    myWardrobe.addCloth(undies);

    undies.wear();
    ts.wear();
    myWardrobe.printInfo();

    myWardrobe.washAllClothes();
    myWardrobe.printInfo();

    myWardrobe.repairAllClothes();
    myWardrobe.printInfo();

    List<Cloth> purged=  myWardrobe.purge();
    for(Cloth i : purged){
      System.out.println("Purged items:");
      i.getInfo();
    }
  }
}
