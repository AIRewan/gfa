import java.util.HashMap;
import java.util.Map;

public class ProductDB2 {
  public static void main(String[] args) {
    HashMap<String,Integer> products= new HashMap<>(){{
      put("Milk",200);
      put("Eggs",200);
      put("Chicken",550);
      put("Apples",150);
      put("Fish",400);
      put("Bread",50);
    }};

    for(Map.Entry<String, Integer> db : products.entrySet()){
      if (db.getValue()<201) {
        System.out.println(db.getKey());
      }
    }
    for(Map.Entry<String, Integer> db : products.entrySet()){
      if (db.getValue()>150) {
        System.out.println(db.getKey() + " "+ db.getValue());
      }
    }
  }
}
