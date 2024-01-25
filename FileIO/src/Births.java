import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  // Create a function `getMostFrequentYear` which takes the name of a CSV file as a parameter,
  // - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
  // and returns the year (as a String) when the most births happened.
  // If there were multiple years with the same number of births then return any of them.
  // If the given file doesn't exist, the function should return "File not found"

  // Change the path of the /births.csv source file to the path where you saved it on your computer.
  // You can find the source file in a link next to this exercise.

  public static void main(String[] args) {
    System.out.println(getMostFrequentYear("src/main/resources/static/births.csv")); // should print "2006" or "2016"
    System.out.println(getMostFrequentYear("src/main/resources/static/not-existing-file.csv")); // should print "File not found"
  }

  public static Integer getMostFrequentYear(String path){
    List<Integer> years = read(path);
    Map<Integer, Integer> collector = new HashMap<>();
    for(int year : years){
      collector.put(year, collector.getOrDefault(year, 0) + 1);
    }
    int max= 0;
    int year =0;
    for(Map.Entry<Integer,Integer> kv : collector.entrySet()){
      if (kv.getValue()>max){
        max=kv.getValue();
        year=kv.getKey();
      }
    }
return year;
  }

  public static List<Integer> read(String path){
    List<Integer> years = new ArrayList<>();
    try {
      String[] file = Files.readAllLines(Path.of(path)).toArray(new String[0]);
      for (int i = 0; i < file.length; i++) {
        String s = file[i].split(";")[1];
        s =s.split("-")[0];
        years.add(Integer.parseInt(s));
      }
      return years;
    }
    catch (IOException e){
      System.out.println("File not found");
      return years;
    }
  }

}