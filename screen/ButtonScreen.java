package screen;

import javax.swing.*;
import java.awt.*;

public class ButtonScreen extends JFrame {
    //Buttons
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    public ButtonScreen(){

        //Button Save
        panel.add(save);
        //ActionButton saveAction = new ActionButton();
        //save.addActionListener(saveAction);
        save.setBounds(300, 580, 100, 50);
        //save.setAlignmentX(500);
        //save.setAlignmentY(580);
        //save.setHorizontalAlignment(300);
        //save.setVerticalAlignment(580);
        //save.setPreferredSize(new Dimension(100, 50));
        save.setFont(new Font("Arial", Font.PLAIN, 16));
        save.setForeground(new Color(0x000000));
        save.setBackground(new Color(0xffffff));
        //save.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        //save.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        //Button Delete
        panel.add(delete);
        //ActionButton deleteAction = new ActionButton();
        //delete.addActionListener(deleteAction);
        delete.setBounds(500, 580, 100, 50);
        delete.setAlignmentX(500);
        delete.setAlignmentY(580);
        delete.setHorizontalAlignment(500);
        delete.setVerticalAlignment(580);
        //delete.setPreferredSize(new Dimension(100, 50));
        delete.setFont(new Font("Arial", Font.PLAIN, 16));
        delete.setForeground(new Color(0x000000));
        delete.setBackground(new Color(0xffffff));
        //delete.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        delete.setAlignmentX(Component.BOTTOM_ALIGNMENT);

    }


    public static void main(String[] args) {

    }
}
