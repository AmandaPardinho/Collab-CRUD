package removescreen;

import javax.swing.*;
import java.awt.*;

public class TextAreaRemove extends JPanel{
    private JTextArea removeTextArea = new JTextArea("Choose the product. Then enter the quantity to be removed:");

    public TextAreaRemove(){
        setLayout(new FlowLayout());

        add(removeTextArea);
        removeTextArea.setBounds(400, 20, 200, 75);
        removeTextArea.setFont(new Font("Arial", Font.BOLD, 24));
        removeTextArea.setForeground(new Color(0x000000));
        removeTextArea.setBackground(new Color(0xf2f2f2));
    }

    public JTextArea getRemoveTextArea() {
        return removeTextArea;
    }

    public static void main(String[] args) {

    }
}
