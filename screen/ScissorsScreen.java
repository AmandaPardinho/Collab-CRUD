package screen;

import javax.swing.*;
import java.awt.*;

public class ScissorsScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"", "BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);
    JComboBox colorScissors1 = new JComboBox(colorArray);
    JTextField scissorsQuantity = new JTextField(null, 8);
    JTextField scissorsUnitPrice = new JTextField(null, 8);
    JTextField scissorsTotalAmount = new JTextField(null, 8);

    public ScissorsScreen(){
        //Scissors
        scissors.setFont(new Font("Arial", Font.PLAIN, 16));
        scissors.setForeground(new Color(0x000000));
        panel.add(scissors);
        scissors.setPreferredSize(new Dimension(100, 50));
        scissors.setBounds(100, 400, 100, 50);
        panel.add(brandScissors2);
        brandScissors2.setPreferredSize(new Dimension(100, 50));
        brandScissors2.setBounds(200, 400, 100, 50);
        panel.add(colorScissors1);
        colorScissors1.setPreferredSize(new Dimension(100, 50));
        colorScissors1.setBounds(300, 400, 100, 50);
        panel.add(scissorsQuantity);
        scissorsQuantity.setPreferredSize(new Dimension(100, 50));
        scissorsQuantity.setBounds(400, 400, 100, 50);
        panel.add(scissorsUnitPrice);
        scissorsUnitPrice.setPreferredSize(new Dimension(100, 50));
        scissorsUnitPrice.setBounds(500, 400, 100, 50);
        panel.add(scissorsTotalAmount);
        scissorsTotalAmount.setPreferredSize(new Dimension(100, 50));
        scissorsTotalAmount.setBounds(600, 400, 100, 50);

    }

    public static void main(String[] args) {

    }
}
