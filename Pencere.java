import javax.swing.*;
import java.awt.*;

public class Pencere{
    public static void main(String[] args) {

        Panelim panelim = new Panelim();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame panel = new JFrame("İlk pencerem");
        panel.setSize(300,200);
        panel.setLocation(0,0);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(panelim);
        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        //Container pane;
        //Graphics g;

        /*JFrame pencere;

        pencere = new JFrame("İlk pencerem");
        pencere.setSize(300,200);
        pencere.setLocation(300,300);
        pencere.setVisible(true);
        pane = pencere.getContentPane();
        g = pane.getGraphics();
        g.setColor(Color.BLUE);
        g.drawRect(50,50,100,30);*/
    }
}