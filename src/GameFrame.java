import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Practice Memory Game");
        setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 200, 1500, 1000);
        
    }
}
