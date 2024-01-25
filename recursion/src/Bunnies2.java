public class Bunnies2 {
  // We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
  // (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
  // (2, 4, ...) have 3 ears each (because they have a raised foot). Write
  // a recursive method which accepts the number of bunnies as a parameter
  // and returns the total number of "ears" in the bunny line. The method should be
  // able to handle invalid input (e.g. negative numbers).

  public static void main(String[] args) {
    System.out.println(numberOfEars(10));
  }

  public static int numberOfEars(int bunnies){
    if (bunnies<=0){
      return 0;
    }
    if(bunnies%2==0){
      return numberOfEars(bunnies-1)+3;
    }
    else{
      return numberOfEars(bunnies-1)+2;
    }
  }
}
