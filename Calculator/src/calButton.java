import javax.swing.*;
import java.awt.*;

public class calButton extends JButton {
    calButton(String text,Color color ,int x , int y , int width, int height){
        this.setBounds(x,y,width,height);
        this.setFont(new Font("Arial",Font.BOLD,13));
        this.setFocusable(false);
        this.setBackground(color);
        this.setForeground(Color.white);
        this.setText(text);
    }
}
