public class Sharpie {
  String color;
  int width;
  int inkAmount;

  public Sharpie(String color, int width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(){
    this.inkAmount-=10;
  }
}
