package screen;

import javax.swing.*;
import java.awt.*;

public class EraserScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Eraser
    JLabel eraser = new JLabel("Eraser");
    String[] brandEraser1 = {"","Cis", "Faber-Castell", "Mercur", "Pentel", "Stabilo", "Staedtler"};
    JComboBox brandEraser2 = new JComboBox(brandEraser1);
    JComboBox colorEraser1 = new JComboBox(colorArray);
    JTextField eraserQuantity = new JTextField(null, 8);
    JTextField eraserUnitPrice = new JTextField(null, 8);
    JTextField eraserTotalAmount = new JTextField(null, 8);

    public EraserScreen(){
        //Eraser
        eraser.setFont(new Font("Arial", Font.PLAIN, 16));
        eraser.setForeground(new Color(0x000000));
        panel.add(eraser);
        eraser.setAlignmentX(100);
        eraser.setAlignmentY(120);
        eraser.setPreferredSize(new Dimension(100, 50));
        eraser.setBounds(100, 100, 100, 50);
        panel.add(brandEraser2);
        brandEraser2.setAlignmentX(200);
        brandEraser2.setAlignmentY(120);
        brandEraser2.setPreferredSize(new Dimension(100, 50));
        brandEraser2.setBounds(200, 100, 100, 50);
        panel.add(colorEraser1);
        colorEraser1.setAlignmentX(300);
        colorEraser1.setAlignmentY(120);
        colorEraser1.setPreferredSize(new Dimension(100, 50));
        colorEraser1.setBounds(300, 100, 100, 50);
        panel.add(eraserQuantity);
        eraserQuantity.setAlignmentX(400);
        eraserQuantity.setAlignmentY(120);
        eraserQuantity.setPreferredSize(new Dimension(100, 50));
        eraserQuantity.setBounds(400, 100, 100, 50);
        panel.add(eraserUnitPrice);
        eraserUnitPrice.setAlignmentX(500);
        eraserUnitPrice.setAlignmentY(120);
        eraserUnitPrice.setPreferredSize(new Dimension(100, 50));
        eraserUnitPrice.setBounds(500, 100, 100, 50);
        panel.add(eraserTotalAmount);
        eraserTotalAmount.setAlignmentX(600);
        eraserTotalAmount.setAlignmentY(120);
        eraserTotalAmount.setPreferredSize(new Dimension(100, 50));
        eraserTotalAmount.setBounds(600, 100, 100, 50);

    }
    public static void main(String[] args) {
        new EraserScreen();
    }
}
