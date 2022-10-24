package screen;

import javax.swing.*;
import java.awt.*;

public class PaperScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"", "Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);
    JComboBox colorPaper1 = new JComboBox(colorArray);
    JTextField paperQuantity = new JTextField(null, 8);
    JTextField paperUnitPrice = new JTextField(null, 8);
    JTextField paperTotalAmount = new JTextField(null, 8);
    public PaperScreen(){
        //Paper
        paper.setFont(new Font("Arial", Font.PLAIN, 16));
        paper.setForeground(new Color(0x000000));
        panel.add(paper);
        //notebook.setAlignmentX(100);
        //notebook.setAlignmentY(420);
        paper.setPreferredSize(new Dimension(100, 50));
        paper.setBounds(100, 250, 100, 50);
        panel.add(brandPaper2);
        brandPaper2.setAlignmentX(200);
        brandPaper2.setAlignmentY(420);
        brandPaper2.setPreferredSize(new Dimension(100, 50));
        brandPaper2.setBounds(200, 250, 100, 50);
        panel.add(colorPaper1);
        colorPaper1.setAlignmentX(300);
        colorPaper1.setAlignmentY(420);
        colorPaper1.setPreferredSize(new Dimension(100, 50));
        colorPaper1.setBounds(300, 250, 100, 50);
        panel.add(paperQuantity);
        paperQuantity.setAlignmentX(400);
        paperQuantity.setAlignmentY(420);
        paperQuantity.setPreferredSize(new Dimension(100, 50));
        paperQuantity.setBounds(400, 250, 100, 50);
        panel.add(paperUnitPrice);
        paperUnitPrice.setAlignmentX(500);
        paperUnitPrice.setAlignmentY(420);
        paperUnitPrice.setPreferredSize(new Dimension(100, 50));
        paperUnitPrice.setBounds(500, 250, 100, 50);
        panel.add(paperTotalAmount);
        paperTotalAmount.setAlignmentX(600);
        paperTotalAmount.setAlignmentY(420);
        paperTotalAmount.setPreferredSize(new Dimension(100, 50));
        paperTotalAmount.setBounds(600, 250, 100, 50);

    }

    public static void main(String[] args) {

    }
}
