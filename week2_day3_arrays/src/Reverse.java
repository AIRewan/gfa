import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements of `numbers` programmatically
    // - Print the elements of the reversed `numbers`:
    //   [7, 6, 5, 4, 3]

    int[] numbers = {3, 4, 5, 6, 7};
    int[] holder = new int [numbers.length];
    for (int i = numbers.length-1; i >= 0; i--) {
      holder[numbers.length-1-i] = numbers[i];
    }
    numbers=holder;
    System.out.println(Arrays.toString(numbers));
  }
}
