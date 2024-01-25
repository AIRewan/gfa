import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // an array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box:
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] coordinates = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    connectTheDots(coordinates,graphics);
  }

  public static void connectTheDots (int[][] coordinates, Graphics graphics) {
    graphics.setColor(Color.green);
    for (int i = 0; i < coordinates.length-1; i++) {
      if (coordinates[i]!= coordinates[coordinates.length-1]){
        graphics.drawLine(coordinates[i][0],coordinates[i][1],coordinates[i+1][0],coordinates[i+1][1]);
      }
    }
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
