import java.util.ArrayList;
import java.util.List;

public class ListIntro {
  public static void main(String[] args) {
    List<String> list= new ArrayList<>();
    System.out.println(list.size());

    list.add("William");
    System.out.println(list.isEmpty());

    list.add("John");
    list.add("Amanda");
    System.out.println(list.size());
    System.out.println(list.get(2));

    for(String name : list){
      System.out.println(name);
    }

    for(String name : list){
      System.out.println("1. "+name);
    }

    list.remove(1);
    for(String name : list){
      System.out.println(name);
    }
    list.clear();
    System.out.println(list.size());
  }
}
