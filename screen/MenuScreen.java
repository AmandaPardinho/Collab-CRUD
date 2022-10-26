package screen;

import javax.swing.*;

public class MenuScreen extends JMenuBar {

    //Menu Items
    private JMenu file = new JMenu("File");   //save
    private JMenu edit = new JMenu("Edit");   //edit stock
    private JMenu view = new JMenu("View");   //view all stock
    private JMenu share = new JMenu("Share"); //adm reports
    private JMenu help = new JMenu("Help");

    //Menu Sub-items File
    private JMenuItem newFile = new JMenuItem("New");
    private JMenuItem openFile = new JMenuItem("Open");
    private JMenuItem saveFile = new JMenuItem("Save All");
    private JMenuItem printFile = new JMenuItem("Print");
    private JMenuItem exportFile = new JMenuItem("Export");
    private JMenuItem exitFile = new JMenuItem("Exit");

    //Menu Sub-items Edit
    private JMenuItem cutEdit = new JMenuItem("Cut");
    private JMenuItem copyEdit = new JMenuItem("Copy");
    private JMenuItem pasteEdit = new JMenuItem("Paste");
    private JMenuItem findEdit = new JMenuItem("find");

   /* //Menu Sub-items View
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();

    //Menu Sub-items Share
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();

    //Menu Sub-items Help
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem openFile = new JMenuItem();*/


    public MenuScreen(){

       add(file);
       add(edit);
       add(view);
       add(share);
       add(help);

    }
    public JMenu getFile() {
        return file;
    }

    public JMenu getEdit() {
        return edit;
    }

    public JMenu getView() {
        return view;
    }

    public JMenu getShare() {
        return share;
    }

    public JMenu getHelp() {
        return help;
    }

    public static void main(String[] args) {

    }
}
