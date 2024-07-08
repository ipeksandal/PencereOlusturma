import javax.swing.*;
import java.awt.*;

public class Panelim extends JPanel {
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(50,50,100,30);
        g.setColor(Color.CYAN);
        g.fillRect(10,10,10,10);

    }
}
