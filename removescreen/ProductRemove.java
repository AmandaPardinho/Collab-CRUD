package removescreen;

import javax.swing.*;
import java.awt.*;

public class ProductRemove extends JPanel {
    //Array Product
    private String[] removeArray = {"", "Eraser", "Glue", "Notebook", "Paper", "Pen", "Pencil", "Scissors", "Sharpener"};

    //JLabel
    private JLabel removeProductLabel = new JLabel("Product");

    //ComboBox
    private JComboBox removeProductBox = new JComboBox(removeArray);

    public ProductRemove(){
        setLayout(new FlowLayout());

        //Product Label
        add(removeProductLabel);
        removeProductLabel.setBounds(100, 200, 100, 50);
        removeProductLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        removeProductLabel.setForeground(new Color(0x000000));

        //Product ComboBox
        add(removeProductBox);
        removeProductBox.setBounds(250, 200, 100, 50);
        removeProductBox.setFont(new Font("Arial", Font.PLAIN, 18));
        removeProductBox.setForeground(new Color(0x000000));
    }

    public JLabel getRemoveProductLabel() {
        return removeProductLabel;
    }

    public JComboBox getRemoveProductBox() {
        return removeProductBox;
    }

    public static void main(String[] args) {

    }
}
