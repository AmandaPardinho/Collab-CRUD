package welcomescreen;

import javax.swing.*;
import java.awt.*;

public class ButtonViewWelcome extends JPanel {

    //Button
    private JButton viewWelcomeButton = new JButton("View");

    public ButtonViewWelcome(){

        add(viewWelcomeButton);
        viewWelcomeButton.setBounds(400, 0, 100, 50);
        viewWelcomeButton.setFont(new Font("Arial", Font.PLAIN, 16));
        viewWelcomeButton.setForeground(new Color(0x000000));
    }

    public JButton getViewWelcomeButton() {
        return viewWelcomeButton;
    }

    public static void main(String[] args) {

    }
}
