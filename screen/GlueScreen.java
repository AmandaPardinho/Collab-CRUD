package screen;

import javax.swing.*;
import java.awt.*;

public class GlueScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Glue
    JLabel glue = new JLabel("Glue");
    String[] brandGlue1 = {"", "Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    JComboBox brandGlue2 = new JComboBox(brandGlue1);
    JComboBox colorGlue1 = new JComboBox(colorArray);
    JTextField glueQuantity = new JTextField(null, 8);
    JTextField glueUnitPrice= new JTextField(null, 8);
    JTextField glueTotalAmount= new JTextField(null, 8);
    public GlueScreen(){
        //Glue
        glue.setFont(new Font("Arial", Font.PLAIN, 16));
        glue.setForeground(new Color(0x000000));
        panel.add(glue);
        glue.setAlignmentX(100);
        glue.setAlignmentY(220);
        glue.setPreferredSize(new Dimension(100, 50));
        glue.setBounds(100, 150, 100, 50);
        panel.add(brandGlue2);
        brandGlue2.setAlignmentX(200);
        brandGlue2.setAlignmentY(220);
        brandGlue2.setPreferredSize(new Dimension(100, 50));
        brandGlue2.setBounds(200, 150, 100, 50);
        panel.add(colorGlue1);
        colorGlue1.setAlignmentX(300);
        colorGlue1.setAlignmentY(220);
        colorGlue1.setPreferredSize(new Dimension(100, 50));
        colorGlue1.setBounds(300, 150, 100, 50);
        panel.add(glueQuantity);
        glueQuantity.setAlignmentX(400);
        glueQuantity.setAlignmentY(220);
        glueQuantity.setPreferredSize(new Dimension(100, 50));
        glueQuantity.setBounds(400, 150, 100, 50);
        panel.add(glueUnitPrice);
        glueUnitPrice.setAlignmentX(500);
        glueUnitPrice.setAlignmentY(220);
        glueUnitPrice.setPreferredSize(new Dimension(100, 50));
        glueUnitPrice.setBounds(500, 150, 100, 50);
        panel.add(glueTotalAmount);
        glueTotalAmount.setAlignmentX(600);
        glueTotalAmount.setAlignmentY(220);
        glueTotalAmount.setPreferredSize(new Dimension(100, 50));
        glueTotalAmount.setBounds(600, 150, 100, 50);
    }
    public static void main(String[] args) {

    }
}
