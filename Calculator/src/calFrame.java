import javax.swing.*;
import java.awt.*;

public class calFrame extends JFrame {
    calFrame(String title){
        this.setTitle(title);
        this.setSize(300, 490);
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

