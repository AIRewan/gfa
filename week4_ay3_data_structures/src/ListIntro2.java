
import java.util.Collections;
import java.util.List;

public class ListIntro2 {
  public static void main(String[] args) {
    List<String> list_A = new java.util.ArrayList<>(List.of("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    List<String> list_B = new java.util.ArrayList<>(list_A);

    System.out.println(list_A.contains("Durian"));
    list_B.remove("Durian");
    list_A.add(4, "Kiwifruit");
    System.out.println(list_A.size()==list_B.size());
    System.out.println(list_A.indexOf("Avocado"));
    System.out.println(list_B.indexOf("Durian"));
    Collections.addAll(list_B, "Passion Fruit" ,"Pomelo");
    System.out.println(list_A.toArray()[2]);
    System.out.println(list_A);
    System.out.println(list_B);
  }
}
