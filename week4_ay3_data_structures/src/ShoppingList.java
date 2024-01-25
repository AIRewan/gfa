import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shoppingList = List.of("eggs","milk","fish","apples","brad","chicken");
    System.out.println(shoppingList.contains("milk")? "yes":"no");
    System.out.println(shoppingList.contains("banana")? "yes":"no");
  }
}
