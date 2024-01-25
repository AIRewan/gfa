import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter something: ");
    String word= reader.nextLine();
    System.out.println(build(word));
  }

  public static String build(String word){
    String answer = word;
    for (int i = word.length()-1; i >= 0; i--) {
      answer += word.toCharArray()[i];
    }
    return answer;
  }
}
