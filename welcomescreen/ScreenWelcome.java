package welcomescreen;

import addscreen.ButtonAdd;
import removescreen.ButtonRemove;
import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

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
        frameWelcome.setSize(1000, 200);
        frameWelcome.setLocation(0,0);
        frameWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameWelcome.setVisible(true);

        //Menubar
        menuBarWelcome.setPreferredSize(new Dimension(40, 5));
        menuBarWelcome.setVisible(true);
        MenuScreen menuScreenWelcome =new MenuScreen();
        frameWelcome.add(BorderLayout.NORTH, menuScreenWelcome);

        //Layout Panel
        panelWelcome.setSize(1000, 200);
        panelWelcome.setLocation(0,0);
        panelWelcome.setVisible(true);
        GroupLayout layout = new GroupLayout(panelWelcome);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //TextArea Welcome
        TextAreaWelcome labelWelcome = new TextAreaWelcome();
        panelWelcome.add(labelWelcome);

        //Button View
        ButtonViewWelcome buttonViewWelcome = new ButtonViewWelcome();
        panelWelcome.add(buttonViewWelcome);

        //Button Add
        ButtonAdd buttonAddWelcome = new ButtonAdd();
        panelWelcome.add(buttonAddWelcome);

        //Button Remove
        ButtonRemove buttonRemoveWelcome = new ButtonRemove();
        panelWelcome.add(buttonRemoveWelcome);

        //Layout
        /*layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(buttonViewWelcome).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).
                        addComponent(buttonAddWelcome).addComponent(buttonRemoveWelcome))));*/
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(labelWelcome).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(buttonViewWelcome))));
    }
    public static void main(String[] args) {
        new ScreenWelcome();
    }
}
