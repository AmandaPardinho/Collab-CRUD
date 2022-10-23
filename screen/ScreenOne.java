package screen;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class ScreenOne extends JFrame {
    //Buttons
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    //Frame
    JFrame frame = new JFrame("Stock");

    //Generic Array
    String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    //Generic Labels
    JLabel product = new JLabel("Product");
    JLabel brand = new JLabel("Brand");
    JLabel color = new JLabel("Color");
    JLabel quantity = new JLabel("Quantity");
    JLabel unitPrice = new JLabel("Unit Price");
    JLabel totalAmount= new JLabel("Total Amount");

    //Panel
    JPanel panel = new JPanel();

    //Eraser
    JLabel eraser = new JLabel("Eraser");
    String[] brandEraser1 = {"","Cis", "Faber-Castell", "Mercur", "Pentel", "Stabilo", "Staedtler"};
    JComboBox brandEraser2 = new JComboBox(brandEraser1);
    JComboBox colorEraser1 = new JComboBox(colorArray);
    JTextField eraserQuantity = new JTextField(null, 1);
    JTextField eraserUnitPrice = new JTextField(null, 1);
    JTextField eraserTotalAmount = new JTextField(null, 1);

    //Glue
    JLabel glue = new JLabel("Glue");
    String[] brandGlue1 = {"", "Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    JComboBox brandGlue2 = new JComboBox(brandGlue1);
    JComboBox colorGlue1 = new JComboBox(colorArray);
    JTextField glueQuantity = new JTextField(null, 1);
    JTextField glueUnitPrice= new JTextField(null, 1);
    JTextField glueTotalAmount= new JTextField(null, 1);

    //Notebook
    JLabel notebook = new JLabel("Notebook");
    String[] brandNotebook1 = {"", "Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    JComboBox colorNotebook1 = new JComboBox(colorArray);
    JTextField notebookQuantity = new JTextField(null, 1);
    JTextField notebookUnitPrice = new JTextField(null, 1);
    JTextField notebookTotalAmount = new JTextField(null, 1);

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"", "Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);
    JComboBox colorPaper1 = new JComboBox(colorArray);
    JTextField paperQuantity = new JTextField(null, 1);
    JTextField paperUnitPrice = new JTextField(null, 1);
    JTextField paperTotalAmount = new JTextField(null, 1);

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"", "Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);
    JComboBox colorPen1 = new JComboBox(colorArray);
    JTextField penQuantity = new JTextField(null, 1);
    JTextField penUnitPrice = new JTextField(null, 1);
    JTextField penTotalAmount = new JTextField(null, 1);

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"", "Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);
    JComboBox colorPencil1 = new JComboBox(colorArray);
    JTextField pencilQuantity = new JTextField(null, 1);
    JTextField pencilUnitPrice = new JTextField(null, 1);
    JTextField pencilTotalAmount = new JTextField(null, 1);

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"", "BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);
    JComboBox colorScissors1 = new JComboBox(colorArray);
    JTextField scissorsQuantity = new JTextField(null, 1);
    JTextField scissorsUnitPrice = new JTextField(null, 1);
    JTextField scissorsTotalAmount = new JTextField(null, 1);

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"", "Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    JComboBox colorSharpener1 = new JComboBox(colorArray);
    JTextField sharpenerQuantity = new JTextField(null, 1);
    JTextField sharpenerUnitPrice = new JTextField(null, 1);
    JTextField sharpenerTotalAmount = new JTextField(null, 1);

    public ScreenOne() {

        //Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);

        //Layout
        panel.setSize(800, 600);
        //panel.setLayout(new FlowLayout());
        panel.setBackground(Color.cyan);


        //Generic Labels
        panel.add(product);
        product.setPreferredSize(new Dimension(100, 50));
        product.setFont(new Font("Arial", Font.BOLD, 16));
        product.setForeground(new Color(0x000000));
        product.setBounds(100, 20, 100, 50);
        panel.add(brand);
        brand.setPreferredSize(new Dimension(100, 50));
        brand.setFont(new Font("Arial", Font.BOLD, 16));
        brand.setForeground(new Color(0x000000));
        brand.setBounds(200, 20, 100, 50);
        panel.add(color);
        color.setPreferredSize(new Dimension(100, 50));
        color.setFont(new Font("Arial", Font.BOLD, 16));
        color.setForeground(new Color(0x000000));
        color.setBounds(300, 20, 100, 50);
        panel.add(quantity);
        quantity.setPreferredSize(new Dimension(100, 50));
        quantity.setFont(new Font("Arial", Font.BOLD, 16));
        quantity.setForeground(new Color(0x000000));
        quantity.setBounds(400, 20, 100, 50);
        panel.add(unitPrice);
        unitPrice.setPreferredSize(new Dimension(100, 50));
        unitPrice.setFont(new Font("Arial", Font.BOLD, 16));
        unitPrice.setForeground(new Color(0x000000));
        unitPrice.setBounds(500, 20, 100, 50);
        panel.add(totalAmount);
        totalAmount.setPreferredSize(new Dimension(100, 50));
        totalAmount.setFont(new Font("Arial", Font.BOLD, 16));
        totalAmount.setForeground(new Color(0x000000));
        totalAmount.setBounds(600, 20, 100, 50);

        //Eraser
        eraser.setFont(new Font("Arial", Font.PLAIN, 16));
        eraser.setForeground(new Color(0x000000));
        panel.add(eraser);
        eraser.setPreferredSize(new Dimension(100, 50));
        eraser.setBounds(100, 100, 100, 50);
        panel.add(brandEraser2);
        brandEraser2.setPreferredSize(new Dimension(100, 50));
        brandEraser2.setBounds(200, 100, 100, 50);
        panel.add(colorEraser1);
        colorEraser1.setPreferredSize(new Dimension(100, 50));
        colorEraser1.setBounds(300, 100, 100, 50);
        panel.add(eraserQuantity);
        eraserQuantity.setPreferredSize(new Dimension(100, 50));
        eraserQuantity.setBounds(400, 100, 100, 50);
        panel.add(eraserUnitPrice);
        eraserUnitPrice.setPreferredSize(new Dimension(100, 50));
        eraserUnitPrice.setBounds(500, 100, 100, 50);
        panel.add(eraserTotalAmount);
        eraserTotalAmount.setPreferredSize(new Dimension(100, 50));
        eraserTotalAmount.setBounds(600, 100, 100, 50);

        //Glue
        glue.setFont(new Font("Arial", Font.PLAIN, 16));
        glue.setForeground(new Color(0x000000));
        panel.add(glue);
        glue.setPreferredSize(new Dimension(100, 50));
        glue.setBounds(100, 150, 100, 50);
        panel.add(brandGlue2);
        brandGlue2.setPreferredSize(new Dimension(100, 50));
        brandGlue2.setBounds(200, 150, 100, 50);
        panel.add(colorGlue1);
        colorGlue1.setPreferredSize(new Dimension(100, 50));
        colorGlue1.setBounds(300, 150, 100, 50);
        panel.add(glueQuantity);
        glueQuantity.setPreferredSize(new Dimension(100, 50));
        glueQuantity.setBounds(400, 150, 100, 50);
        panel.add(glueUnitPrice);
        glueUnitPrice.setPreferredSize(new Dimension(100, 50));
        glueUnitPrice.setBounds(500, 150, 100, 50);
        panel.add(glueTotalAmount);
        glueTotalAmount.setPreferredSize(new Dimension(100, 50));
        glueTotalAmount.setBounds(600, 150, 100, 50);

        //Notebook
        notebook.setFont(new Font("Arial", Font.PLAIN, 16));
        notebook.setForeground(new Color(0x000000));
        panel.add(notebook);
        notebook.setPreferredSize(new Dimension(100, 50));
        notebook.setBounds(100, 200, 100, 50);
        panel.add(brandNotebook2);
        brandNotebook2.setBounds(200, 200, 100, 50);
        panel.add(colorNotebook1);
        colorNotebook1.setBounds(300, 200, 100, 50);
        panel.add(notebookQuantity);
        notebookQuantity.setBounds(400, 200, 100, 50);
        panel.add(notebookUnitPrice);
        notebookUnitPrice.setBounds(500, 200, 100, 50);
        panel.add(notebookTotalAmount);
        notebookTotalAmount.setBounds(600, 200, 100, 50);

        //Paper
        paper.setFont(new Font("Arial", Font.PLAIN, 16));
        paper.setForeground(new Color(0x000000));
        panel.add(paper);
        paper.setPreferredSize(new Dimension(100, 50));
        paper.setBounds(100, 250, 100, 50);
        panel.add(brandPaper2);
        brandPaper2.setPreferredSize(new Dimension(100, 50));
        brandPaper2.setBounds(200, 250, 100, 50);
        panel.add(colorPaper1);
        colorPaper1.setPreferredSize(new Dimension(100, 50));
        colorPaper1.setBounds(300, 250, 100, 50);
        panel.add(paperQuantity);
        paperQuantity.setPreferredSize(new Dimension(100, 50));
        paperQuantity.setBounds(400, 250, 100, 50);
        panel.add(paperUnitPrice);
        paperUnitPrice.setPreferredSize(new Dimension(100, 50));
        paperUnitPrice.setBounds(500, 250, 100, 50);
        panel.add(paperTotalAmount);
        paperTotalAmount.setPreferredSize(new Dimension(100, 50));
        paperTotalAmount.setBounds(600, 250, 100, 50);

        //Pen
        pen.setFont(new Font("Arial", Font.PLAIN, 16));
        pen.setForeground(new Color(0x000000));
        panel.add(pen);
        pen.setPreferredSize(new Dimension(100, 50));
        pen.setBounds(100, 300, 100, 50);
        panel.add(brandPen2);
        brandPen2.setPreferredSize(new Dimension(100, 50));
        brandPen2.setBounds(200, 300, 100, 50);
        panel.add(colorPen1);
        colorPen1.setPreferredSize(new Dimension(100, 50));
        colorPen1.setBounds(300, 300, 100, 50);
        panel.add(penQuantity);
        penQuantity.setPreferredSize(new Dimension(100, 50));
        penQuantity.setBounds(400, 300, 100, 50);
        panel.add(penUnitPrice);
        penUnitPrice.setPreferredSize(new Dimension(100, 50));
        penUnitPrice.setBounds(500, 300, 100, 50);
        panel.add(penTotalAmount);
        penTotalAmount.setPreferredSize(new Dimension(100, 50));
        penTotalAmount.setBounds(600, 300, 100, 50);

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

        //Sharpener
        sharpener.setFont(new Font("Arial", Font.PLAIN, 16));
        sharpener.setForeground(new Color(0x000000));
        panel.add(sharpener);
        sharpener.setPreferredSize(new Dimension(100, 50));
        sharpener.setBounds(100, 450, 100, 50);
        panel.add(brandSharpener2);
        brandSharpener2.setPreferredSize(new Dimension(100, 50));
        brandSharpener2.setBounds(200, 450, 100, 50);
        panel.add(colorSharpener1);
        colorSharpener1.setPreferredSize(new Dimension(100, 50));
        colorSharpener1.setBounds(300, 450, 100, 50);
        panel.add(sharpenerQuantity);
        sharpenerQuantity.setPreferredSize(new Dimension(100, 50));
        sharpenerQuantity.setBounds(400, 450, 100, 50);
        panel.add(sharpenerUnitPrice);
        sharpenerUnitPrice.setPreferredSize(new Dimension(100, 50));
        sharpenerUnitPrice.setBounds(500, 450, 100, 50);
        panel.add(sharpenerTotalAmount);
        sharpenerTotalAmount.setPreferredSize(new Dimension(100, 50));
        sharpenerTotalAmount.setBounds(600, 450, 100, 50);

        //Button Save
        panel.add(save);
        save.setBounds(300, 520, 100, 50);
        save.setPreferredSize(new Dimension(100, 50));
        //save.setLayout(null);
        //save.setVisible(true);
        save.setFont(new Font("Arial", Font.PLAIN, 16));
        save.setForeground(new Color(0x000000));
        save.setBackground(new Color(0xffffff));
        save.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        //save.setHorizontalAlignment(SwingConstants.CENTER);

        //Button Delete
        panel.add(delete);
        //delete.setLayout(null);
        delete.setPreferredSize(new Dimension(100, 50));
        delete.setBounds(500, 520, 100, 50);
        delete.setFont(new Font("Arial", Font.PLAIN, 16));
        delete.setForeground(new Color(0x000000));
        delete.setBackground(new Color(0xffffff));
        delete.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.LIGHT_GRAY, Color.darkGray));
        //delete.setHorizontalAlignment(SwingConstants.CENTER);

    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
