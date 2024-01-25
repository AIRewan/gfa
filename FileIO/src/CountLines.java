import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CountLines {
  // Write a function called countLines() that takes a filename as string as a parameter
  // and returns the number of lines the file contains.
  // It should return zero if it can't open the file
  // and should not raise any error.

  public static void main(String[] args) {
    System.out.println(countLines("src/my-file.txt"));
  }

  public static int countLines(String file){
    try {
      Path path = Paths.get(file);
      return Files.readAllLines(path).size();
    }
    catch (IOException e){
      return 0;
    }
  }
}
