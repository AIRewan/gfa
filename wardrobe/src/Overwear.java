public class Overwear extends Cloth{

  public Overwear(String type, String color) {
    super(50,5, TYPE.OVERWEAR, type, color);
  }
  public Overwear(int condition, String type, String color){
    super(condition,5, TYPE.OVERWEAR, type, color);
  }
}
