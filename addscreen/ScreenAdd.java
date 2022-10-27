package addscreen;

import javax.swing.*;
import java.awt.*;

public class ScreenAdd extends JFrame{
    //Frame
    private JFrame frameAdd = new JFrame("Add Item");

    //Panel
    private JPanel panelAdd = new JPanel();

    //Menubar
    private JMenuBar menuBarAdd = new JMenuBar();

    //Button
    private JButton addButton = new JButton("Add");

    //Array Product
    private String[] addArray = {"", "Eraser", "Glue", "Notebook", "Paper", "Pen", "Pencil", "Scissors", "Sharpener"};

    //JLabel
    private JLabel addProductLabel = new JLabel("Product");
    private JLabel addQuantityLabel = new JLabel("Quantity");

    //ComboBox
    private JComboBox addProductBox = new JComboBox(addArray);

    //JTextField
    private JTextField addQuantity = new JTextField(null, 8);

    public ScreenAdd(){

        //Frame
        frameAdd.add(panelAdd);
        frameAdd.setJMenuBar(menuBarAdd);
        frameAdd.setSize(1280, 720);
        frameAdd.setLocation(0,0);
        frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameAdd.setVisible(true);

        //Menubar
        menuBarAdd.setPreferredSize(new Dimension(40, 5));
        menuBarAdd.setVisible(true);

        //Layout PanelAdd
        panelAdd.setSize(1280, 720);
        panelAdd.setLocation(0,0);
        panelAdd.setLayout(new BorderLayout());
        panelAdd.setVisible(true);

        //Add
        panelAdd.add(addProductLabel);
        addButton.setPreferredSize(new Dimension(100, 50));
        panelAdd.add(addProductBox);
        addButton.setPreferredSize(new Dimension(100, 50));
        panelAdd.add(addQuantityLabel);
        addButton.setPreferredSize(new Dimension(100, 50));
        panelAdd.add(addQuantity);
        addButton.setPreferredSize(new Dimension(100, 50));
        panelAdd.add(addButton);
        addButton.setPreferredSize(new Dimension(100, 50));
        panelAdd.add(BorderLayout.SOUTH, addButton);


    }
    public static void main(String[] args) {
        new ScreenAdd();
    }
}
