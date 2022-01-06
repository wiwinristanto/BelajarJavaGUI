import sun.util.resources.cldr.ru.LocaleNames_ru_UA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JPanel LingkaranPanel;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;
    private JTextField tfJariJari;
    private JTextField tfLuas;

    public Lingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tfJariJari.getText().isEmpty()){

                    //membuat variabel
                    double jariJari, luas;
                    double pi = 3.14;

                    //mengambil inputan dari tfjariJari dan parse typedata text ke double
                    jariJari = Double.parseDouble(tfJariJari.getText());

                    //Hitung Luas
                    luas = pi * (jariJari*jariJari);

                    //Menaruh hasil
                    tfLuas.setText(String.valueOf(luas));
                } else {
                    JOptionPane.showMessageDialog(null,"Silahan Isi Kolom Jari-jari");
                }


            }

        });

        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfJariJari.setText("");
                tfLuas.setText("");
                tfJariJari.requestFocus();

            }
        });

        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        frame.setContentPane(new Lingkaran().LingkaranPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
