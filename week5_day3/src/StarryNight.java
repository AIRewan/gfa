import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void drawImage(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    graphics.setColor(Color.black);
    graphics.fillRect(0,0,320,320);
    for (int i = 0; i < rnd()*10; i++) {
      int grey= rnd(36,227);
      graphics.setColor(new Color(grey,grey,grey,100));
      graphics.fillRect(rnd(),rnd(), 2,2);
    }
  }

  public static int rnd() {
    Random rnd = new Random();
    int min = 1;
    int max = 319;
    return rnd.nextInt(max-min) + min;
  }

  public static int rnd(int min, int max) {
    Random rnd = new Random();
    return rnd.nextInt(max-min) + min;
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