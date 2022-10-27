package removescreen;

import javax.swing.*;
import java.awt.*;

public class QuantityRemove extends JPanel {
    //Label
    private JLabel removeQuantityLabel = new JLabel("Quantity");

    //JTextField
    private JTextField removeQuantity = new JTextField(null, 8);

    public QuantityRemove(){
        setLayout(new FlowLayout());

        //Label
        add(removeQuantityLabel);
        removeQuantityLabel.setBounds(400, 300, 100, 50);
        removeQuantityLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        removeQuantityLabel.setForeground(new Color(0x000000));

        //JTextField
        add(removeQuantity);
        removeQuantity.setBounds(550, 200, 100, 50);
        removeQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        removeQuantity.setForeground(new Color(0x000000));
    }

    public JLabel getRemoveQuantityLabel() {
        return removeQuantityLabel;
    }

    public JTextField getRemoveQuantity() {
        return removeQuantity;
    }

    public static void main(String[] args) {

    }
}
