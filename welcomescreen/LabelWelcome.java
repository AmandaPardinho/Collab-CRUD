package welcomescreen;

import javax.swing.*;
import java.awt.*;

public class LabelWelcome extends JPanel {

    private JLabel welcameLabel = new JLabel("Welcome to our store!\n What would you like to do today?\n" +
            "                1- View storage\n" +
            "                2 - Add item to storage\n" +
            "                3 - Delete item from storage");

    public LabelWelcome(){
        add(welcameLabel);
        welcameLabel.setBounds(400, 0, 100, 50);
        welcameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcameLabel.setForeground(new Color(0x000000));
    }

    public JLabel getWelcameLabel() {
        return welcameLabel;
    }

    public static void main(String[] args) {

    }
}
