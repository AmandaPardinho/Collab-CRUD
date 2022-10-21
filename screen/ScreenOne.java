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
    String[] brandNotebook1 = {"Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);

    public ScreenOne(){
        setLayout(new FlowLayout());
        setLayout(new GridLayout(7, 5));
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setForeground(new Color(0xbb5d7f));
        //getJMenuBar(menu);
        getContentPane().add(eraser);
        getContentPane().add(glue);
        getContentPane().add(notebook);
        getContentPane().add(brandNotebook2);
        getContentPane().add(paper);
        getContentPane().add(pen);
        getContentPane().add(pencil);
        getContentPane().add(scissors);
        getContentPane().add(save);
        getContentPane().add(delete);
        getContentPane().add(close);

        setSize(400,500);
        setVisible(true);
        //pack();
    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
