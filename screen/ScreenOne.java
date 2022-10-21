package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {
    //Buttons
    JButton delete = new JButton("Delete");
    JButton save = new JButton("Save");

    //Eraser
    JLabel eraser = new JLabel("Eraser");
    String[] brandEraser1 = {"Cis", "Faber-Castell", "Mercur", "Pentel", "Stabilo", "Staedtler"};
    String[] colorEraser1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandEraser2 = new JComboBox(brandEraser1);
    JComboBox colorEraser2 = new JComboBox(colorEraser1);

    //Glue
    JLabel glue = new JLabel("Glue");
    String[] brandGlue1 = {"Acrilex", "Apricola", "Bic", "Faber-Castell", "Pritt", "Tenaz"};
    String[] colorGlue1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandGlue2 = new JComboBox(brandGlue1);
    JComboBox colorGlue2 = new JComboBox(colorGlue1);

    //Notebook
    JLabel notebook = new JLabel("Notebook");
    String[] brandNotebook1 = {"Cícero", "Faber-Castell", "Foroni", "Jandaia", "Spiral", "Tilibra" };
    String[] colorNotebook1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);
    JComboBox colorNotebook2 = new JComboBox(colorNotebook1);

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    String[] colorPaper1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);
    JComboBox colorPaper2 = new JComboBox(colorPaper1);

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    String[] colorPen1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);
    JComboBox colorPen2 = new JComboBox(colorPen1);

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    String[] colorPencil1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);
    JComboBox colorPencil2 = new JComboBox(colorPencil1);

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    String[] colorScissors1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);
    JComboBox colorScissors2 = new JComboBox(colorScissors1);

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    String[] colorSharpener1 = {"None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);
    JComboBox colorSharpener2 = new JComboBox(colorSharpener1);

    public ScreenOne(){

        //Layout
        setLayout(new FlowLayout());
        setLayout(new GridLayout(12, 15));
        pack();
        setVisible(true);
        //setSize(600,800);
        //label.setFont(new Font("Arial", Font.PLAIN, 16));
        //label.setForeground(new Color(0xbb5d7f));

        //Eraser
        getContentPane().add(eraser);
        getContentPane().add(brandEraser2);
        getContentPane().add(colorEraser2);

        //Glue
        getContentPane().add(glue);
        getContentPane().add(brandGlue2);
        getContentPane().add(colorGlue2);


        //Notebook
        getContentPane().add(notebook);
        getContentPane().add(brandNotebook2);
        getContentPane().add(colorNotebook2);

        //Paper
        getContentPane().add(paper);
        getContentPane().add(brandPaper2);
        getContentPane().add(colorPaper2);

        //Pen
        getContentPane().add(pen);
        getContentPane().add(brandPen2);
        getContentPane().add(colorPen2);

        //Pencil
        getContentPane().add(pencil);
        getContentPane().add(brandPencil2);
        getContentPane().add(colorPencil2);

        //Scissors
        getContentPane().add(scissors);
        getContentPane().add(brandScissors2);
        getContentPane().add(colorScissors2);

        //Sharpener
        getContentPane().add(sharpener);
        getContentPane().add(brandSharpener2);
        getContentPane().add(colorSharpener2);

        //Buttons
        getContentPane().add(save);
        getContentPane().add(delete);



    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
