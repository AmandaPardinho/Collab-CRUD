package event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ExitFileAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
