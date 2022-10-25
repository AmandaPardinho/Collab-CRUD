package screen;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class ButtonScreen extends JPanel {
    //Buttons
    private JButton delete = new JButton("Delete");
    private JButton save = new JButton("Save");

    public ButtonScreen(){

        setLayout(new FlowLayout());

        //Button Save
        add(save);
        save.setPreferredSize(new Dimension(100, 50));
        save.setFont(new Font("Arial", Font.PLAIN, 16));
        save.setForeground(new Color(0x000000));
        save.setBackground(new Color(0xffffff));
        save.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        //ActionButton saveAction = new ActionButton();
        //save.addActionListener(saveAction);
        //save.setBounds(300, 580, 100, 50);

        //Button Delete
        add(delete);
        delete.setPreferredSize(new Dimension(100, 50));
        delete.setFont(new Font("Arial", Font.PLAIN, 16));
        delete.setForeground(new Color(0x000000));
        delete.setBackground(new Color(0xffffff));
        delete.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        //ActionButton deleteAction = new ActionButton();
        //delete.addActionListener(deleteAction);
        //delete.setBounds(500, 580, 100, 50);
    }

    public JButton getDelete() {
        return delete;
    }

    public JButton getSave() {
        return save;
    }

    public static void main(String[] args) {

    }
}
