import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFile {
  // Write a `copy` function that copies the contents of a file into another file.
  // The function should take two filenames (strings) as parameters:
  //  - path and name of the source file
  //  - path and name of the target file
  // It should return a boolean that shows whether the copy was successful or not.
  public static void main(String[] args) {

    System.out.println(copy("src/file1", "src/file2")? "Successfully copied" : "Failed to copy");
  }
  public static boolean copy(String file1, String file2) {
    if (!Files.exists(Path.of(file1)) || !Files.exists(Path.of(file2))){
      return false;
    }
    try {
      FileInputStream f1 = new FileInputStream(file1);
      FileOutputStream f2 = new FileOutputStream(file2);

      f2.write(f1.readAllBytes());
    }
    catch (IOException e){
      return false;
    }
    return true;
  }
}