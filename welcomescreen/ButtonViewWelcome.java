package welcomescreen;

import javax.swing.*;
import java.awt.*;

public class ButtonViewWelcome extends JPanel {

    //Button
    private JButton viewWelcomeButton = new JButton("View");

    public ButtonViewWelcome(){
        setLayout(new FlowLayout());

        add(viewWelcomeButton);
        viewWelcomeButton.setBounds(400, 0, 100, 50);
        viewWelcomeButton.setFont(new Font("Arial", Font.PLAIN, 18));
        viewWelcomeButton.setForeground(new Color(0x000000));
    }

    public JButton getViewWelcomeButton() {
        return viewWelcomeButton;
    }

    public static void main(String[] args) {

    }
}
