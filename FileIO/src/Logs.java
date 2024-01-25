import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Logs {
  public static void main(String[] args){
    // Write a method `getUniqueIpAddresses` which accepts a path to `log.txt`
    // as a parameter and returns an array of unique IP addresses.
    // Write a method `getRequestRatio` which accepts a path to `log.txt`
    // as a parameter and returns the ratio of GET to POST requests.
    // If the specified file cannot be found the methods should return an empty
    // array and 0.0 respectively (and raise no errors).
    // Change the path of the log.txt source file to the path
    // where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    System.out.println(String.join(System.lineSeparator(), getUniqueIpAddresses("src/main/resources/static/log.txt")));
    System.out.println(getRequestRatio("src/main/resources/static/log.txt"));
  }

  public static String[] getUniqueIpAddresses(String path){
    try {
      HashSet<String> IPs = new HashSet<>();
      String[] log = Files.readAllLines(Path.of(path)).toArray(new String[0]);
      for (String line : log) {
        String[] elements = line.split(" ");
        IPs.add(findIP(elements));
      }
      return IPs.toArray(new String[0]);
    }
    catch (IOException e) {
      return new String[] {};
    }
  }

  public static double getRequestRatio(String path){
    try{
      String[] log = Files.readAllLines(Path.of(path)).toArray(new String[0]);
      double countPost=0;
      double countGet =0;
      for (String line : log) {
        String[] elements = line.split(" ");
        if(getAPI(elements).equals("GET")){
          countGet++;
        }
        else{
          countPost++;
        }
      }
     return countGet/countPost;

    }
    catch (IOException e){
      return 0.0;
    }
  }

  public static String findIP (String[] elements){
    for(String element : elements){
      if(element.contains(".")){
        return element;
      }
    }
    return null;
  }

  public static String getAPI(String[] elements){
    if(Arrays.asList(elements).contains("GET")){
      return "GET";
    }
    return "POST";
  }
}