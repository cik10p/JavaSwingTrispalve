import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(int width, int height, String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(width,height);
//        this.setVisible(true);
        ImageIcon icon = new ImageIcon("./src/main/java/coat_h60.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.decode("#f3f3f3"));
    }
}
