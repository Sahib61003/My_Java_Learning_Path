import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class CircularMovingBannerApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Banner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CircularMovingBannerPanel panel = new CircularMovingBannerPanel();
        frame.add(panel);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    static class CircularMovingBannerPanel extends JPanel implements Runnable {
        private String bannerText;
        private int angle;

        public CircularMovingBannerPanel() {
            // Set the banner text
            bannerText = "This is my Java Object Oriented Progamming File";
            angle = 0;
            Thread animationThread = new Thread(this);
            animationThread.start();
        }

        public void run() {
            try {
                while (true) {
                    // Update the angle
                    angle++;

                    // Repaint the panel
                    repaint();

                    // Delay for smoother animation (adjust the value to change the speed)
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set anti-aliasing for smoother text rendering
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            // Clear the panel
            g.clearRect(0, 0, getWidth(), getHeight());

            // Set the font and color for the banner text
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.setColor(Color.BLUE);

            // Calculate the position of the text based on the angle
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int radius = Math.min(centerX, centerY) - 10;
            int x = centerX + (int) (Math.cos(Math.toRadians(angle)) * radius);
            int y = centerY + (int) (Math.sin(Math.toRadians(angle)) * radius);

            // Draw the banner text at the calculated position
            g.drawString(bannerText, x, y);
        }
    }
}
