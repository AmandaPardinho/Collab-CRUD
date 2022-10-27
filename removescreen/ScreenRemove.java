package removescreen;

import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;

public class ScreenRemove {
    //Frame
    private JFrame frameRemove = new JFrame("Remove Item");

    //Panel
    private JPanel panelRemove = new JPanel();

    //Menubar
    private JMenuBar menuBarRemove = new JMenuBar();


    public ScreenRemove(){

        //Frame
        frameRemove.add(panelRemove);
        frameRemove.setJMenuBar(menuBarRemove);
        frameRemove.setSize(800, 600);
        frameRemove.setLocation(0,0);
        frameRemove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameRemove.setVisible(true);

        //Layout Panel 1
        panelRemove.setSize(800, 600);
        panelRemove.setLocation(0,0);
        panelRemove.setLayout(new BorderLayout());
        panelRemove.setVisible(true);

        //Menubar
        menuBarRemove.setPreferredSize(new Dimension(40, 5));
        menuBarRemove.setVisible(true);
        MenuScreen menuScreenRemove = new MenuScreen();
        frameRemove.add(BorderLayout.NORTH, menuScreenRemove);

        //Product Remove
        ProductRemove productRemove = new ProductRemove();
        panelRemove.add(BorderLayout.WEST, productRemove);

        //Product Quantity Remove

        //Remove Button
    }

    public static void main(String[] args) {
        new ScreenRemove();
    }
}
