import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TicTacToe {
  public static String winner = "n";
  public static void main(String[] args) {
    // Write a method `calculateTicTacResult` which takes a filename as a parameter,
    // and returns "X", "O" or "Draw" based on the input file's content
    // The file contains a finished Tic-Tac-Toe match
    // See the examples in draw.txt, win-x.txt, win-o.txt

    System.out.println(calculateTicTacResult("src/main/resources/static/win-o.txt"));
    // Should print "O"

    System.out.println(calculateTicTacResult("src/main/resources/static/win-x.txt"));
    // Should print "X"

    System.out.println(calculateTicTacResult("src/main/resources/static/draw.txt"));
    // Should print "Draw"
  }
  public static String calculateTicTacResult(String path){
    char [][] file = getMatrix(path);
    char [][] tilted = getTilted(file);
    if(areTheSame(file[0]) || areTheSame(file[1]) || areTheSame(file[2] )||
        (areTheSame(tilted[0]) || areTheSame(tilted[1]) || areTheSame(tilted[2]) || areTheSame(file))){
      return winner;
    }
    else{
      return "Draw";
    }
  }
  public static char[][] getMatrix (String path){
    try{
      String[] file = Files.readAllLines(Path.of(path)).toArray(new String[0]);
      char[][] result = new char[3][3];
      for (int i = 0; i < result.length; i++) {
        char [] c = file[i].toCharArray();
        for (int j = 0; j < c.length; j++) {
          result[i][j]=c[j];
        }
      }
      return result;
    }
    catch (IOException e){
      System.out.println(e);
      return null;
    }
  }

  public static char[][] getTilted(char [][] file){
    char [][] tilt = new char [3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        tilt[i][j] = file[j][i];
      }
    }
    return tilt;
  }

  public static boolean areTheSame(char[] line){
    HashSet<Character> h = new HashSet<>();
    for(char i : line){
      h.add(i);
    }
    if (h.size()==1){
      winner= String.valueOf(line[0]);
    }
    return h.size()==1;
  }

  public static boolean areTheSame(char [][] file){
    if ((file[0][0] == file[1][1] && file[2][2] == file[1][1]) ||
        file[0][1] == file[1][1] && file[2][1] == file[1][1]) {
      winner = String.valueOf(file[1][1]);
      return true;
    }
      return false;
  }



  //win condition: lines 3 same, rows 3 same,     ---check
  // or if line1 0, line2 1, line3 2 same,
  // or if line1 2, line2 1, line3 0 are same
}