package addscreen;

import javax.swing.*;
import java.awt.*;

public class ProductAdd extends JPanel {

    //Array Product
    private String[] addArray = {"", "Eraser", "Glue", "Notebook", "Paper", "Pen", "Pencil", "Scissors", "Sharpener"};

    //JLabel
    private JLabel addProductLabel = new JLabel("Product");

    //ComboBox
    private JComboBox addProductBox = new JComboBox(addArray);

    public ProductAdd(){
        setLayout(new FlowLayout());

        //Product Label
        add(addProductLabel);
        //addProductLabel.setPreferredSize(new Dimension(100, 50));
        addProductLabel.setBounds(100, 220, 200, 50);
        addProductLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        addProductLabel.setForeground(new Color(0x000000));

        //Product ComboBox
        add(addProductBox);
        addProductBox.setBounds(250, 220, 200, 50);
        addProductBox.setFont(new Font("Arial", Font.PLAIN, 18));
        addProductBox.setForeground(new Color(0x000000));
    }

    public JLabel getAddProductLabel() {
        return addProductLabel;
    }

    public JComboBox getAddProductBox() {
        return addProductBox;
    }

    public static void main(String[] args) {

    }
}
