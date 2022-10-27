package removescreen;

import javax.swing.*;
import java.awt.*;

public class ScreenRemove {
    //Frame
    private JFrame frameRemove = new JFrame("Remove Item");

    //Panel
    private JPanel panelRemove = new JPanel();

    //Menubar
    private JMenuBar menuBarRemove = new JMenuBar();

    //Array Product
    private String[] removeArray = {"", "Eraser", "Glue", "Notebook", "Paper", "Pen", "Pencil", "Scissors", "Sharpener"};

    //JLabel
    private JLabel removeProductLabel = new JLabel("Product");
    private JLabel removeQuantityLabel = new JLabel("Quantity");

    //ComboBox
    private JComboBox removeProductBox = new JComboBox(removeArray);

    //JTextField
    private JTextField removeQuantity = new JTextField(null, 8);

    public ScreenRemove(){

        //Frame
        frameRemove.add(panelRemove);
        frameRemove.setJMenuBar(menuBarRemove);
        frameRemove.setSize(1280, 720);
        frameRemove.setLocation(0,0);
        frameRemove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameRemove.setVisible(true);

        //Menubar
        menuBarRemove.setPreferredSize(new Dimension(40, 5));
        menuBarRemove.setVisible(true);

        //Layout Panel 1
        panelRemove.setSize(1280, 720);
        panelRemove.setLocation(0,0);
        panelRemove.setLayout(new BorderLayout());
        panelRemove.setVisible(true);
    }

    public static void main(String[] args) {

    }
}
