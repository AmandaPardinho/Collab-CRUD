package removescreen;

import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;

import static javax.swing.GroupLayout.Alignment.BASELINE;

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
        frameRemove.setSize(900, 200);
        frameRemove.setLocation(0,0);
        frameRemove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frameRemove.setVisible(true);

        //Layout Panel
        panelRemove.setSize(900, 200);
        panelRemove.setLocation(0,0);
        panelRemove.setVisible(true);
        GroupLayout layout = new GroupLayout(panelRemove);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //Menubar
        menuBarRemove.setPreferredSize(new Dimension(40, 5));
        menuBarRemove.setVisible(true);
        MenuScreen menuScreenRemove = new MenuScreen();
        frameRemove.add(BorderLayout.NORTH, menuScreenRemove);

        //TextArea Remove
        TextAreaRemove textAreaRemove = new TextAreaRemove();
        panelRemove.add(textAreaRemove);

        //Product Remove
        ProductRemove productRemove = new ProductRemove();
        panelRemove.add(productRemove);

        //Product Quantity Remove
        QuantityRemove quantityRemove = new QuantityRemove();
        panelRemove.add(quantityRemove);

        //Remove Button
        ButtonRemove buttonRemove = new ButtonRemove();
        panelRemove.add(buttonRemove);

        //Layout
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(productRemove).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).
                        addComponent(quantityRemove))));
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(textAreaRemove).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(productRemove).addGroup(layout.createParallelGroup(BASELINE).
                                addComponent(buttonRemove)))));

        panelRemove.setLayout(layout);

    }

    public static void main(String[] args) {
        new ScreenRemove();
    }
}
