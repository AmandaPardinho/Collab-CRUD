package screen;

import javax.swing.*;
import java.awt.*;

public class GenericItemScreen {

    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Labels
    JLabel product = new JLabel("Product");
    JLabel brand = new JLabel("Brand");
    JLabel color = new JLabel("Color");
    JLabel quantity = new JLabel("Quantity");
    JLabel unitPrice = new JLabel("Unit Price");
    JLabel totalAmount= new JLabel("Total Amount");

    public GenericItemScreen(){
        //Generic Labels
        panel.add(product);
        product.setBounds(100, 20, 100, 50);
        //product.setAlignmentX(100);
        //product.setAlignmentY(20);
        product.setPreferredSize(new Dimension(100, 50));
        product.setFont(new Font("Arial", Font.BOLD, 16));
        product.setForeground(new Color(0x000000));
        panel.add(brand);
        //brand.setAlignmentX(200);
        //brand.setAlignmentY(20);
        brand.setPreferredSize(new Dimension(100, 50));
        brand.setFont(new Font("Arial", Font.BOLD, 16));
        brand.setForeground(new Color(0x000000));
        brand.setBounds(200, 20, 100, 50);
        panel.add(color);
        //color.setAlignmentX(300);
        //color.setAlignmentY(20);
        color.setPreferredSize(new Dimension(100, 50));
        color.setFont(new Font("Arial", Font.BOLD, 16));
        color.setForeground(new Color(0x000000));
        color.setBounds(300, 20, 100, 50);
        panel.add(quantity);
        //quantity.setAlignmentX(400);
        //quantity.setAlignmentY(20);
        quantity.setPreferredSize(new Dimension(100, 50));
        quantity.setFont(new Font("Arial", Font.BOLD, 16));
        quantity.setForeground(new Color(0x000000));
        quantity.setBounds(400, 20, 100, 50);
        panel.add(unitPrice);
        //unitPrice.setAlignmentX(500);
        //unitPrice.setAlignmentY(20);
        unitPrice.setPreferredSize(new Dimension(100, 50));
        unitPrice.setFont(new Font("Arial", Font.BOLD, 16));
        unitPrice.setForeground(new Color(0x000000));
        unitPrice.setBounds(500, 20, 100, 50);
        panel.add(totalAmount);
        //totalAmount.setAlignmentX(600);
        //totalAmount.setAlignmentY(20);
        totalAmount.setPreferredSize(new Dimension(100, 50));
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        totalAmount.setForeground(new Color(0x000000));
        totalAmount.setBounds(600, 20, 100, 50);
    }

    public static void main(String[] args) {

    }
}
