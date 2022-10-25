package screen;

import javax.swing.*;
import java.awt.*;

public class SharpenerScreen extends JPanel{

    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Sharpener
    private JLabel sharpener = new JLabel("Sharpener");
    private String[] brandSharpener1 = {"", "Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    private JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    private JComboBox colorSharpener1 = new JComboBox(colorArray);
    private JTextField sharpenerQuantity = new JTextField(null, 8);
    private JTextField sharpenerUnitPrice = new JTextField(null, 8);
    private JTextField sharpenerTotalAmount = new JTextField(null, 8);
    public SharpenerScreen(){
        setLayout(new FlowLayout());

        add(sharpener);
        sharpener.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpener.setForeground(new Color(0x000000));
        sharpener.setPreferredSize(new Dimension(100, 50));
        //sharpener.setBounds(100, 450, 100, 50);

        add(brandSharpener2);
        brandSharpener2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandSharpener2.setForeground(new Color(0x000000));
        brandSharpener2.setPreferredSize(new Dimension(100, 50));
        //brandSharpener2.setBounds(200, 450, 100, 50);

        add(colorSharpener1);
        colorSharpener1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorSharpener1.setForeground(new Color(0x000000));
        colorSharpener1.setPreferredSize(new Dimension(100, 50));
        //colorSharpener1.setBounds(300, 450, 100, 50);

        add(sharpenerQuantity);
        sharpenerQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpenerQuantity.setForeground(new Color(0x000000));
        sharpenerQuantity.setPreferredSize(new Dimension(100, 50));
        //sharpenerQuantity.setBounds(400, 450, 100, 50);

        add(sharpenerUnitPrice);
        sharpenerUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpenerUnitPrice.setForeground(new Color(0x000000));
        sharpenerUnitPrice.setPreferredSize(new Dimension(100, 50));
        //sharpenerUnitPrice.setBounds(500, 450, 100, 50);

        add(sharpenerTotalAmount);
        sharpenerTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpenerTotalAmount.setForeground(new Color(0x000000));
        sharpenerTotalAmount.setPreferredSize(new Dimension(100, 50));
        //sharpenerTotalAmount.setBounds(600, 450, 100, 50);
    }

    public JLabel getSharpener() {
        return sharpener;
    }

    public JComboBox getBrandSharpener2() {
        return brandSharpener2;
    }

    public JComboBox getColorSharpener1() {
        return colorSharpener1;
    }

    public JTextField getSharpenerQuantity() {
        return sharpenerQuantity;
    }

    public JTextField getSharpenerUnitPrice() {
        return sharpenerUnitPrice;
    }

    public JTextField getSharpenerTotalAmount() {
        return sharpenerTotalAmount;
    }

    public static void main(String[] args) {

    }
}