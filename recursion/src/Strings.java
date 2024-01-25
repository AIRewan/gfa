import java.util.Arrays;

public class Strings {
  // Given a string, write a recursive (no loops) method which returns
  // a new string with the lowercase 'x' chars changed to 'y' chars.

  public static void main(String[] args) {
    System.out.println(changeString("xavér"));
  }

  public static String changeString(String input) {
    if (!input.contains("x")) {
      return input;
    }
    return input.replace("x", "y");
  }
}