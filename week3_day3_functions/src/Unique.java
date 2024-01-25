import java.util.Arrays;
import java.util.HashSet;

public class Unique {
  public static void main(String[] args) {
    // Create a function that takes an array of numbers as a parameter
    // and returns an array of integers where every integer is unique
    // (occurs only once)

    // Example
    System.out.println(Arrays.toString(findUniqueItems(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
    // should print: `[1, 11, 34, 52, 61]`
  }

  public static Object[] findUniqueItems(int[] numbers){
    HashSet<Integer> unique = new HashSet<>();
    for (int i : numbers){
      unique.add(i);
    }
    return unique.toArray();
  }
}
