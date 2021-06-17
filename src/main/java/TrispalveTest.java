import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TrispalveTest {
    public static void main(String[] args) {

        int width = 420;
        int height = 420;

        MyFrame frame = new MyFrame(width,height, "Trispalve");

        frame.setLayout(new GridLayout(3,1,0,0));

        // sukurti JPanel geltona spalva
        JPanel geltona = new JPanel();
        geltona.setBackground(Color.yellow);
        geltona.setSize(width,height/3);

        frame.add(geltona);

        // sukurti JPanel zalios spalva
        JPanel zalia = new JPanel();
        zalia.setBackground(Color.green);
        zalia.setSize(width,height/3);
        frame.add(zalia);

        // sukurti JPanel randonos spalva
        JPanel raudona = new JPanel();
        raudona.setBackground(Color.red);
        raudona.setSize(width,height/3);
        frame.add(raudona);

        frame.setVisible(true);
    }
}
