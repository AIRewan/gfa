// Create the usual class wrapper (Sum) and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero
// to the given parameter
//
// Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int number = reader.nextInt();
    System.out.println(sum(number));
  }

  public static int sum(int number){
    int num = 0;
    for (int i = 1; i <= number; i++) {
      num+= i;
    }
    return num;
  }
}
