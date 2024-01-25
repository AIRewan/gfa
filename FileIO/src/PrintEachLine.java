import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
  public static void main(String[] args) throws IOException {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file to separate lines on the console.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".

    Path filepath = Paths.get("src/my-file.txt");
    if (!Files.exists(filepath)){
      System.out.println("Unable to read file: my-file.txt");
      System.exit(0);
    }

    for (String line : Files.readAllLines(filepath)){
      System.out.println(line);
    }
  }
}
