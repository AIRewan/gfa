public class DivideByZero {
    public static void main(String[] args) {
      // Create a `divide10By` function that divides number 10 (integer)
      // by an integer number that's passed as a parameter and prints the result.
      // The result of the division should be an integer as well (not a floating point number).
      // It should print "fail" if the parameter is 0

      // Examples:
      System.out.println(divide10By(2)); // should print 5
      System.out.println(divide10By(5)); // should print 2
      System.out.println(divide10By(4)); // should print 2
      System.out.println(divide10By(3)); // should print 3
      System.out.println(divide10By(0)); // should print fail
    }

    public static int divide10By(int number){
      if (number==0){
        System.out.println("Fail");
        return -5;
      }
      else{
        return (10/number);
      }
    }
}

