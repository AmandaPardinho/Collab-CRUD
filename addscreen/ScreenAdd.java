package addscreen;

import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout.*;

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

    public ScreenAdd() throws Exception{

        //Frame
        frameAdd.add(panelAdd);
        frameAdd.setJMenuBar(menuBarAdd);
        frameAdd.setSize(800, 600);
        frameAdd.setLocation(0,0);
        frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameAdd.setVisible(true);

        //Layout PanelAdd
        panelAdd.setSize(800, 600);
        panelAdd.setLocation(0,0);
        panelAdd.setLayout(new BorderLayout());
        panelAdd.setVisible(true);

        //Menubar
        menuBarAdd.setPreferredSize(new Dimension(40, 5));
        menuBarAdd.setVisible(true);
        MenuScreen menuScreenAdd =new MenuScreen();
        frameAdd.add(BorderLayout.NORTH, menuScreenAdd);

        //Product Stuf
        panelAdd.add(addProductLabel);
        //addProductLabel.setPreferredSize(new Dimension(100, 50));
        addProductLabel.setBounds(100, 200, 100, 50);
        addProductLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        addProductLabel.setForeground(new Color(0x000000));
        panelAdd.add(addProductBox);
        addProductBox.setBounds(250, 200, 100, 50);
        addProductBox.setFont(new Font("Arial", Font.PLAIN, 16));
        addProductBox.setForeground(new Color(0x000000));

        //Product Quantity
        panelAdd.add(addQuantityLabel);
        addQuantityLabel.setBounds(400, 300, 100, 50);
        addQuantityLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        addQuantityLabel.setForeground(new Color(0x000000));
        panelAdd.add(addQuantity);
        addQuantity.setBounds(550, 200, 100, 50);
        addQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        addQuantity.setForeground(new Color(0x000000));

        //Add Button
        panelAdd.add(addButton);
        addButton.setBounds(400, 0, 100, 50);
        addButton.setFont(new Font("Arial", Font.PLAIN, 16));
        addButton.setForeground(new Color(0x000000));
        panelAdd.add(BorderLayout.SOUTH, addButton);
    }
    public static void main(String[] args) throws Exception {
        new ScreenAdd();
    }
}
