import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void drawImage(Graphics graphics) {
    // Create a function that draws a single line
    // Use this function to draw the canvas' diagonals
    // If the line starts from the upper-left corner it should be green, otherwise it should be red
    // Make decision about the color in the function
    int [] coords = coordinates();
    if (coords[0]== 0 && coords[1]==0 ){
      graphics.setColor(Color.green);
    } else {
      graphics.setColor(Color.red);
    }
    graphics.drawLine(coords[0], coords[1], coords[0]+320, coords[1]+320);
  }

  public static int[] coordinates(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x = input.nextInt();
    System.out.print("Enter a number: ");
    int y = input.nextInt();

    return new int[] {x, y};
  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}