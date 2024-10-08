import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void drawImage(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters
    // (the square size, the fill color and the graphics)
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares ().
      Color [] colors = new Color[]{Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.decode("#3F00FF"), Color.decode("#490648")};
    int size = 300;
    for (Color c : colors){
      draw(graphics,size,c);
      size-=30;
    }
  }

  public static void draw(Graphics graphics, int x, Color color){
    double v = (double) x / 2;
    int size= (int) v;
    graphics.setColor(color);
    graphics.fillRect(160-size, 160-size, x, x);
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