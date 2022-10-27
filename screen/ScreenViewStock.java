package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {
//CLASSE PRINCIPAL DA TELA

    //Frame
    private JFrame frame = new JFrame("Stock");

    //Panel
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();

    //Menubar
    private JMenuBar menuBar = new JMenuBar();

    //Generic Array
    //String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    public ScreenOne() throws Exception{

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        //Frame
        frame.add(panel1);
        frame.add(BorderLayout. CENTER, panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setJMenuBar(menuBar);
        frame.setSize(1280, 720);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frame.setVisible(true);

        //Menubar
        menuBar.setPreferredSize(new Dimension(40, 5));
        menuBar.setVisible(true);

        //Layout Panel 1
        panel1.setSize(1280, 720);
        panel1.setLocation(0,0);
        panel1.setBackground(Color.cyan);
        panel1.setLayout(new BorderLayout());
        panel1.setVisible(true);

        //Layout Panel 2
        panel2.setSize(1280, 400);
        panel2.setLayout(new BorderLayout());
        frame.add(BorderLayout. CENTER, panel2);

        //Composição de tela
        MenuScreen menuS = new MenuScreen();
        frame.add(BorderLayout.NORTH, menuS);

        //Panel 1
        GenericItemScreen panelGIS = new GenericItemScreen();
        panel1.add(BorderLayout.NOTH, panelGIS);

        ButtonScreen buttonS = new ButtonScreen();
        panel1.add(BorderLayout.SOURTH, buttonS);

        //Panel 2
        EraserScreen eraserS = new EraserScreen();
        panel2.add(BorderLayout.NORTH, eraserS);

        SharpenerScreen sharpS = new SharpenerScreen();
        panel2.add(BorderLayout.SOUTH, sharpS);

        /*//Panel 3
        GlueScreen glueS = new GlueScreen();
        panel3.add(BorderLayout.NORTH, glueS);

        ScissorsScreen scissorsS = new ScissorsScreen();
        panel3.add(BorderLayout.SOUTH, scissorsS);

        //Panel 4
        NotebookScreen noteS = new NotebookScreen();
        panel4.add(BorderLayout.NORTH, noteS);

        /*PaperScreen paperS = new PaperScreen();
        panel1.add(BorderLayout.CENTER, paperS);

        PenScreen penS = new PenScreen();
        panel1.add(BorderLayout.CENTER, penS);

        PencilScreen pencilS = new PencilScreen();
        panel4.add(BorderLayout.SOUTH, pencilS);*/
    }

    public static void main(String[] args) throws Exception {
        new ScreenOne();
    }
}