package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {

    JButton close = new JButton("Close");
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");
    JLabel eraser = new JLabel("Eraser");
    JLabel glue = new JLabel("Glue");
    JLabel notebook = new JLabel("Notebook");
    JLabel paper = new JLabel("Paper");
    JLabel pen = new JLabel("Pen");
    JLabel pencil = new JLabel("Pencil");
    JLabel scissors = new JLabel("Scissor");
    //JMenuBar menu = new JMenuBar();
    JLabel label = new JLabel("A label");


    public ScreenOne(){
        setLayout(new FlowLayout());
        setLayout(new GridLayout(7, 5));
        //getJMenuBar(menu);
        getContentPane().add(eraser);
        getContentPane().add(glue);
        getContentPane().add(notebook);
        getContentPane().add(paper);
        getContentPane().add(pen);
        getContentPane().add(pencil);
        getContentPane().add(scissors);
        getContentPane().add(save);
        getContentPane().add(delete);
        getContentPane().add(close);
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(0xffffdd));
        setSize(400,500);
        setVisible(true);
        //pack();
    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
