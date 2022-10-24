package screen;

import javax.swing.*;
import java.awt.*;

public class PenScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"", "Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);
    JComboBox colorPen1 = new JComboBox(colorArray);
    JTextField penQuantity = new JTextField(null, 6);
    JTextField penUnitPrice = new JTextField(null, 6);
    JTextField penTotalAmount = new JTextField(null, 6);
    public PenScreen(){
        //Pen
        pen.setFont(new Font("Arial", Font.PLAIN, 16));
        pen.setForeground(new Color(0x000000));
        panel.add(pen);
        pen.setPreferredSize(new Dimension(100, 50));
        pen.setBounds(100, 300, 100, 50);
        panel.add(brandPen2);
        brandPen2.setPreferredSize(new Dimension(100, 50));
        brandPen2.setBounds(200, 300, 100, 50);
        panel.add(colorPen1);
        colorPen1.setPreferredSize(new Dimension(100, 50));
        colorPen1.setBounds(300, 300, 100, 50);
        panel.add(penQuantity);
        penQuantity.setPreferredSize(new Dimension(100, 50));
        penQuantity.setBounds(400, 300, 100, 50);
        panel.add(penUnitPrice);
        penUnitPrice.setPreferredSize(new Dimension(100, 50));
        penUnitPrice.setBounds(500, 300, 100, 50);
        panel.add(penTotalAmount);
        penTotalAmount.setPreferredSize(new Dimension(100, 50));
        penTotalAmount.setBounds(600, 300, 100, 50);
    }

    public static void main(String[] args) {

    }
}
