import java.util.Arrays;

public class Maximum {
  // Write a function which returns the largest element of an array using recursion.

  public static void main(String[] args) {
    int[]numbers = {5, 12, 50, 300, 1, 2, 60};
    System.out.println(theLargest(numbers, numbers.length-1));
  }

  public static int theLargest(int [] numbers, int i){
    if (i==0) {
      return numbers[0];
    }


    return theLargest(Arrays.copyOfRange(numbers, 1,numbers.length-1), i-1);

  }
}
