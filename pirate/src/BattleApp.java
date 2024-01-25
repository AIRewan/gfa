public class BattleApp {
  public static void main(String[] args) {
    Ship BlackPearl = new Ship();
    Ship BlueLagoon = new Ship();

    int rnd = Pirate.random(113,2);
    String p = "Pirate John Doe ";
    for (int i = 0; i < rnd-1; i++) {
      BlackPearl.fillShip(new Pirate((p+i),false));
    }
    BlackPearl.fillShip(new Pirate("Captain Jack Sparrow", true));

    rnd = Pirate.random(113,2);
    p = "Pirate Jane Doe ";
    for (int i = 0; i < rnd-1; i++) {
      BlueLagoon.fillShip(new Pirate((p+i),false));
    }
    BlueLagoon.fillShip(new Pirate("Captain Emmeline Lestrange", true));

    System.out.println(BlackPearl.battle(BlueLagoon) ? "The BlackPearl is the winner!" : "BlueLagoon is the winner");
  }
}
