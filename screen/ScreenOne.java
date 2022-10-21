package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {
    //Buttons
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    //Generic Labels
    JLabel product = new JLabel("Product");
    JLabel brand = new JLabel("Brand");
    JLabel color = new JLabel("Color");
    JLabel quantity = new JLabel("Quantity");
    JLabel unitPrice = new JLabel("Unit Price");
    JLabel totalAmount= new JLabel("Total Amount");

    //Eraser
    JLabel eraser = new JLabel("Eraser");
    String[] brandEraser1 = {"Cis", "Faber-Castell", "Mercur", "Pentel", "Stabilo", "Staedtler"};
    String[] colorEraser1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandEraser2 = new JComboBox(brandEraser1);
    JComboBox colorEraser2 = new JComboBox(colorEraser1);
    JTextField eraserQuantity = new JTextField(null, 1);
    JTextField eraserUnitPrice = new JTextField(null, 1);
    JTextField eraserTotalAmount = new JTextField(null, 1);

    //Glue
    JLabel glue = new JLabel("Glue");
    String[] brandGlue1 = {"Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    String[] colorGlue1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandGlue2 = new JComboBox(brandGlue1);
    JComboBox colorGlue2 = new JComboBox(colorGlue1);
    JTextField glueQuantity = new JTextField(null, 1);
    JTextField glueUnitPrice= new JTextField(null, 1);
    JTextField glueTotalAmount= new JTextField(null, 1);

    //Notebook
    JLabel notebook = new JLabel("Notebook");
    String[] brandNotebook1 = {"Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    String[] colorNotebook1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    JComboBox colorNotebook2 = new JComboBox(colorNotebook1);
    JTextField notebookQuantity = new JTextField(null, 1);
    JTextField notebookUnitPrice = new JTextField(null, 1);
    JTextField notebookTotalAmount = new JTextField(null, 1);

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    String[] colorPaper1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);
    JComboBox colorPaper2 = new JComboBox(colorPaper1);
    JTextField paperQuantity = new JTextField(null, 1);
    JTextField paperUnitPrice = new JTextField(null, 1);
    JTextField paperTotalAmount = new JTextField(null, 1);

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    String[] colorPen1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);
    JComboBox colorPen2 = new JComboBox(colorPen1);
    JTextField penQuantity = new JTextField(null, 1);
    JTextField penUnitPrice = new JTextField(null, 1);
    JTextField penTotalAmount = new JTextField(null, 1);

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    String[] colorPencil1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);
    JComboBox colorPencil2 = new JComboBox(colorPencil1);
    JTextField pencilQuantity = new JTextField(null, 1);
    JTextField pencilUnitPrice = new JTextField(null, 1);
    JTextField pencilTotalAmount = new JTextField(null, 1);

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    String[] colorScissors1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);
    JComboBox colorScissors2 = new JComboBox(colorScissors1);
    JTextField scissorsQuantity = new JTextField(null, 1);
    JTextField scissorsUnitPrice = new JTextField(null, 1);
    JTextField scissorsTotalAmount = new JTextField(null, 1);

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    String[] colorSharpener1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    JComboBox colorSharpener2 = new JComboBox(colorSharpener1);
    JTextField sharpenerQuantity = new JTextField(null, 1);
    JTextField sharpenerUnitPrice = new JTextField(null, 1);
    JTextField sharpenerTotalAmount = new JTextField(null, 1);

    public ScreenOne(){

        //Layout
        setLayout(new FlowLayout());
        setLayout(new GridLayout(10, 8));
        //pack(setMinimumSize());
        setVisible(true);
        setSize(800,600);

        //Generic Labels
        getContentPane().add(product);
        product.setFont(new Font("Arial", Font.BOLD, 16));
        product.setForeground(new Color(0x000000));
        getContentPane().add(brand);
        brand.setFont(new Font("Arial", Font.BOLD, 16));
        brand.setForeground(new Color(0x000000));
        getContentPane().add(color);
        color.setFont(new Font("Arial", Font.BOLD, 16));
        color.setForeground(new Color(0x000000));
        getContentPane().add(quantity);
        quantity.setFont(new Font("Arial", Font.BOLD, 16));
        quantity.setForeground(new Color(0x000000));
        getContentPane().add(unitPrice);
        unitPrice.setFont(new Font("Arial", Font.BOLD, 16));
        unitPrice.setForeground(new Color(0x000000));
        getContentPane().add(totalAmount);
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        totalAmount.setForeground(new Color(0x000000));

        //Eraser
        eraser.setFont(new Font("Arial", Font.PLAIN, 16));
        eraser.setForeground(new Color(0xbb5d7f));
        getContentPane().add(eraser);
        getContentPane().add(brandEraser2);
        getContentPane().add(colorEraser2);
        getContentPane().add(eraserQuantity);
        getContentPane().add(eraserUnitPrice);
        getContentPane().add(eraserTotalAmount);

        //Glue
        glue.setFont(new Font("Arial", Font.PLAIN, 16));
        glue.setForeground(new Color(0xbb5d7f));
        getContentPane().add(glue);
        getContentPane().add(brandGlue2);
        getContentPane().add(colorGlue2);
        getContentPane().add(glueQuantity);
        getContentPane().add(glueUnitPrice);
        getContentPane().add(glueTotalAmount);

        //Notebook
        notebook.setFont(new Font("Arial", Font.PLAIN, 16));
        notebook.setForeground(new Color(0xbb5d7f));
        getContentPane().add(notebook);
        getContentPane().add(brandNotebook2);
        getContentPane().add(colorNotebook2);
        getContentPane().add(notebookQuantity);
        getContentPane().add(notebookUnitPrice);
        getContentPane().add(notebookTotalAmount);

        //Paper
        paper.setFont(new Font("Arial", Font.PLAIN, 16));
        paper.setForeground(new Color(0xbb5d7f));
        getContentPane().add(paper);
        getContentPane().add(brandPaper2);
        getContentPane().add(colorPaper2);
        getContentPane().add(paperQuantity);
        getContentPane().add(paperUnitPrice);
        getContentPane().add(paperTotalAmount);

        //Pen
        pen.setFont(new Font("Arial", Font.PLAIN, 16));
        pen.setForeground(new Color(0xbb5d7f));
        getContentPane().add(pen);
        getContentPane().add(brandPen2);
        getContentPane().add(colorPen2);
        getContentPane().add(penQuantity);
        getContentPane().add(penUnitPrice);
        getContentPane().add(penTotalAmount);

        //Pencil
        pencil.setFont(new Font("Arial", Font.PLAIN, 16));
        pencil.setForeground(new Color(0xbb5d7f));
        getContentPane().add(pencil);
        getContentPane().add(brandPencil2);
        getContentPane().add(colorPencil2);
        getContentPane().add(pencilQuantity);
        getContentPane().add(pencilUnitPrice);
        getContentPane().add(pencilTotalAmount);

        //Scissors
        scissors.setFont(new Font("Arial", Font.PLAIN, 16));
        scissors.setForeground(new Color(0xbb5d7f));
        getContentPane().add(scissors);
        getContentPane().add(brandScissors2);
        getContentPane().add(colorScissors2);
        getContentPane().add(scissorsQuantity);
        getContentPane().add(scissorsUnitPrice);
        getContentPane().add(scissorsTotalAmount);

        //Sharpener
        sharpener.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpener.setForeground(new Color(0xbb5d7f));
        getContentPane().add(sharpener);
        getContentPane().add(brandSharpener2);
        getContentPane().add(colorSharpener2);
        getContentPane().add(sharpenerQuantity);
        getContentPane().add(sharpenerUnitPrice);
        getContentPane().add(sharpenerTotalAmount);

        //Button Save
        save.setFont(new Font("Arial", Font.PLAIN, 16));
        save.setForeground(new Color(0xbb5d7f));
        getContentPane().add(save);

        //Button Delete
        delete.setFont(new Font("Arial", Font.PLAIN, 16));
        delete.setForeground(new Color(0xbb5d7f));
        getContentPane().add(delete);

    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
