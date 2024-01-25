
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingList2 {
  public static void main(String[] args) {
    HashMap<String,Double> prices = new HashMap<>(){{
      put("Milk",1.07);
      put("Rice",1.59);
      put("Eggs",3.14);
      put("Cheese",12.60);
      put("Chicken Breasts",9.40);
      put("Apples",2.31);
      put("Tomato",2.58);
      put("Potato",1.75);
      put("Onion",1.10);
    }};
    HashMap<String,Integer> bobList = new HashMap<>(){{
      put("Milk",3);
      put("Rice",2);
      put("Eggs",2);
      put("Cheese",1);
      put("Chicken Breasts",4);
      put("Apples",1);
      put("Tomato",2);
      put("Potato",1);
    }};
    HashMap<String,Integer> aliceList = new HashMap<>(){{
      put("Rice",1);
      put("Eggs",5);
      put("Chicken Breasts",2);
      put("Apples",1);
      put("Tomato",10);
    }};

    double expense =0;
    int sumBob=0;
    for(Map.Entry<String,Integer> i : bobList.entrySet()){
      expense+=prices.get(i.getKey())*i.getValue();
      sumBob+=i.getValue();
    }
    System.out.println(expense);
    expense=0;
    int sumAlice=0;
    for(Map.Entry<String,Integer> i : aliceList.entrySet()){
      expense+=prices.get(i.getKey())*i.getValue();
      sumAlice+= i.getValue();
    }
    System.out.println(expense);

    System.out.println(whoHasMore("Rice", bobList, aliceList));
    System.out.println(whoHasMore("Potato", bobList, aliceList));
    System.out.println(whoHasMore("Ham", bobList, aliceList));
    System.out.println(whoHasMore("Apples", bobList, aliceList));

    System.out.println(bobList.size()>aliceList.size() ? "Bob" : "Alice");
    System.out.println(sumBob>sumAlice? "Bob": "Alice");


  }


  public static String whoHasMore(String item, HashMap<String,Integer> bob, HashMap<String,Integer> alice){
    if(bob.containsKey(item) && alice.containsKey(item)){
      if(bob.get(item)>alice.get(item)){
        return "Bob";
      } else if(Objects.equals(bob.get(item), alice.get(item))){
        return "no one";
      }
      else{
        return "Alice";
      }
    } else if (bob.containsKey(item) && !alice.containsKey(item)) {
      return "Bob";
    }else if(!bob.containsKey(item) && alice.containsKey(item)){
      return "Alice";
    }
    else{
      return "no one";
    }
  }
}
