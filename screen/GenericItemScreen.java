package screen;

import javax.swing.*;
import java.awt.*;

public class GenericItemScreen extends JPanel {

    //Frame
    //JFrame frame = new JFrame("Stock");

    //Panel
    //JPanel panelGeneric = new JPanel();

    //Generic Labels
    private JLabel product = new JLabel("Product");
    private JLabel brand = new JLabel("Brand");
    private JLabel color = new JLabel("Color");
    private JLabel quantity = new JLabel("Quantity");
    private JLabel unitPrice = new JLabel("Unit Price");
    private JLabel totalAmount= new JLabel("Total Amount");

    public GenericItemScreen() {
        setLayout(new FlowLayout());

        add(product);
        //product.setBounds(100, 20, 100, 50);
        product.setPreferredSize(new Dimension(100, 100));
        product.setFont(new Font("Arial", Font.BOLD, 16));
        product.setForeground(new Color(0x000000));

        add(brand);
        brand.setPreferredSize(new Dimension(100, 50));
        brand.setFont(new Font("Arial", Font.BOLD, 16));
        brand.setForeground(new Color(0x000000));
        brand.setBounds(200, 20, 100, 50);

        add(color);
        color.setPreferredSize(new Dimension(100, 50));
        color.setFont(new Font("Arial", Font.BOLD, 16));
        color.setForeground(new Color(0x000000));
        color.setBounds(300, 20, 100, 50);

        add(quantity);
        quantity.setPreferredSize(new Dimension(100, 50));
        quantity.setFont(new Font("Arial", Font.BOLD, 16));
        quantity.setForeground(new Color(0x000000));
        quantity.setBounds(400, 20, 100, 50);

        add(unitPrice);
        unitPrice.setPreferredSize(new Dimension(100, 50));
        unitPrice.setFont(new Font("Arial", Font.BOLD, 16));
        unitPrice.setForeground(new Color(0x000000));
        unitPrice.setBounds(500, 20, 100, 50);

        add(totalAmount);
        totalAmount.setPreferredSize(new Dimension(100, 100));
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        totalAmount.setForeground(new Color(0x000000));
        //totalAmount.setBounds(600, 20, 100, 50);

        setVisible(true);
    }

    /*public JPanel getPanelGeneric() {
        return panelGeneric;
    }*/

    public JLabel getProduct() {
        return product;
    }

    public JLabel getBrand() {
        return brand;
    }

    public JLabel getColor() {
        return color;
    }

    public JLabel getQuantity() {
        return quantity;
    }

    public JLabel getUnitPrice() {
        return unitPrice;
    }

    public JLabel getTotalAmount() {
        return totalAmount;
    }

    public static void main(String[] args) {

    }
}
