package screen;

import javax.swing.*;
import java.awt.*;

public class ScreenOne extends JFrame {
//CLASSE PRINCIPAL DA TELA

    //Frame
    JFrame frame = new JFrame("Stock");

    //Panel
    JPanel panel = new JPanel();

    //Generic Array
    //String[] colorArray = {"", "None", "Black", "Blue", "Green", "Pink", "Purple", "Red", "White", "Yellow"};

    public ScreenOne() throws Exception{

        //Frame
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //programa termina ao fechar a janela
        frame.setVisible(true);

        //Layout
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        panel.setBackground(Color.cyan);
        panel.setLayout(new BorderLayout());
        panel.setVisible(true);

        //MenuScreen menuS = new MenuScreen();
        //panel.add(BorderLayout.NORTH, menuS);

        GenericItemScreen panelGIS = new GenericItemScreen();
        panel.add(BorderLayout.NORTH, panelGIS);

        EraserScreen eraserS = new EraserScreen();
        panel.add(BorderLayout.CENTER, eraserS);

        GlueScreen glueS = new GlueScreen();
        panel.add(BorderLayout.CENTER, glueS);

        NotebookScreen noteS = new NotebookScreen();
        panel.add(BorderLayout.CENTER, noteS);

        PaperScreen paperS = new PaperScreen();
        panel.add(BorderLayout.CENTER, paperS);

        PenScreen penS = new PenScreen();
        panel.add(BorderLayout.CENTER, penS);

        PencilScreen pencilS = new PencilScreen();
        panel.add(BorderLayout.CENTER, pencilS);

        ScissorsScreen scissorsS = new ScissorsScreen();
        panel.add(BorderLayout.CENTER, scissorsS);

        SharpenerScreen sharpS = new SharpenerScreen();
        panel.add(BorderLayout.CENTER, sharpS);
    }

    public static void main(String[] args) throws Exception {

        new ScreenOne();
    }
}
