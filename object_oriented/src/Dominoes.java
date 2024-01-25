import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    //
    System.out.println(dominoes);
    int smallest = findTheSmallest(dominoes);
    Domino first = dominoes.get(smallest);
    dominoes.remove(smallest);
    dominoes.add(0,first);

    for (int i = 1; i < dominoes.size(); i++) {
      if(dominoes.get(i-1).getRightSide()!= dominoes.get(i).getLeftSide()){
        int index= findNext(dominoes, dominoes.get(i-1).getRightSide());
        Domino next = dominoes.get(index);
        dominoes.remove(index);
        dominoes.add(i,next);
      }
    }


    System.out.println(dominoes);
  }
  public  static int findNext(List<Domino> dominoes, int right){
    Domino next=dominoes.stream().filter(i->i.getLeftSide()==right).toList().getFirst();

    return dominoes.indexOf(next);
  }
  public static int findTheSmallest(List<Domino> dominoes){
    int min=7;
    int index=0;
    for (int i = 0; i < dominoes.size(); i++) {
      if (min>dominoes.get(i).getRightSide()){
        index=i;
        min= dominoes.get(i).getRightSide();

      }
    }
    return index;
  }
  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
