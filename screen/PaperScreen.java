package screen;

import javax.swing.*;
import java.awt.*;

public class PaperScreen extends JPanel{

    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Paper
    private JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"", "Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    private JComboBox brandPaper2 = new JComboBox(brandPaper1);
    private JComboBox colorPaper1 = new JComboBox(colorArray);
    private JTextField paperQuantity = new JTextField(null, 8);
    private JTextField paperUnitPrice = new JTextField(null, 8);
    private JTextField paperTotalAmount = new JTextField(null, 8);

    public PaperScreen(){
        setLayout(new FlowLayout());

        add(paper);
        paper.setFont(new Font("Arial", Font.PLAIN, 16));
        paper.setForeground(new Color(0x000000));
        paper.setPreferredSize(new Dimension(100, 50));
        //paper.setBounds(100, 250, 100, 50);

        add(brandPaper2);
        brandPaper2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandPaper2.setForeground(new Color(0x000000));
        brandPaper2.setPreferredSize(new Dimension(100, 50));
        //brandPaper2.setBounds(200, 250, 100, 50);

        add(colorPaper1);
        colorPaper1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorPaper1.setForeground(new Color(0x000000));
        colorPaper1.setPreferredSize(new Dimension(100, 50));
        //colorPaper1.setBounds(300, 250, 100, 50);

        add(paperQuantity);
        paperQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        paperQuantity.setForeground(new Color(0x000000));
        paperQuantity.setPreferredSize(new Dimension(100, 50));
        //paperQuantity.setBounds(400, 250, 100, 50);

        add(paperUnitPrice);
        paperUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        paperUnitPrice.setForeground(new Color(0x000000));
        paperUnitPrice.setPreferredSize(new Dimension(100, 50));
        //paperUnitPrice.setBounds(500, 250, 100, 50);

        add(paperTotalAmount);
        paperTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        paperTotalAmount.setForeground(new Color(0x000000));
        paperTotalAmount.setPreferredSize(new Dimension(100, 50));
        //paperTotalAmount.setBounds(600, 250, 100, 50);
    }

    public JLabel getPaper() {
        return paper;
    }

    public JComboBox getBrandPaper2() {
        return brandPaper2;
    }

    public JComboBox getColorPaper1() {
        return colorPaper1;
    }

    public JTextField getPaperQuantity() {
        return paperQuantity;
    }

    public JTextField getPaperUnitPrice() {
        return paperUnitPrice;
    }

    public JTextField getPaperTotalAmount() {
        return paperTotalAmount;
    }

    public static void main(String[] args) {

    }
}
