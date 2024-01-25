import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class EncodedLines {
  public static void main(String[] args) {
    // Create a method called `decryptEncoded` that takes a filename string
    // as a parameter and decrypts the file's content.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    // If the file can't be opened it should print this message: "File not found"
    // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
    // Change the path of the encoded-lines.txt source file to the path
    // where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    // You have to figure out the encryption logic by yourself.
    decryptEncoded("src/main/resources/static/encoded-lines.txt");
  }

  public static String[] read (String path){
    try{
      return Files.readAllLines(Path.of(path)).toArray(new String[0]);
    }
    catch (IOException e){
      System.out.println("File not found");
      return new String[0];
    }
  }
  public static void decryptEncoded(String path){
    String[] file = read(path);
    String[] shifted = new String[file.length];
    for (int i = 0; i < file.length; i++) {
      shifted[i]= shiftLeft(file[i]);
    }
    String [] turned =turn(shifted);
    write(turned);
  }

  public static String shiftLeft(String line){
    StringBuilder l = new StringBuilder();
    for (int i = 0; i < line.length(); i++) {
      if(line.toCharArray()[i]!=' '){
        int c = (int) line.toCharArray()[i] -1;
        l.append((char) c);
      }
      else{
        l.append(' ');
      }
    }
    return l.toString();
  }

  public static String[] turn(String[] file) {
    String[] turned = new String[file.length];
    for (int i = file.length; i > 0; i--) {
      turned[turned.length-i]= file[i-1];
    }
    return turned;
  }

  public static void write(String[] file){
    try{
      BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/static/output3.txt"));
      for (int i = 0; i < file.length-1; i++) {
        writer.write(file[i]);
        writer.newLine();
      }
      writer.write(file[file.length-1]);
      writer.close();
    }
    catch (IOException e){
      System.out.println("error");
    }
  }
}