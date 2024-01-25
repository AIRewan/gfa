import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void drawImage(Graphics graphics) {
    graphics.setColor(Color.black);
    for (int i = 0; i < 10; i++) {
      getCoords(i, graphics);
    }
  }

  public static void getCoords(int x,Graphics graphics){
    if (x%2!=0){
      for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
          graphics.fillRect(i * 32, x * 32, 32, 32);
        }
      }
    }
    else{
        for (int i = 0; i < 10; i++) {
          if (i%2!=0){
            graphics.fillRect(i*32,x*32, 32, 32);
          }
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