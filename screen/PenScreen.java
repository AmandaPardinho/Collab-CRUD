package screen;

import javax.swing.*;
import java.awt.*;

public class PenScreen extends JPanel{

    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Pen
    private JLabel pen = new JLabel("Pen");
    private String[] brandPen1 = {"", "Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    private JComboBox brandPen2 = new JComboBox(brandPen1);
    private JComboBox colorPen1 = new JComboBox(colorArray);
    private JTextField penQuantity = new JTextField(null, 6);
    private JTextField penUnitPrice = new JTextField(null, 6);
    private JTextField penTotalAmount = new JTextField(null, 6);
    public PenScreen(){
        setLayout(new FlowLayout());

        add(pen);
        pen.setFont(new Font("Arial", Font.PLAIN, 16));
        pen.setForeground(new Color(0x000000));
        pen.setPreferredSize(new Dimension(100, 50));
        //pen.setBounds(100, 300, 100, 50);

        add(brandPen2);
        brandPen2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandPen2.setForeground(new Color(0x000000));
        brandPen2.setPreferredSize(new Dimension(100, 50));
        //brandPen2.setBounds(200, 300, 100, 50);

        add(colorPen1);
        colorPen1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorPen1.setForeground(new Color(0x000000));
        colorPen1.setPreferredSize(new Dimension(100, 50));
        //colorPen1.setBounds(300, 300, 100, 50);

        add(penQuantity);
        penQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        penQuantity.setForeground(new Color(0x000000));
        penQuantity.setPreferredSize(new Dimension(100, 50));
        //penQuantity.setBounds(400, 300, 100, 50);

        add(penUnitPrice);
        penUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        penUnitPrice.setForeground(new Color(0x000000));
        penUnitPrice.setPreferredSize(new Dimension(100, 50));
        //penUnitPrice.setBounds(500, 300, 100, 50);

        add(penTotalAmount);
        penTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        penTotalAmount.setForeground(new Color(0x000000));
        penTotalAmount.setPreferredSize(new Dimension(100, 50));
        //penTotalAmount.setBounds(600, 300, 100, 50);
    }

    public JLabel getPen() {
        return pen;
    }

    public JComboBox getBrandPen2() {
        return brandPen2;
    }

    public JComboBox getColorPen1() {
        return colorPen1;
    }

    public JTextField getPenQuantity() {
        return penQuantity;
    }

    public JTextField getPenUnitPrice() {
        return penUnitPrice;
    }

    public JTextField getPenTotalAmount() {
        return penTotalAmount;
    }

    public static void main(String[] args) {

    }
}
