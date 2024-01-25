import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;

public class ReversedLines {
  public static void main(String[] args) throws IOException {
    // Create a method called `decryptReversed` that takes a filename string
    // as a parameter and decrypts the file's content.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    // If the file can't be opened it should print this message: "File not found"
    // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
    // Change the path of the reversed-lines.txt source file to the path
    // where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    decryptReversed("src/main/resources/static/reversed-lines.txt");
  }
  public static void decryptReversed(String src) throws IOException {
    String[] lines = Files.readAllLines(Path.of(src)).toArray(new String[0]);
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/static/output2.txt"));
    for (String l : lines){
      if (Arrays.stream(lines).iterator().hasNext()){
      writer.write(reverse(l));
      writer.newLine();
      }
      writer.write(reverse(l));
    }
    writer.close();
  }
  public static String reverse(String text){
    if (text.length()<=1){
      return text;
    }
    return reverse(text.substring(1))+ text.charAt(0);
  }
}