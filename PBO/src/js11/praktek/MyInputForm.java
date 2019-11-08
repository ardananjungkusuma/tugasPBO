package js11.praktek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ardan
 */

public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton buttonTambah;
    private JPanel panel;
    
    public MyInputForm(){
        createTextField();
        buttonKali();
        buttonTambah();
        createPanel();
        setSize(FRAME_WIDTH,FRAME_WIDTH);
    }
    
    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil Perkalian: ");
        dLabel = new JLabel("Hasil Penambahan :");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void buttonKali(){
        button = new JButton("Perkalian");//for calculate button
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil Perkalian "+c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void buttonTambah(){
        buttonTambah = new JButton("Tambah");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a+b;
                dLabel.setText("Hasil Penambahan "+d);
            }
        }
        ActionListener listener2 = new AddInterestListener();
        buttonTambah.addActionListener(listener2);
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(buttonTambah);
        panel.add(cLabel);
        panel.add(dLabel);
        add(panel);
    }
}
