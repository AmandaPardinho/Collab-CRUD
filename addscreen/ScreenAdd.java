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
        panelAdd.setLayout(new BorderLayout(10,250));
        panelAdd.setVisible(true);

        //Menubar
        menuBarAdd.setPreferredSize(new Dimension(40, 5));
        menuBarAdd.setVisible(true);
        MenuScreen menuScreenAdd =new MenuScreen();
        frameAdd.add(BorderLayout.NORTH, menuScreenAdd);

        //Product Add
        ProductAdd productAdd = new ProductAdd();
        panelAdd.add(BorderLayout.WEST, productAdd);

        //Product Quantity
        QuantityAdd quantityAdd = new QuantityAdd();
        panelAdd.add(BorderLayout.EAST, quantityAdd);

        //Add Button
        ButtonAdd buttonAdd = new ButtonAdd();
        panelAdd.add(BorderLayout.SOUTH, buttonAdd);

    }
    public static void main(String[] args) throws Exception {
        new ScreenAdd();
    }
}
