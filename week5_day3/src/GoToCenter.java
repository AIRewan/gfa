import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void drawImage(Graphics graphics) {
    for (int i = 0; i < 3; i++) {
      int[] coordinates = coordinates();
      graphics.drawLine(coordinates[0], coordinates[1], 150, 150);
    }
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