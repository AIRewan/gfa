public class SumDigit {
  // Given a non-negative integer n, return the sum of its digits recursively
  // (without loops).
  // Hint
  // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
  // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

  public static void main(String[] args) {
     System.out.println(sumDigit(126));
  }

  public static int sumDigit(int num){
    if (num<=0){
      return 0;
    }
    if (num<10){
      return num;
    }
    else{
      return sumDigit(num%10)+sumDigit(num/10);
    }
  }
}
