package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {

    JButton close = new JButton("Close");
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    public ScreenOne(){
        setLayout(new FlowLayout());
        getContentPane().add(save);
        getContentPane().add(delete);
        getContentPane().add(close);
        setSize(400,500);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        ScreenOne screen = new ScreenOne();
    }
}
