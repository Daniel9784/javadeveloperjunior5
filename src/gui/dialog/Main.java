package gui.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Hello World Swing"); // Vytvorime okno
        frame.setMinimumSize(new Dimension(400, 200)); // Nastavime velkost okna, ktora je aktualne je 400 x 200px (px = obrazovych bodov)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna


        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny


        frame.setContentPane(panel); // Dany panel pridame do frame
        //frame.add(panel);



        // JText
/*        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT); // Nastavenie kurzora do pravej casti JTextField
        panel.add(textField);*/




        JLabel labelText = new JLabel("Hello World Swing!"); // popisok
        labelText.setBounds(140,50,150,20); // x, y, sirka, vyska
        panel.add(labelText);



        JButton btnOk = new JButton("Uprav!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                JDialog jDialog = new JDialog(frame, true);

                jDialog.setMinimumSize(new Dimension(200, 100));
                jDialog.setLocationRelativeTo(null); // vycentrovanie okna

                JPanel dialogPanel = new JPanel();
                dialogPanel.setLayout(null); // layout pre panel bude null, cize prazdny
                jDialog.setContentPane(dialogPanel); // Dany panel pridame do frame

                JTextField txfDialogText = new JTextField(labelText.getText());
                txfDialogText.setBounds(20,10,160,20);
                dialogPanel.add(txfDialogText);

                JButton btnDialogUlozZmeny = new JButton("Ulož zmeny");
                btnDialogUlozZmeny.setBounds(20,40,160,20);
                dialogPanel.add(btnDialogUlozZmeny);
                btnDialogUlozZmeny.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelText.setText(txfDialogText.getText());
                        jDialog.dispose();
                    }
                });

                jDialog.pack();
                jDialog.setVisible(true);

            }
        });





        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(210, 100, 80, 20);
        panel.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // Korektne zatvori celu SWING aplikaciu
            }
        });

/*        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // Korektne zatvori celu SWING aplikaciu
            }
        });*/



        // display it
        frame.pack();
        frame.setVisible(true);


    }
}

