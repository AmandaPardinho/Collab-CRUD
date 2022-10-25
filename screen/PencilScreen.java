package screen;

import javax.swing.*;
import java.awt.*;

public class PencilScreen extends JPanel {

    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Pencil
    private JLabel pencil = new JLabel("Pencil");
    private String[] brandPencil1 = {"", "Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    private JComboBox brandPencil2 = new JComboBox(brandPencil1);
    private JComboBox colorPencil1 = new JComboBox(colorArray);
    private JTextField pencilQuantity = new JTextField(null, 8);
    private JTextField pencilUnitPrice = new JTextField(null, 8);
    private JTextField pencilTotalAmount = new JTextField(null, 8);

    public PencilScreen(){
        setLayout(new FlowLayout());

        add(pencil);
        pencil.setFont(new Font("Arial", Font.PLAIN, 16));
        pencil.setForeground(new Color(0x000000));
        pencil.setPreferredSize(new Dimension(100, 50));
        //pencil.setBounds(100, 350, 100, 50);

        add(brandPencil2);
        brandPencil2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandPencil2.setForeground(new Color(0x000000));
        brandPencil2.setPreferredSize(new Dimension(100, 50));
        //brandPencil2.setBounds(200, 350, 100, 50);

        add(colorPencil1);
        colorPencil1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorPencil1.setForeground(new Color(0x000000));
        colorPencil1.setPreferredSize(new Dimension(100, 50));
        //colorPencil1.setBounds(300, 350, 100, 50);

        add(pencilQuantity);
        pencilQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        pencilQuantity.setForeground(new Color(0x000000));
        pencilQuantity.setPreferredSize(new Dimension(100, 50));
        //pencilQuantity.setBounds(400, 350, 100, 50);

        add(pencilUnitPrice);
        pencilUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        pencilUnitPrice.setForeground(new Color(0x000000));
        pencilUnitPrice.setPreferredSize(new Dimension(100, 50));
        //pencilUnitPrice.setBounds(500, 350, 100, 50);

        add(pencilTotalAmount);
        pencilTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        pencilTotalAmount.setForeground(new Color(0x000000));
        pencilTotalAmount.setPreferredSize(new Dimension(100, 50));
        //pencilTotalAmount.setBounds(600, 350, 100, 50);
    }

    public JLabel getPencil() {
        return pencil;
    }

    public JComboBox getBrandPencil2() {
        return brandPencil2;
    }

    public JComboBox getColorPencil1() {
        return colorPencil1;
    }

    public JTextField getPencilQuantity() {
        return pencilQuantity;
    }

    public JTextField getPencilUnitPrice() {
        return pencilUnitPrice;
    }

    public JTextField getPencilTotalAmount() {
        return pencilTotalAmount;
    }

    public static void main(String[] args) {

    }
}
