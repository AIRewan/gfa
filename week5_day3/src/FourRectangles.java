import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void drawImage(Graphics graphics){
    for (int i = 0; i < 4; i++) {
      int [] coords = getCoordinates();
      graphics.setColor(new Color(coords[0],coords[1],coords[2]));
      graphics.fillRect(coords[0],coords[1],coords[2],coords[3]);
    }

  }
  public static int[] getCoordinates(){
    int[] coordinates = new int[4]  ;
    for (int i = 0; i < 4; i++) {
      double rnd=Math.random();
      coordinates[i] = (int)(rnd * (320-(int)(rnd*200)));
    }
    return coordinates;
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