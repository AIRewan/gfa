import java.util.Collections;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> mylist= List.of(500, 1000, 1250, 175, 800, 120);
    int expenses =0;
    for(int i : mylist){
      expenses+=i;
    }
    System.out.println(expenses);
    System.out.println(Collections.max(mylist));
    System.out.println(Collections.min(mylist));
    System.out.println((double)expenses/mylist.size());
  }
}
