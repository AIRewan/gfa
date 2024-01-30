public class Underwear extends Cloth{

  public Underwear(String type, String color) {
    super(100,1, TYPE.UNDERWEAR, type, color);
  }
  public Underwear(int condition, String type, String color){
    super(condition,1, TYPE.UNDERWEAR, type, color);
  }
}
