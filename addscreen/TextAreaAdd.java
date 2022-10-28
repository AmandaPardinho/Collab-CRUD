package addscreen;

import javax.swing.*;
import java.awt.*;

public class TextAreaAdd extends JPanel{
    private JTextArea addTextArea = new JTextArea("Choose the product. Then enter the quantity to be added:");

    public TextAreaAdd(){
        setLayout(new FlowLayout());

        add(addTextArea);
        addTextArea.setBounds(400, 20, 200, 75);
        addTextArea.setFont(new Font("Arial", Font.BOLD, 24));
        addTextArea.setForeground(new Color(0x000000));
        addTextArea.setBackground(new Color(0xf2f2f2));
    }

    public JTextArea getAddTextArea() {
        return addTextArea;
    }

    public static void main(String[] args) {

    }
}
