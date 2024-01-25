//  Create the usual class wrapper (Factorial) and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
//
// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int number = reader.nextInt();
    System.out.println(calculateFactorial(number));
  }

  public static int calculateFactorial(int num){
    int answer =1;
    for (int i = 1; i <= num; i++) {
      answer=answer*i;
    }
    return answer;
  }
}
