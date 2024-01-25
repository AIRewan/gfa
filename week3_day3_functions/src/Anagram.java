
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter a word: ");
    String firstWord= reader.nextLine();
    System.out.print("Please enter another word: ");
    String secondWord= reader.nextLine();

    System.out.println(isAnagram(firstWord,secondWord));
  }
  public static boolean isAnagram(String one, String two){
    char [] arrayOne = letters(one);
    char [] arrayTwo = letters(two);

    return Arrays.equals(arrayOne,arrayTwo);
  }

  public static char[] letters(String word){
    String allLetterss ="";
    for (int i = 0; i < word.length(); i++) {
      if (Character.isLetter(word.toCharArray()[i])){
        allLetterss += word.toCharArray()[i];
      }
    }
    char [] letters = allLetterss.toLowerCase().toCharArray();
    Arrays.sort(letters);

    return letters;
  }
}
