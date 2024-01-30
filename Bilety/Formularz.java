package Bilety;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formularz extends JFrame {
    private JPanel rootPanel;
    private JTextField Imię;
    private JTextField Nazwisko;
    private JComboBox WylotZ;
    private JComboBox PrzylotDo;
    private JRadioButton VipTak;
    private JRadioButton VipNie;
    private JCheckBox przystawkaCheckBox;
    private JCheckBox obiadCheckBox;
    private JCheckBox deserCheckBox;
    private JTextArea Uwagi;
    private JButton dodajRezerwacjęButton;
    private JLabel ListaRezerwacji;
    private JTable table1;
    private JButton usunRezerwacjęButton;
    private JButton zakończProgramButton;

    // nasze pola
    private ArrayList<Rezerwacja> listaRezerwacji = new ArrayList<>();


    public Formularz() {
        add(rootPanel);
        setSize(1200 , 500);
        setTitle("Formularz rezerwacji biletów");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // definicja tabeli
        DefaultTableModel model = new DefaultTableModel();// kolumny
        model.addColumn("Imię :");// dodawanie kolumn
        model.addColumn("Nazwisko :");
        model.addColumn("Wylot z ");
        model.addColumn("Przylot do");
        model.addColumn("Vip");
        model.addColumn("Posiłek");
        model.addColumn("Uwagi");

        table1.setModel(model);


        zakończProgramButton.addActionListener(new ActionListener() {// wyłączamy przyciskiem zakończ program
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        dodajRezerwacjęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean p; ;
                if (Imię.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane , "Proszę wypełnić imię :");
                } else if (Nazwisko.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane , "Proszę wypełnić pole nazwisko");
                } else if (WylotZ.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(rootPane , "Proszke wybrać wylot z !");
                } else if (PrzylotDo.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(rootPane , "Proszę wybrać przylot do");

                }else if (!VipNie.isSelected() && !VipTak.isSelected()){
                    JOptionPane.showMessageDialog(rootPane, "Proszkę zaznaczyć tak lub nie w opcji Vip");

                } else if (!przystawkaCheckBox.isSelected() && !obiadCheckBox.isSelected() && !deserCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(rootPane , "Prosze wybrać posiłek");
                }else {

                    ArrayList <String> posilek = new ArrayList<>();

                    if (przystawkaCheckBox.isSelected()){
                        posilek.add("Przystawka");
                    }
                    if (obiadCheckBox.isSelected()){
                        posilek.add("Obiad");
                    }
                    if (deserCheckBox.isSelected()){
                        posilek.add("Deser");
                    }
                    if (VipTak.isSelected()){
                        p = true;
                    }
                    else{
                        p = false;
                    }

                    Rezerwacja rezerwacja = new Rezerwacja(Imię.getText() , Nazwisko.getText() , WylotZ.getSelectedItem().toString() , PrzylotDo.getSelectedItem().toString() , p, posilek , Uwagi.getText()  );
                    listaRezerwacji.add(rezerwacja);
                    // czyszczenie pól
                    Imię.setText("");
                    Nazwisko.setText("");
                    WylotZ.setSelectedIndex(0);
                    PrzylotDo.setSelectedIndex(0);
                    VipNie.setSelected(false);
                    VipTak.setSelected(false);
                    przystawkaCheckBox.setSelected(false);
                    obiadCheckBox.setSelected(false);
                    deserCheckBox.setSelected(false);
                    Uwagi.setText("");
                    pokazRezerwacje(model);
                }


            }
        });
        usunRezerwacjęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(table1.getSelectedRow());
                if (table1.getSelectedRow() == -1 ){
                    JOptionPane.showMessageDialog(rootPane , "Zaznacz rezerwację do usunięcia ");

                } else {
                    listaRezerwacji.remove(table1.getSelectedRow());
                    model.removeRow(table1.getSelectedRow());

                }

            }
        });
        VipTak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (VipTak.isSelected()){// zaznaczanie jednego albo drugiego
                    VipNie.setSelected(false);
                }else {
                    VipTak.setSelected(true);
                }
            }
        });
        VipNie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (VipNie.isSelected()){// zaznaczanie jednego lub drugiego
                    VipTak.setSelected(false);
                }else {
                    VipNie.setSelected(true);
                }
            }
        });

    }
    public void pokazRezerwacje(DefaultTableModel model){// pokazywanie informacji z tabeli

        while (model.getRowCount() > 0 ){// rzeby rzeczy w tabelce sie nie dublowały (czyszczenie tabeli )
            model.removeRow(0);
        }
//        model.removeRow();

        for (Rezerwacja x : listaRezerwacji){// wypisanie w tabeli
            model.addRow(new Object[]{x.imie , x.nazwisko , x.wylotZ , x.przylotDo , x.vip , x.posilek , x.uwagi});
        }
    }

}
