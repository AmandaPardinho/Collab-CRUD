package screen;

import javax.swing.*;
import java.awt.*;

public class EraserScreen extends JPanel{
    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Eraser
    private JLabel eraser = new JLabel("Eraser");
    private String[] brandEraser1 = {"","Cis", "Faber-Castell", "Mercur", "Pentel", "Stabilo", "Staedtler"};
    private JComboBox brandEraser2 = new JComboBox(brandEraser1);
    private JComboBox colorEraser1 = new JComboBox(colorArray);
    private JTextField eraserQuantity = new JTextField(null, 8);
    private JTextField eraserUnitPrice = new JTextField(null, 8);
    private JTextField eraserTotalAmount = new JTextField(null, 8);

    public EraserScreen(){
        setLayout(new FlowLayout());

        add(eraser);
        eraser.setFont(new Font("Arial", Font.PLAIN, 16));
        eraser.setForeground(new Color(0x000000));
        eraser.setPreferredSize(new Dimension(100, 50));
        //eraser.setBounds(100, 100, 100, 50);

        add(brandEraser2);
        brandEraser2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandEraser2.setForeground(new Color(0x000000));
        brandEraser2.setPreferredSize(new Dimension(100, 50));
        //brandEraser2.setBounds(200, 100, 100, 50);

        add(colorEraser1);
        colorEraser1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorEraser1.setForeground(new Color(0x000000));
        colorEraser1.setPreferredSize(new Dimension(100, 50));
        //colorEraser1.setBounds(300, 100, 100, 50);

        add(eraserQuantity);
        eraserQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        eraserQuantity.setForeground(new Color(0x000000));
        eraserQuantity.setPreferredSize(new Dimension(100, 50));
        //eraserQuantity.setBounds(400, 100, 100, 50);

        add(eraserUnitPrice);

        eraserUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        eraserUnitPrice.setForeground(new Color(0x000000));
        eraserUnitPrice.setPreferredSize(new Dimension(100, 50));
        //eraserUnitPrice.setBounds(500, 100, 100, 50);

        add(eraserTotalAmount);
        eraserTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        eraserTotalAmount.setForeground(new Color(0x000000));
        eraserTotalAmount.setPreferredSize(new Dimension(100, 50));
        //eraserTotalAmount.setBounds(600, 100, 100, 50);
    }

    public JLabel getEraser() {
        return eraser;
    }

    public JComboBox getBrandEraser2() {
        return brandEraser2;
    }

    public JComboBox getColorEraser1() {
        return colorEraser1;
    }

    public JTextField getEraserQuantity() {
        return eraserQuantity;
    }

    public JTextField getEraserUnitPrice() {
        return eraserUnitPrice;
    }

    public JTextField getEraserTotalAmount() {
        return eraserTotalAmount;
    }

    public static void main(String[] args) {

    }
}
