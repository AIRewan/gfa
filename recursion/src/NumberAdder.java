public class NumberAdder {

  // Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
// and returns the sum of integers from 1 to n.
// The function should return 0 for inputs less than 1.
  public static void main(String[] args) {
    System.out.println(numberAdder(10));
  }

  public static int numberAdder(int n){
    if (n<1){
      return 0;
    }
    return numberAdder(n - 1)+n;
  }
}

