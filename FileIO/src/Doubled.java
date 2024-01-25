import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Doubled {

  public static void main(String[] args) throws IOException {
    // Create a method called `decryptDoubled` that takes a filename string
    // as a parameter and decrypts the file's content.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    // If the file can't be opened it should print this message: "File not found"
    // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
    // Change the path of the duplicated-chars.txt source file to the path
    // where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    decryptDoubled("src/main/resources/static/","duplicated-chars.txt");
  }

  public static void decryptDoubled(String path, String filename) throws IOException {
    try {
      Path p = Paths.get(path,filename);
      Object[] lines = Files.readAllLines(p).toArray();
      List<String> clean = new ArrayList<>();
      for (int i = 0; i < lines.length - 1; i++) {
        clean.add(lineCleaner((String) lines[i]));
      }
      Path output = Paths.get (path, "output.txt");
      BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(output)));
      for (int i = 0; i < clean.size() - 1; i++) {
        if (i < clean.size() - 2) {
          writer.write(clean.get(i));
          writer.newLine();
        }
        writer.write(clean.get(i));

      }
      writer.close();
    }
    catch (NoSuchFileException e){
      System.out.println("File not found");
    }
  }

  public static String lineCleaner(String line){
    char [] l = line.toCharArray();
    String giveback ="";
    for (int i = 0; i < l.length; i++) {
      if (i%2==0){
        giveback+=l[i];
      }
    }
    return giveback;
  }
}