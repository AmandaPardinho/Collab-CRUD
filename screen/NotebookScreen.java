package screen;

import javax.swing.*;
import java.awt.*;

public class NotebookScreen {
    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Notebook
    JLabel notebook = new JLabel("Notebook");
    String[] brandNotebook1 = {"", "Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    JComboBox colorNotebook1 = new JComboBox(colorArray);
    JTextField notebookQuantity = new JTextField(null, 8);
    JTextField notebookUnitPrice = new JTextField(null, 8);
    JTextField notebookTotalAmount = new JTextField(null, 8);
    public NotebookScreen(){
        //Notebook
        notebook.setFont(new Font("Arial", Font.PLAIN, 16));
        notebook.setForeground(new Color(0x000000));
        panel.add(notebook);
        notebook.setAlignmentX(100);
        notebook.setAlignmentY(320);
        notebook.setPreferredSize(new Dimension(100, 50));
        notebook.setBounds(100, 200, 100, 50);
        panel.add(brandNotebook2);
        brandNotebook2.setAlignmentX(200);
        brandNotebook2.setAlignmentY(320);
        brandNotebook2.setPreferredSize(new Dimension(100, 50));
        brandNotebook2.setBounds(200, 200, 100, 50);
        panel.add(colorNotebook1);
        colorNotebook1.setAlignmentX(300);
        colorNotebook1.setAlignmentY(320);
        colorNotebook1.setPreferredSize(new Dimension(100, 50));
        colorNotebook1.setBounds(300, 200, 100, 50);
        panel.add(notebookQuantity);
        notebookQuantity.setAlignmentX(400);
        notebookQuantity.setAlignmentY(320);
        notebookQuantity.setPreferredSize(new Dimension(100, 50));
        notebookQuantity.setBounds(400, 200, 100, 50);
        panel.add(notebookUnitPrice);
        notebookUnitPrice.setAlignmentX(500);
        notebookUnitPrice.setAlignmentY(320);
        notebookUnitPrice.setPreferredSize(new Dimension(100, 50));
        notebookUnitPrice.setBounds(500, 200, 100, 50);
        panel.add(notebookTotalAmount);
        notebookTotalAmount.setAlignmentX(600);
        notebookTotalAmount.setAlignmentY(320);
        notebookTotalAmount.setPreferredSize(new Dimension(100, 50));
        notebookTotalAmount.setBounds(600, 200, 100, 50);
    }

    public static void main(String[] args) {

    }
}
