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

        GenericItemScreen panelGIS = new GenericItemScreen();
        panel.add(BorderLayout.NORTH, panelGIS);
    }

    public static void main(String[] args) throws Exception {

        new ScreenOne();
    }
}
