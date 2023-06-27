import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class SceneryApplet extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the sky
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the sun
        g.setColor(Color.ORANGE);
        g.fillOval(100, 100, 80, 80);

        // Draw the grass
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() - 100, getWidth(), 100);

        // Draw a tree
        g.setColor(new Color(139, 69, 19)); // Brown color
        g.fillRect(400, getHeight() - 200, 50, 200);
        g.setColor(Color.GREEN);
        g.fillOval(375, getHeight() - 250, 100, 100);

        // Draw a house
        g.setColor(Color.RED);
        g.fillRect(200, getHeight() - 300, 200, 200);
        g.setColor(Color.WHITE);
        g.fillRect(250, getHeight() - 250, 100, 100);

        // Draw a road
        g.setColor(Color.GRAY);
        g.fillRect(0, getHeight() - 50, getWidth(), 50);
    }

    public static void main(String[] args) {
        System.out.println("Sahib Preet Singh 00713211621 AI_ML");
        JFrame frame = new JFrame("Application of Jav");
        SceneryApplet scenery = new SceneryApplet();
        frame.getContentPane().add(scenery);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setVisible(true);
    }
}
