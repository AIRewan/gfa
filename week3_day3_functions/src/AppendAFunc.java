// Create the usual class wrapper (AppendAFunc) and main method on your own

// - Create a string variable named `typo` and assign it the value of
// `Chinchill`
// - Write a function called `appendA()` that takes a string as an input,
// appends the character 'a' at the end and returns the modified string
// - Print the result of `appendA(typo)`

public class AppendAFunc {
  public static void main(String[] args) {
    String typo = "Chinchill";
    System.out.println(appendA(typo));
  }

  public static String appendA(String input){
    return input+"a";
  }
}
