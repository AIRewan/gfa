import java.util.HashMap;
import java.util.Map;


public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String,String> phonebook = new HashMap<>(){{
      put("William A. Lathan","405-709-1865");
      put("John K. Miller","402-247-8568");
      put("Hortensia E. Foster","606-481-6467");
      put("Amanda D. Newland","319-243-5613");
      put("Brooke P. Askew","307-687-2982");
    }};

    System.out.println(phonebook.get("John K. Miller"));
    for (Map.Entry<String,String> i : phonebook.entrySet()){
      if(i.getValue().equals("307-687-2982")){
        System.out.println(i.getKey());
        break;
      }
    }
    System.out.println(phonebook.containsKey("Chris E. Myers")? "yes":"no");
  }
}
