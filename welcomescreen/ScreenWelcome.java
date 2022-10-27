package welcomescreen;

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
        frameWelcome.setSize(1280, 720);
        frameWelcome.setLocation(0,0);
        frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameWelcome.setVisible(true);

        //Menubar
        menuBarWelcome.setPreferredSize(new Dimension(40, 5));
        menuBarWelcome.setVisible(true);

        //Layout Panel 1
        panelWelcome.setSize(1280, 720);
        panelWelcome.setLocation(0,0);
        panelWelcome.setLayout(new BorderLayout());
        panelWelcome.setVisible(true);
    }
    public static void main(String[] args) {

    }
}
