package js11.guiCoba;

import javax.swing.*;

/**
 *
 * @author ardan
 */
public class SimpleFrame extends JFrame{
    JButton abort = new JButton("Abort");
    JButton retry = new JButton("Retry");
    JButton fail = new JButton("Fail");
    
    public SimpleFrame() {
        super("Frame Title");
        setSize(450,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel pane = new JPanel();
        pane.add(abort);
        pane.add(retry);
        pane.add(fail);
        setContentPane(pane);
    }
}