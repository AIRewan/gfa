public class ReverseString {
  public static void main(String... args) {
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a string which is passed as parameter
    // The method should return the reversed string
    // Pass the `toBeReversed` variable to this method to check if it works well
    // At first, solve this task using the `charAt()` function
    // Try other solutions when you are done

    System.out.println(reverse(toBeReversed));
  }

  public static String reverse(String toReverse){
    String reversed="";
    for (int i = toReverse.length()-1; i >=0 ; i--) {
      reversed+=toReverse.toCharArray()[i];  //toReverse.charAt(i)
    }
    return reversed;
  }
}
