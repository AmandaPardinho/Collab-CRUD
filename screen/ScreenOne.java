package screen;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class ScreenOne extends JFrame {
    //Buttons
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    //Generic Array
    String[] colorArray = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

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
    JComboBox brandEraser2 = new JComboBox(brandEraser1);
    JComboBox colorEraser1 = new JComboBox(colorArray);
    JTextField eraserQuantity = new JTextField(null, 1);
    JTextField eraserUnitPrice = new JTextField(null, 1);
    JTextField eraserTotalAmount = new JTextField(null, 1);

    //Glue
    JLabel glue = new JLabel("Glue");
    String[] brandGlue1 = {"Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    JComboBox brandGlue2 = new JComboBox(brandGlue1);
    JComboBox colorGlue1 = new JComboBox(colorArray);
    JTextField glueQuantity = new JTextField(null, 1);
    JTextField glueUnitPrice= new JTextField(null, 1);
    JTextField glueTotalAmount= new JTextField(null, 1);

    //Notebook
    JLabel notebook = new JLabel("Notebook");
    String[] brandNotebook1 = {"Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    JComboBox colorNotebook1 = new JComboBox(colorArray);
    JTextField notebookQuantity = new JTextField(null, 1);
    JTextField notebookUnitPrice = new JTextField(null, 1);
    JTextField notebookTotalAmount = new JTextField(null, 1);

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);
    JComboBox colorPaper1 = new JComboBox(colorArray);
    JTextField paperQuantity = new JTextField(null, 1);
    JTextField paperUnitPrice = new JTextField(null, 1);
    JTextField paperTotalAmount = new JTextField(null, 1);

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);
    JComboBox colorPen1 = new JComboBox(colorArray);
    JTextField penQuantity = new JTextField(null, 1);
    JTextField penUnitPrice = new JTextField(null, 1);
    JTextField penTotalAmount = new JTextField(null, 1);

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);
    JComboBox colorPencil1 = new JComboBox(colorArray);
    JTextField pencilQuantity = new JTextField(null, 1);
    JTextField pencilUnitPrice = new JTextField(null, 1);
    JTextField pencilTotalAmount = new JTextField(null, 1);

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);
    JComboBox colorScissors1 = new JComboBox(colorArray);
    JTextField scissorsQuantity = new JTextField(null, 1);
    JTextField scissorsUnitPrice = new JTextField(null, 1);
    JTextField scissorsTotalAmount = new JTextField(null, 1);

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    JComboBox colorSharpener1 = new JComboBox(colorArray);
    JTextField sharpenerQuantity = new JTextField(null, 1);
    JTextField sharpenerUnitPrice = new JTextField(null, 1);
    JTextField sharpenerTotalAmount = new JTextField(null, 1);

    public ScreenOne(){

        //Layout
        setLayout(new FlowLayout());
        setLayout(new GridLayout(10, 8));
        setBackground(new Color(0xffffff));
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
        eraser.setForeground(new Color(0x000000));
        getContentPane().add(eraser);
        getContentPane().add(brandEraser2);
        getContentPane().add(colorEraser1);
        getContentPane().add(eraserQuantity);
        getContentPane().add(eraserUnitPrice);
        getContentPane().add(eraserTotalAmount);

        //Glue
        glue.setFont(new Font("Arial", Font.PLAIN, 16));
        glue.setForeground(new Color(0x000000));
        getContentPane().add(glue);
        getContentPane().add(brandGlue2);
        getContentPane().add(colorGlue1);
        getContentPane().add(glueQuantity);
        getContentPane().add(glueUnitPrice);
        getContentPane().add(glueTotalAmount);

        //Notebook
        notebook.setFont(new Font("Arial", Font.PLAIN, 16));
        notebook.setForeground(new Color(0x000000));
        getContentPane().add(notebook);
        getContentPane().add(brandNotebook2);
        getContentPane().add(colorNotebook1);
        getContentPane().add(notebookQuantity);
        getContentPane().add(notebookUnitPrice);
        getContentPane().add(notebookTotalAmount);

        //Paper
        paper.setFont(new Font("Arial", Font.PLAIN, 16));
        paper.setForeground(new Color(0x000000));
        getContentPane().add(paper);
        getContentPane().add(brandPaper2);
        getContentPane().add(colorPaper1);
        getContentPane().add(paperQuantity);
        getContentPane().add(paperUnitPrice);
        getContentPane().add(paperTotalAmount);

        //Pen
        pen.setFont(new Font("Arial", Font.PLAIN, 16));
        pen.setForeground(new Color(0x000000));
        getContentPane().add(pen);
        getContentPane().add(brandPen2);
        getContentPane().add(colorPen1);
        getContentPane().add(penQuantity);
        getContentPane().add(penUnitPrice);
        getContentPane().add(penTotalAmount);

        //Pencil
        pencil.setFont(new Font("Arial", Font.PLAIN, 16));
        pencil.setForeground(new Color(0x000000));
        getContentPane().add(pencil);
        getContentPane().add(brandPencil2);
        getContentPane().add(colorPencil1);
        getContentPane().add(pencilQuantity);
        getContentPane().add(pencilUnitPrice);
        getContentPane().add(pencilTotalAmount);

        //Scissors
        scissors.setFont(new Font("Arial", Font.PLAIN, 16));
        scissors.setForeground(new Color(0x000000));
        getContentPane().add(scissors);
        getContentPane().add(brandScissors2);
        getContentPane().add(colorScissors1);
        getContentPane().add(scissorsQuantity);
        getContentPane().add(scissorsUnitPrice);
        getContentPane().add(scissorsTotalAmount);

        //Sharpener
        sharpener.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpener.setForeground(new Color(0x000000));
        getContentPane().add(sharpener);
        getContentPane().add(brandSharpener2);
        getContentPane().add(colorSharpener1);
        getContentPane().add(sharpenerQuantity);
        getContentPane().add(sharpenerUnitPrice);
        getContentPane().add(sharpenerTotalAmount);

        //Button Save
        save.setFont(new Font("Arial", Font.PLAIN, 16));
        save.setForeground(new Color(0x000000));
        save.setBackground(new Color(0xffffff));
        save.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        getContentPane().add(save);

        //Button Delete
        delete.setFont(new Font("Arial", Font.PLAIN, 16));
        delete.setForeground(new Color(0x000000));
        delete.setBackground(new Color(0xffffff));
        delete.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        getContentPane().add(delete);

    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
