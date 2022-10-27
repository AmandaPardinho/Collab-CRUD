package addscreen;

import javax.swing.*;
import java.awt.*;

public class ButtonAdd extends JPanel {

    //Button
    private JButton addButton = new JButton("Add");

    public ButtonAdd(){

        add(addButton);
        addButton.setBounds(400, 0, 100, 50);
        addButton.setFont(new Font("Arial", Font.PLAIN, 16));
        addButton.setForeground(new Color(0x000000));
    }

    public JButton getAddButton() {
        return addButton;
    }

    public static void main(String[] args) {

    }
}
