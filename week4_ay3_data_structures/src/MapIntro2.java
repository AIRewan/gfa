
import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {
  public static void main(String[] args) {
    Map<String,String> myMap= new HashMap<>(){{
      put("978-1-60309-452-8","A Letter to Jo");
      put("978-1-60309-459-7","Lupus");
      put("978-1-60309-444-3","Red Panda and Moon Bear");
      put("978-1-60309-461-0","The Lab");
    }};

    for(String k : myMap.keySet()){
      System.out.println(myMap.get(k)+" (ISBN: "+k+")");
    }
    myMap.remove("978-1-60309-444-3");

    myMap.values().remove("The Lab");
    myMap.put("978-1-60309-450-4","They Called Us Enemy");
    myMap.put("978-1-60309-453-5","Why Did We Trust Him?");
    System.out.println(myMap.containsKey("478-0-61159-424-8"));
    System.out.println(myMap.get("978-1-60309-453-5"));
   }
}
