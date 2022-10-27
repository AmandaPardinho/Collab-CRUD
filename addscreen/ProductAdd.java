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

        add(addProductLabel);
        //addProductLabel.setPreferredSize(new Dimension(100, 50));
        addProductLabel.setBounds(100, 200, 100, 50);
        addProductLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        addProductLabel.setForeground(new Color(0x000000));
        add(addProductBox);
        addProductBox.setBounds(250, 200, 100, 50);
        addProductBox.setFont(new Font("Arial", Font.PLAIN, 16));
        addProductBox.setForeground(new Color(0x000000));
    }

    public static void main(String[] args) {

    }
}
