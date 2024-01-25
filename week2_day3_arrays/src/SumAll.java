import java.util.Arrays;

public class SumAll {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements of `numbers`

    int [] numbers={3, 4, 5, 6, 7};
    System.out.println(Arrays.stream(numbers).sum());
  }
}
