import java.awt.EventQueue;
import javax.swing.JFrame;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    GameFrame game = new GameFrame();
                    game.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
