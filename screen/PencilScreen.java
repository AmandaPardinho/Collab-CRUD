package screen;

import javax.swing.*;
import java.awt.*;

public class PencilScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"", "Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);
    JComboBox colorPencil1 = new JComboBox(colorArray);
    JTextField pencilQuantity = new JTextField(null, 8);
    JTextField pencilUnitPrice = new JTextField(null, 8);
    JTextField pencilTotalAmount = new JTextField(null, 8);

    public PencilScreen(){
        //Pencil
        pencil.setFont(new Font("Arial", Font.PLAIN, 16));
        pencil.setForeground(new Color(0x000000));
        panel.add(pencil);
        pencil.setPreferredSize(new Dimension(100, 50));
        pencil.setBounds(100, 350, 100, 50);
        panel.add(brandPencil2);
        brandPencil2.setPreferredSize(new Dimension(100, 50));
        brandPencil2.setBounds(200, 350, 100, 50);
        panel.add(colorPencil1);
        colorPencil1.setPreferredSize(new Dimension(100, 50));
        colorPencil1.setBounds(300, 350, 100, 50);
        panel.add(pencilQuantity);
        pencilQuantity.setPreferredSize(new Dimension(100, 50));
        pencilQuantity.setBounds(400, 350, 100, 50);
        panel.add(pencilUnitPrice);
        pencilUnitPrice.setPreferredSize(new Dimension(100, 50));
        pencilUnitPrice.setBounds(500, 350, 100, 50);
        panel.add(pencilTotalAmount);
        pencilTotalAmount.setPreferredSize(new Dimension(100, 50));
        pencilTotalAmount.setBounds(600, 350, 100, 50);
    }

    public static void main(String[] args) {

    }
}
