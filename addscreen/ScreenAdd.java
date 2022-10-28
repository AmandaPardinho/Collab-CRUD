package addscreen;

import screen.MenuScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout.*;

import static javax.swing.GroupLayout.Alignment.BASELINE;

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
        frameAdd.setSize(800, 200);
        frameAdd.setLocation(0,0);
        frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAdd.setVisible(true);

        //Layout PanelAdd
        panelAdd.setSize(800, 200);
        panelAdd.setLocation(0,0);
        panelAdd.setVisible(true);
        GroupLayout layout = new GroupLayout(panelAdd);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //Menubar
        menuBarAdd.setPreferredSize(new Dimension(40, 5));
        menuBarAdd.setVisible(true);
        MenuScreen menuScreenAdd =new MenuScreen();
        frameAdd.add(BorderLayout.NORTH, menuScreenAdd);

        //TextArea
        TextAreaAdd textAreaAdd = new TextAreaAdd();
        panelAdd.add(textAreaAdd);

        //Product Add
        ProductAdd productAdd = new ProductAdd();
        panelAdd.add(productAdd);

        //Product Quantity
        QuantityAdd quantityAdd = new QuantityAdd();
        panelAdd.add(quantityAdd);

        //Add Button
        ButtonAdd buttonAdd = new ButtonAdd();
        panelAdd.add(buttonAdd);

        //Layout
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(productAdd).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).
                        addComponent(quantityAdd))));
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(textAreaAdd).addGroup(layout.
                createSequentialGroup().addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(productAdd).addGroup(layout.createParallelGroup(BASELINE).
                                addComponent(buttonAdd)))));

        panelAdd.setLayout(layout);


    }
    public static void main(String[] args) throws Exception {
        new ScreenAdd();
    }
}
