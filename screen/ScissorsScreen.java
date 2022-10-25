package screen;

import javax.swing.*;
import java.awt.*;

public class ScissorsScreen extends JPanel {

    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Scissors
    private JLabel scissors = new JLabel("Scissor");
    private String[] brandScissors1 = {"", "BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    private JComboBox brandScissors2 = new JComboBox(brandScissors1);
    private JComboBox colorScissors1 = new JComboBox(colorArray);
    private JTextField scissorsQuantity = new JTextField(null, 8);
    private JTextField scissorsUnitPrice = new JTextField(null, 8);
    private JTextField scissorsTotalAmount = new JTextField(null, 8);

    public ScissorsScreen(){
        setLayout(new FlowLayout());

        add(scissors);
        scissors.setFont(new Font("Arial", Font.PLAIN, 16));
        scissors.setForeground(new Color(0x000000));
        scissors.setPreferredSize(new Dimension(100, 50));
        //scissors.setBounds(100, 400, 100, 50);

        add(brandScissors2);
        brandScissors2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandScissors2.setForeground(new Color(0x000000));
        brandScissors2.setPreferredSize(new Dimension(100, 50));
        //brandScissors2.setBounds(200, 400, 100, 50);

        add(colorScissors1);
        colorScissors1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorScissors1.setForeground(new Color(0x000000));
        colorScissors1.setPreferredSize(new Dimension(100, 50));
        //colorScissors1.setBounds(300, 400, 100, 50);

        add(scissorsQuantity);
        scissorsQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        scissorsQuantity.setForeground(new Color(0x000000));
        scissorsQuantity.setPreferredSize(new Dimension(100, 50));
        //scissorsQuantity.setBounds(400, 400, 100, 50);

        add(scissorsUnitPrice);
        scissorsUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        scissorsUnitPrice.setForeground(new Color(0x000000));
        scissorsUnitPrice.setPreferredSize(new Dimension(100, 50));
        //scissorsUnitPrice.setBounds(500, 400, 100, 50);

        add(scissorsTotalAmount);
        scissorsTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        scissorsTotalAmount.setForeground(new Color(0x000000));
        scissorsTotalAmount.setPreferredSize(new Dimension(100, 50));
        //scissorsTotalAmount.setBounds(600, 400, 100, 50);
    }

    public JLabel getScissors() {
        return scissors;
    }

    public JComboBox getBrandScissors2() {
        return brandScissors2;
    }

    public JComboBox getColorScissors1() {
        return colorScissors1;
    }

    public JTextField getScissorsQuantity() {
        return scissorsQuantity;
    }

    public JTextField getScissorsUnitPrice() {
        return scissorsUnitPrice;
    }

    public JTextField getScissorsTotalAmount() {
        return scissorsTotalAmount;
    }

    public static void main(String[] args) {

    }
}
