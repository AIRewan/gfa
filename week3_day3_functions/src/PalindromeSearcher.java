import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class PalindromeSearcher {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter something: ");
    String input = reader.nextLine();
    System.out.println(Arrays.toString(search(input)));
  }

  public static Object[] search (String input){
    List<String> allSlices = slices(input);
    List<String> answer= new ArrayList<>();
    for(String slice : allSlices){
      if(isPalindrome(slice)){
        answer.add(slice);
      }
    }
    return answer.toArray();
  }

  public static boolean isPalindrome(String line){
    String half= line.substring(0,line.length()/2);
    String otherHalf = "";

    for (int i = half.length() - 1; i >= 0; i--) {
      otherHalf+= half.toCharArray()[i];
    }
    line= line.substring(half.length());

    if (line.endsWith(otherHalf))
    {
      line= line.substring(0, line.length() - otherHalf.length());
    }
    return line.length()<=1;

  }

  public static List<String> slices(String input){
    List<String> allSlices = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = input.length(); j > 0 ; j--) {
        if (j-i>=3){
        allSlices.add(input.substring(i,j));
        }
      }
    }
    return allSlices;
  }
}
