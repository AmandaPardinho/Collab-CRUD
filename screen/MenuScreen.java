package screen;

import event.ExitFileAction;

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
    private JMenuItem exitFile = new JMenuItem(new ExitFileAction());

    //Menu Sub-items Edit
    private JMenuItem cutEdit = new JMenuItem("Cut");
    private JMenuItem copyEdit = new JMenuItem("Copy");
    private JMenuItem pasteEdit = new JMenuItem("Paste");
    private JMenuItem findEdit = new JMenuItem("Find");

    //Menu Sub-items View
    private JMenuItem detailsView = new JMenuItem("Details");
    private JMenuItem stockNowView = new JMenuItem("Stock Now");
    private JMenuItem listView = new JMenuItem("List");
    private JMenuItem iconView = new JMenuItem("Icon");
    private JMenuItem appearanceView = new JMenuItem("App Appearance");

    //Menu Sub-items Share
    private JMenuItem emailShare = new JMenuItem("E-mail");
    private JMenuItem admShare = new JMenuItem("Internal Sharing");

    //Menu Sub-items Help
    private JMenuItem firstStepHelp = new JMenuItem("Getting Started");
    private JMenuItem updateHelp = new JMenuItem("Update Software");
    private JMenuItem findActionHelp = new JMenuItem("Find Action");
    private JMenuItem supportHelp = new JMenuItem("Contact Support");
    private JMenuItem helpHelp = new JMenuItem("Help");
    private JMenuItem aboutHelp = new JMenuItem("About");



    public MenuScreen(){

        //Tabs
        add(file);
        file.setMnemonic('F');
        add(edit);
        edit.setMnemonic('E');
        add(view);
        view.setMnemonic('V');
        add(share);
        share.setMnemonic('S');
        add(help);
        help.setMnemonic('H');

        //File sub-items
        file.add(newFile);
        newFile.setMnemonic('N');
        file.add(openFile);
        openFile.setMnemonic('O');
        file.add(saveFile);
        saveFile.setMnemonic('S');
        file.add(printFile);
        printFile.setMnemonic('P');
        file.add(exportFile);
        exportFile.setMnemonic('X');
        file.add(exitFile);
        exitFile.setText("Exit");
        exitFile.setMnemonic('e');

        //Edit sub-items
        edit.add(cutEdit);
        cutEdit.setMnemonic('C');
        edit.add(copyEdit);
        copyEdit.setMnemonic('Y');
        edit.add(pasteEdit);
        pasteEdit.setMnemonic('T');
        edit.add(findEdit);
        findEdit.setMnemonic('f');

        //View sub-items
        view.add(detailsView);
        detailsView.setMnemonic('D');
        view.add(stockNowView);
        stockNowView.setMnemonic('W');
        view.add(listView);
        listView.setMnemonic('L');
        view.add(iconView);
        iconView.setMnemonic('I');
        view.add(appearanceView);
        appearanceView.setMnemonic('A');

        //Share sub-items
        share.add(emailShare);
        emailShare.setMnemonic('M');
        share.add(admShare);
        admShare.setMnemonic('a');

        //Help sub-items
        help.add(firstStepHelp);
        firstStepHelp.setMnemonic('R');
        help.add(updateHelp);
        updateHelp.setMnemonic('U');
        help.add(findActionHelp);
        findActionHelp.setMnemonic('n');
        help.add(supportHelp);
        supportHelp.setMnemonic('s');
        help.add(helpHelp);
        helpHelp.setMnemonic('H');
        help.add(aboutHelp);
        aboutHelp.setMnemonic('B');

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
