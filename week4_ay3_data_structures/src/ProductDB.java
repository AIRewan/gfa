import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDB {
  public static void main(String[] args) {
    HashMap<String,Integer> products= new HashMap<>(){{
      put("Milk",200);
      put("Eggs",200);
      put("Chicken",550);
      put("Apples",150);
      put("Fish",400);
      put("Bread",50);
    }};

    System.out.println(products.get("Fish"));

    int max = Collections.max(products.values());
    for(Map.Entry<String, Integer> kv : products.entrySet()){
      if(kv.getValue().equals(max)){
        System.out.println(kv.getKey());
        break;
      }
    }

    double avg = (double)products.values().stream().mapToInt(i -> i).sum()/products.size();
    System.out.println(avg);
    long filteredProducts = products.values().stream().filter(i -> i<300).count();
    System.out.println(filteredProducts);

    boolean for125 = products.values().stream().anyMatch(i->i.equals(125));
    System.out.println(for125? "yes" : "no");

    int min = Collections.min(products.values());
    for(Map.Entry<String, Integer> kv : products.entrySet()){
      if(kv.getValue().equals(min)){
        System.out.println(kv.getKey());
        break;
      }
    }
  }
}
