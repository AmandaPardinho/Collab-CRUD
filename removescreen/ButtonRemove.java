package removescreen;

import javax.swing.*;
import java.awt.*;

public class ButtonRemove extends JPanel {

    //Button
    private JButton removeButton = new JButton("Remove");

    public ButtonRemove(){

        add(removeButton);
        removeButton.setBounds(400, 0, 100, 50);
        removeButton.setFont(new Font("Arial", Font.PLAIN, 18));
        removeButton.setForeground(new Color(0x000000));
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public static void main(String[] args) {

    }
}
