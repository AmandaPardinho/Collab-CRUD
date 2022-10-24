package screen;

import javax.swing.*;
import java.awt.*;

public class SharpenerScreen {

    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"", "Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    JComboBox colorSharpener1 = new JComboBox(colorArray);
    JTextField sharpenerQuantity = new JTextField(null, 8);
    JTextField sharpenerUnitPrice = new JTextField(null, 8);
    JTextField sharpenerTotalAmount = new JTextField(null, 8);
    public SharpenerScreen(){
        //Sharpener
        sharpener.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpener.setForeground(new Color(0x000000));
        panel.add(sharpener);
        sharpener.setPreferredSize(new Dimension(100, 50));
        sharpener.setBounds(100, 450, 100, 50);
        panel.add(brandSharpener2);
        brandSharpener2.setPreferredSize(new Dimension(100, 50));
        brandSharpener2.setBounds(200, 450, 100, 50);
        panel.add(colorSharpener1);
        colorSharpener1.setPreferredSize(new Dimension(100, 50));
        colorSharpener1.setBounds(300, 450, 100, 50);
        panel.add(sharpenerQuantity);
        sharpenerQuantity.setPreferredSize(new Dimension(100, 50));
        sharpenerQuantity.setBounds(400, 450, 100, 50);
        panel.add(sharpenerUnitPrice);
        sharpenerUnitPrice.setPreferredSize(new Dimension(100, 50));
        sharpenerUnitPrice.setBounds(500, 450, 100, 50);
        panel.add(sharpenerTotalAmount);
        sharpenerTotalAmount.setPreferredSize(new Dimension(100, 50));
        sharpenerTotalAmount.setBounds(600, 450, 100, 50);
    }

    public static void main(String[] args) {

    }
}
