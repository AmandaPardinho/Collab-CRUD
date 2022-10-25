package screen;

import javax.swing.*;
import java.awt.*;

public class NotebookScreen extends JPanel {
    //Generic Array
    private String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Notebook
    private JLabel notebook = new JLabel("Notebook");
    private String[] brandNotebook1 = {"", "Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    private JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    private JComboBox colorNotebook1 = new JComboBox(colorArray);
    private JTextField notebookQuantity = new JTextField(null, 8);
    private JTextField notebookUnitPrice = new JTextField(null, 8);
    private JTextField notebookTotalAmount = new JTextField(null, 8);

    public NotebookScreen(){

        setLayout(new FlowLayout());

        add(notebook);
        notebook.setFont(new Font("Arial", Font.PLAIN, 16));
        notebook.setForeground(new Color(0x000000));
        notebook.setPreferredSize(new Dimension(100, 50));
        //notebook.setBounds(100, 200, 100, 50);

        add(brandNotebook2);
        brandNotebook2.setFont(new Font("Arial", Font.PLAIN, 16));
        brandNotebook2.setForeground(new Color(0x000000));
        brandNotebook2.setPreferredSize(new Dimension(100, 50));
        //brandNotebook2.setBounds(200, 200, 100, 50);

        add(colorNotebook1);
        colorNotebook1.setFont(new Font("Arial", Font.PLAIN, 16));
        colorNotebook1.setForeground(new Color(0x000000));
        colorNotebook1.setPreferredSize(new Dimension(100, 50));
        //colorNotebook1.setBounds(300, 200, 100, 50);

        add(notebookQuantity);
        notebookQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        notebookQuantity.setForeground(new Color(0x000000));
        notebookQuantity.setPreferredSize(new Dimension(100, 50));
        //notebookQuantity.setBounds(400, 200, 100, 50);

        add(notebookUnitPrice);
        notebookUnitPrice.setFont(new Font("Arial", Font.PLAIN, 16));
        notebookUnitPrice.setForeground(new Color(0x000000));
        notebookUnitPrice.setPreferredSize(new Dimension(100, 50));
        //notebookUnitPrice.setBounds(500, 200, 100, 50);

        add(notebookTotalAmount);
        notebookTotalAmount.setFont(new Font("Arial", Font.PLAIN, 16));
        notebookTotalAmount.setForeground(new Color(0x000000));
        notebookTotalAmount.setPreferredSize(new Dimension(100, 50));
        //notebookTotalAmount.setBounds(600, 200, 100, 50);
    }

    public JLabel getNotebook() {
        return notebook;
    }

    public JComboBox getBrandNotebook2() {
        return brandNotebook2;
    }

    public JComboBox getColorNotebook1() {
        return colorNotebook1;
    }

    public JTextField getNotebookQuantity() {
        return notebookQuantity;
    }

    public JTextField getNotebookUnitPrice() {
        return notebookUnitPrice;
    }

    public JTextField getNotebookTotalAmount() {
        return notebookTotalAmount;
    }

    public static void main(String[] args) {

    }
}
