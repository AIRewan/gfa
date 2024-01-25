public class Power {
  // Given base and n that are both 1 or more, write a recursive method (no loops)
  // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

  public static void main(String[] args) {
    System.out.println(power(5,2));
  }

  public static int power  (int base, int pow){
    if (pow<=1) {
      return base;
    }
    return base*power(base, pow-1);
  }
}
