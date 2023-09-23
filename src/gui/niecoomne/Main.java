package gui.niecoomne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main {


    public static void main(String[] args) {


        JFrame frame = new JFrame("Niečo o lektorovi Jánovi Žitniakovi"); // Vytvorime okno
        frame.setMinimumSize(new Dimension(380, 300)); // Nastavime velkost okna, ktora je aktualne je 400 x 200px (px = obrazovych bodov)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // Vycentrovanie okna
        frame.setResizable(false); // Zakazame zmenu velkosti okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny

        frame.setContentPane(panel); // Dany panel pridame do frame
        //frame.add(panel);

        File f = new File("profilova-fotka-jan-zitniak.jpg");
        JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
        imgLabel.setBounds(5, 5, 200, 300); // x, y, sirka, vyska
        panel.add(imgLabel);

        // JText
        JLabel hyperlink = new JLabel("IG Ján Žitniak");
        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink.setBounds(220, 20, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink);

        hyperlink.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/janzitniak/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });


        JTextArea textArea = new JTextArea("Profesionálny IT lektor. \nKoníčky: foto, video, beh, cestovanie. \nŽijem v Banskej Bystrici."); // popisok
        textArea.setBounds(220, 50, 150, 100); // x, y, sirka, vyska
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setOpaque(false);
        panel.add(textArea);


        JButton btnOk = new JButton("OK"); // tlacidlo
        btnOk.setBounds(275, 220, 30, 30); // x, y, sirka, vyska
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // Korektne zatvori celu SWING aplikaciu
            }
        });

        // display it
        frame.pack();
        frame.setVisible(true);


    }
}
