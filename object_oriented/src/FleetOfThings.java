public class FleetOfThings {

  public static void main(String[] args) {
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main()` method
    // - Download those, use those
    // - Create a fleet in the main() method
    
    // - Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Fleet fleet = new Fleet();
    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));

    Thing t1= new Thing("Stand up");
    t1.complete();
    fleet.add(t1);

    Thing t2 = new Thing("Eat lunch");
    t2.complete();
    fleet.add(t2);

    System.out.println(fleet);
  }
}
