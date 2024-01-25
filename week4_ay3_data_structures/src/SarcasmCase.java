import java.util.Arrays;

public class SarcasmCase {
  public static void main(String[] args) {
    String toConvert = "facebook pays it's taxes";
    String result = "";
    for (int i = 0; i < toConvert.length(); i++) {
      char a = toConvert.toCharArray()[i];
      if (i%2==0){
        result+=Character.toUpperCase(a);
      }
      else{
        result+=toConvert.toCharArray()[i];
      }
    }

    System.out.println(result);
  }
}
