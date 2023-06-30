import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Keyboard extends JFrame implements KeyListener {
    private JLabel label;
    private JTextArea area;

    public Keyboard() {
        label = new JLabel();
        label.setBounds(20, 50, 100, 20);
        
        area = new JTextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        
        setLayout(null);
        add(label);
        add(area);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);
        label.setText("Key Pressed " + keyText);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released " + e.getKeyChar());
    }

    public static void main(String[] args) {
        System.out.println("Sahib Preet Singh 007 AI_ML");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Keyboard();
            }
        });
    }
}
