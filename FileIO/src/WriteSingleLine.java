import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a program in the `main` method that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    try{
      FileWriter writer = new FileWriter("src/my-file2.txt");
      writer.write("Anna");
      writer.close();
    }
    catch (IOException e){
      System.out.println("Unable to write file: my-file-2.txt");
    }
  }
}