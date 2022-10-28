package welcomescreen;

import javax.swing.*;
import java.awt.*;

public class TextAreaWelcome extends JPanel {

    private JTextArea welcomeTextArea = new JTextArea("Welcome to our store! What would you like to do today?\n" +
            "1- View storage\n" +
            "2 - Add item to storage\n" +
            "3 - Delete item from storage");

    public TextAreaWelcome(){
        //setLayout(new FlowLayout());

        add(welcomeTextArea);
        welcomeTextArea.setBounds(400, 0, 100, 50);
        welcomeTextArea.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeTextArea.setForeground(new Color(0x000000));
        welcomeTextArea.setBackground(new Color(0xf2f2f2));
    }

    public JTextArea getWelcomeTextArea() {
        return welcomeTextArea;
    }

    public static void main(String[] args) {

    }
}
