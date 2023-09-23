package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class JSwingExampleGUI {


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
        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30); // x, y, sirka, vyska
        textField.setHorizontalAlignment(JTextField.RIGHT); // Nastavenie kurzora do pravej casti JTextField
        panel.add(textField);




        JLabel labelText = new JLabel("Hello World Swing!"); // popisok
        labelText.setBounds(140,50,150,20); // x, y, sirka, vyska
        panel.add(labelText);



        JButton btnOk = new JButton("Vypiš!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                // Aplikacna logika po stlaceni na tlacidlo
/*                System.out.println(textField.getText());
                labelText.setText( textField.getText() );*/
                System.out.println("Stlačil som tlačidlo Vypíš");
                System.out.println(textField.getText()); // Vypise obsah textField do konzoly
                labelText.setText(textField.getText());
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
