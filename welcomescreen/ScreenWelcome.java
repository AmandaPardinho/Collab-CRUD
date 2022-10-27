package welcomescreen;

import addscreen.ButtonAdd;
import removescreen.ButtonRemove;
import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;

public class ScreenWelcome {
    //Frame
    private JFrame frameWelcome = new JFrame("Welcome");

    //Panel
    private JPanel panelWelcome = new JPanel();

    //Menubar
    private JMenuBar menuBarWelcome = new JMenuBar();



    public ScreenWelcome(){

        //Frame
        frameWelcome.add(panelWelcome);
        frameWelcome.setJMenuBar(menuBarWelcome);
        frameWelcome.setSize(800, 600);
        frameWelcome.setLocation(0,0);
        frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameWelcome.setVisible(true);

        //Menubar
        menuBarWelcome.setPreferredSize(new Dimension(40, 5));
        menuBarWelcome.setVisible(true);
        MenuScreen menuScreenWelcome =new MenuScreen();
        frameWelcome.add(BorderLayout.NORTH, menuScreenWelcome);

        //Layout Panel 1
        panelWelcome.setSize(800, 600);
        panelWelcome.setLocation(0,0);
        panelWelcome.setLayout(new BorderLayout());
        panelWelcome.setVisible(true);

        //Label Welcome
        LabelWelcome labelWelcome = new LabelWelcome();
        panelWelcome.add(BorderLayout.NORTH, labelWelcome);

        //Button View
        ButtonViewWelcome buttonViewWelcome = new ButtonViewWelcome();
        panelWelcome.add(BorderLayout.WEST, buttonViewWelcome);

        //Button Add
        ButtonAdd buttonAddWelcome = new ButtonAdd();
        panelWelcome.add(BorderLayout.SOUTH, buttonAddWelcome);

        //Button Remove
        ButtonRemove buttonRemoveWelcome = new ButtonRemove();
        panelWelcome.add(BorderLayout.EAST, buttonRemoveWelcome);
    }
    public static void main(String[] args) {
        new ScreenWelcome();
    }
}
