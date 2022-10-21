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
    JComboBox brandNotebook2 = new JComboBox(brandNotebook1);

    //Paper
    JLabel paper = new JLabel("Paper");
    String[] brandPaper1 = {"Canson", "Chamex", "Filipaper", "HP", "Jandaia", "Report"};
    JComboBox brandPaper2 = new JComboBox(brandPaper1);

    //Pen
    JLabel pen = new JLabel("Pen");
    String[] brandPen1 = {"Bic", "Cis", "Faber-Castell", "Pilot", "Stabilo", "Tombow"};
    JComboBox brandPen2 = new JComboBox(brandPen1);

    //Pencil
    JLabel pencil = new JLabel("Pencil");
    String[] brandPencil1 = {"Bic", "Faber-Castell", "Lyra", "Maped", "Molin", "Staedtler"};
    JComboBox brandPencil2 = new JComboBox(brandPencil1);

    //Scissors
    JLabel scissors = new JLabel("Scissor");
    String[] brandScissors1 = {"BRW", "Cis", "Maped", "Mundial", "Tilibra", "Tramontina"};
    JComboBox brandScissors2 = new JComboBox(brandScissors1);

    //Sharpener
    JLabel sharpener = new JLabel("Sharpener");
    String[] brandSharpener1 = {"Cis", "Faber-Castell", "Lenora", "Maped", "Stabilo", "Tilibra"};
    JComboBox brandSharpener2 = new JComboBox(brandSharpener1);

    public ScreenOne(){

        //Layout
        setLayout(new FlowLayout());
        setLayout(new GridLayout(5, 7));
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
        getContentPane().add();

        //Notebook
        getContentPane().add(notebook);
        getContentPane().add(brandNotebook2);
        getContentPane().add();

        //Paper
        getContentPane().add(paper);
        getContentPane().add(brandPaper2);
        getContentPane().add();

        //Pen
        getContentPane().add(pen);
        getContentPane().add(brandPen2);
        getContentPane().add();

        //Pencil
        getContentPane().add(pencil);
        getContentPane().add(brandPencil2);
        getContentPane().add();

        //Scissors
        getContentPane().add(scissors);
        getContentPane().add(brandScissors2);
        getContentPane().add();

        //Sharpener
        getContentPane().add(sharpener);
        getContentPane().add(brandSharpener2);
        getContentPane().add();

        //Buttons
        getContentPane().add(save);
        getContentPane().add(delete);



    }

    public static void main(String[] args) {

        ScreenOne screen = new ScreenOne();
    }
}
