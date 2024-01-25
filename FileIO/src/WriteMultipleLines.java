
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteMultipleLines {
  // Create a function `writeLines` that takes 3 parameters: a path, a word and a number.
  // The function should write multiple lines into a file.
  // - The path parameter should be a string that describes the location (path & name)
  //    of the file you wish to write.
  // - The word parameter should also be a string that will be written to the file as individual lines.
  // - The number parameter should describe how many times the function should write the word in the file.
  // Example:
  // If the word is "apple" and the number is 5, it should write 5 lines
  // into the file and each of the should be "apple".
  // When the function can't write into the file, then it shall throw a RuntimeException with the
  // "Unable to write file: <path>" error message.

  public static void main(String[] args){
    writeLines("src/my-file3.txt", "apple", 5);
  }

  public static void writeLines(String file,String line, int number) {
    if (Files.exists(Path.of("src/my-file3.txt"))) {
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < number - 1; i++) {
          writer.write(line);
          writer.newLine();
        }
        writer.write(line);
        writer.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    else {
      System.out.println("Unable to write file: "+ file);
    }
  }
}
