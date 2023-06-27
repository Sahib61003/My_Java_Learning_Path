import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RainbowColorApplet extends JFrame implements ActionListener {
    private Color[] rainbowColors = {
            Color.RED, Color.ORANGE, Color.YELLOW,
            Color.GREEN, Color.BLUE, new Color(75, 0, 130),
            new Color(138, 43, 226)
    };

    private JButton[] colorButtons = new JButton[7];
    private JLabel[] colorLabels = new JLabel[7];

    public RainbowColorApplet() {
        setLayout(new FlowLayout());

        for (int i = 0; i < 7; i++) {
            colorButtons[i] = new JButton("Color " + (i + 1));
            colorButtons[i].addActionListener(this);
            add(colorButtons[i]);

            colorLabels[i] = new JLabel();
            colorLabels[i].setPreferredSize(new Dimension(30, 30));
            colorLabels[i].setOpaque(true);
            colorLabels[i].setBackground(rainbowColors[i]);
            add(colorLabels[i]);
        }

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 7; i++) {
            if (e.getSource() == colorButtons[i]) {
                getContentPane().setBackground(rainbowColors[i]);
                repaint();
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RainbowColorApplet();
            }
        });
    }//Sahib Preet Singh 00713211621 AI_ML
}
