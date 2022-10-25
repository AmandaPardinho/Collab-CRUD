package screen;

import javax.swing.*;
import java.awt.*;

public class GlueScreen extends JPanel {
    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Glue
    private JLabel glue = new JLabel("Glue");
    private String[] brandGlue1 = {"", "Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    private JComboBox brandGlue2 = new JComboBox(brandGlue1);
    private JComboBox colorGlue1 = new JComboBox(colorArray);
    private JTextField glueQuantity = new JTextField(null, 8);
    private JTextField glueUnitPrice= new JTextField(null, 8);
    private JTextField glueTotalAmount= new JTextField(null, 8);

    public GlueScreen(){
        setLayout(new FlowLayout());

        add(glue);
        glue.setPreferredSize(new Dimension(100, 50));
        glue.setFont(new Font("Arial", Font.PLAIN, 16));
        glue.setForeground(new Color(0x000000));
        //glue.setBounds(100, 150, 100, 50);

        add(brandGlue2);
        brandGlue2.setPreferredSize(new Dimension(100, 50));
        brandGlue2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandGlue2.setForeground(new Color(0x000000));
        //brandGlue2.setBounds(200, 150, 100, 50);

        add(colorGlue1);
        colorGlue1.setPreferredSize(new Dimension(100, 50));
        colorGlue1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorGlue1.setForeground(new Color(0x000000));
        //colorGlue1.setBounds(300, 150, 100, 50);

        add(glueQuantity);
        glueQuantity.setPreferredSize(new Dimension(100, 50));
        glueQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        glueQuantity.setForeground(new Color(0x000000));
        //glueQuantity.setBounds(400, 150, 100, 50);

        add(glueUnitPrice);
        glueUnitPrice.setPreferredSize(new Dimension(100, 50));
        glueUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        glueUnitPrice.setForeground(new Color(0x000000));
        //glueUnitPrice.setBounds(500, 150, 100, 50);

        add(glueTotalAmount);
        glueTotalAmount.setPreferredSize(new Dimension(100, 50));
        glueTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        glueTotalAmount.setForeground(new Color(0x000000));
        //glueTotalAmount.setBounds(600, 150, 100, 50);
    }

    public JLabel getGlue() {
        return glue;
    }

    public JComboBox getBrandGlue2() {
        return brandGlue2;
    }

    public JComboBox getColorGlue1() {
        return colorGlue1;
    }

    public JTextField getGlueQuantity() {
        return glueQuantity;
    }

    public JTextField getGlueUnitPrice() {
        return glueUnitPrice;
    }

    public JTextField getGlueTotalAmount() {
        return glueTotalAmount;
    }

    public static void main(String[] args) {

    }
}
