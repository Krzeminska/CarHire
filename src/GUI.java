/**
 *
 * @author Kasia
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {

    Samochod DaneZBazy = null;
    Klient DaneZBazy2 = null;
    ArrayList<Samochod> listaS = new ArrayList();
        
        
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_Wyp = new javax.swing.JInternalFrame();
        p_Wyp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s_nazwa = new javax.swing.JTextField();
        s_cena = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n_nazwisko = new javax.swing.JTextField();
        k_nazwisko = new javax.swing.JTextField();
        n_imie = new javax.swing.JTextField();
        k_imie = new javax.swing.JTextField();
        n_telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dostepny = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        s_szukaj = new javax.swing.JButton();
        k_szukaj = new javax.swing.JButton();
        k_dodaj = new javax.swing.JButton();
        klient = new javax.swing.JLabel();
        wypozyczenie = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        frame_Zwrot = new javax.swing.JInternalFrame();
        p_zwrot = new javax.swing.JPanel();
        zwrot = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        klient_nazwisko = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        klient_imie = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelka = new javax.swing.JTable();
        szukaj_k = new javax.swing.JButton();
        poszukiwany = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Info = new javax.swing.JInternalFrame();
        close = new javax.swing.JButton();
        Manual = new javax.swing.JScrollPane();
        dokumentacja = new javax.swing.JTextArea();
        in_naprawa = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        dodaj = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        szukaj = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        out_naprawa = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        auto = new javax.swing.JTextField();
        czy = new javax.swing.JLabel();
        szukaj_auto = new javax.swing.JButton();
        wroc = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        Data1 = new javax.swing.JLabel();
        Data2 = new javax.swing.JLabel();
        inf = new javax.swing.JButton();
        tytul = new javax.swing.JLabel();
        subtytul = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        tytul2 = new javax.swing.JLabel();
        wplywy = new javax.swing.JButton();
        samochody = new javax.swing.JButton();
        samochody2 = new javax.swing.JButton();
        wypozyczane = new javax.swing.JButton();
        wypozyczane2 = new javax.swing.JButton();
        raport = new javax.swing.JButton();
        data_in_2 = new javax.swing.JTextField();
        data_in_1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        data_in_5 = new javax.swing.JTextField();
        data_in_4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        table = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        naprawa_in = new javax.swing.JButton();
        naprawa_out = new javax.swing.JButton();

        frame_Wyp.setVisible(true);

        p_Wyp.setBackground(new java.awt.Color(204, 204, 204));
        p_Wyp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel3.setText("Krok 1 :");

        jLabel4.setText("Sprawdź, czy dany samochód jest dostępny:");

        s_nazwa.setText("Wpisz początek nazwy...");

        s_cena.setText("Wpisz cenę...");

        jLabel5.setText("Nazwa :");

        jLabel6.setText("Cena :");

        jLabel7.setText("Krok 2 :");

        jLabel8.setText("Znajdź klienta :");

        jLabel9.setText("Dodaj NOWEGO klienta :");

        n_nazwisko.setText("Nazwisko");

        k_nazwisko.setText("Nazwisko");

        n_imie.setText("Imię");

        k_imie.setText("Imię");

        n_telefon.setText("---------");

        jLabel10.setText("Nazwisko :");

        jLabel11.setText("Imię :");

        jLabel12.setText("Telefon :");

        dostepny.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dostepny.setForeground(new java.awt.Color(255, 0, 0));
        dostepny.setText("Nie dostępny");

        s_szukaj.setText("Szukaj");
        s_szukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_szukajActionPerformed(evt);
            }
        });

        k_szukaj.setText("Szukaj");
        k_szukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_szukajActionPerformed(evt);
            }
        });

        k_dodaj.setText("Dodaj");
        k_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_dodajActionPerformed(evt);
            }
        });

        klient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        klient.setForeground(new java.awt.Color(255, 0, 0));
        klient.setText("Nie ma takiego klienta");

        wypozyczenie.setText("Dodaj wypożyczenie");
        wypozyczenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczenieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_WypLayout = new javax.swing.GroupLayout(p_Wyp);
        p_Wyp.setLayout(p_WypLayout);
        p_WypLayout.setHorizontalGroup(
            p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_WypLayout.createSequentialGroup()
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_WypLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(p_WypLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_WypLayout.createSequentialGroup()
                                .addComponent(dostepny)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s_szukaj))
                            .addGroup(p_WypLayout.createSequentialGroup()
                                .addComponent(s_nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s_cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p_WypLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_WypLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(k_dodaj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_WypLayout.createSequentialGroup()
                                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(p_WypLayout.createSequentialGroup()
                                        .addComponent(klient, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(k_szukaj))
                                    .addGroup(p_WypLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(k_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(k_imie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(n_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n_imie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(p_WypLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(wypozyczenie, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_WypLayout.setVerticalGroup(
            p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_WypLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dostepny)
                    .addComponent(s_szukaj))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klient)
                    .addGroup(p_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k_szukaj)
                        .addComponent(k_dodaj)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wypozyczenie, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout frame_WypLayout = new javax.swing.GroupLayout(frame_Wyp.getContentPane());
        frame_Wyp.getContentPane().setLayout(frame_WypLayout);
        frame_WypLayout.setHorizontalGroup(
            frame_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_Wyp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frame_WypLayout.setVerticalGroup(
            frame_WypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_Wyp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frame_Zwrot.setVisible(true);

        p_zwrot.setBackground(new java.awt.Color(204, 204, 204));
        p_zwrot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        zwrot.setText("Rejestruj zwrot auta");
        zwrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwrotActionPerformed(evt);
            }
        });

        jLabel13.setText("Krok 1 :");

        jLabel14.setText("Znajdź klienta, który chce oddać samochód:");

        klient_nazwisko.setText("Nazwisko");

        jLabel15.setText("Nazwisko :");

        klient_imie.setText("Imię");

        jLabel16.setText("Imię :");

        tabelka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Samochodu", "Nazwa", "Do zapłaty", "Zwrot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelka);

        szukaj_k.setText("szukaj");
        szukaj_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szukaj_kActionPerformed(evt);
            }
        });

        poszukiwany.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        poszukiwany.setForeground(new java.awt.Color(255, 0, 0));
        poszukiwany.setText("Nie znaleziono klienta!");

        jLabel17.setText("Krok 2 :");

        jLabel18.setText("Zaznacz zwracane samochody:");

        javax.swing.GroupLayout p_zwrotLayout = new javax.swing.GroupLayout(p_zwrot);
        p_zwrot.setLayout(p_zwrotLayout);
        p_zwrotLayout.setHorizontalGroup(
            p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(p_zwrotLayout.createSequentialGroup()
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_zwrotLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_zwrotLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(p_zwrotLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(klient_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(klient_imie, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_zwrotLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(poszukiwany)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(szukaj_k))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p_zwrotLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(zwrot))
                    .addGroup(p_zwrotLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        p_zwrotLayout.setVerticalGroup(
            p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_zwrotLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klient_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klient_imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(szukaj_k)
                    .addComponent(poszukiwany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_zwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zwrot)
                .addContainerGap())
        );

        javax.swing.GroupLayout frame_ZwrotLayout = new javax.swing.GroupLayout(frame_Zwrot.getContentPane());
        frame_Zwrot.getContentPane().setLayout(frame_ZwrotLayout);
        frame_ZwrotLayout.setHorizontalGroup(
            frame_ZwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_ZwrotLayout.createSequentialGroup()
                .addComponent(p_zwrot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        frame_ZwrotLayout.setVerticalGroup(
            frame_ZwrotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_zwrot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Info.setVisible(true);

        close.setText("Pokaż Dokumentację:");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        dokumentacja.setColumns(20);
        dokumentacja.setRows(5);
        Manual.setViewportView(dokumentacja);

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info.getContentPane());
        Info.getContentPane().setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(close)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manual)
                .addContainerGap())
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Manual, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        in_naprawa.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dodaj.setText("Oddaj do naprawy");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });

        jLabel30.setText("Nazwa auta :");

        szukaj.setText("szukaj");
        szukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szukajActionPerformed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 0, 0));
        txt2.setText("Nie dostępny");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dodaj)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2)
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(szukaj)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szukaj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2)
                .addGap(18, 18, 18)
                .addComponent(dodaj)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout in_naprawaLayout = new javax.swing.GroupLayout(in_naprawa.getContentPane());
        in_naprawa.getContentPane().setLayout(in_naprawaLayout);
        in_naprawaLayout.setHorizontalGroup(
            in_naprawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        in_naprawaLayout.setVerticalGroup(
            in_naprawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        out_naprawa.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setText("Nazwa auta :");

        czy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        czy.setForeground(new java.awt.Color(255, 0, 0));
        czy.setText("Nie dostępne");

        szukaj_auto.setText("szukaj");
        szukaj_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szukaj_autoActionPerformed(evt);
            }
        });

        wroc.setText("Zwróć auto");
        wroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(szukaj_auto)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(czy)
                                    .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(wroc)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(czy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(szukaj_auto)
                .addGap(18, 18, 18)
                .addComponent(wroc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout out_naprawaLayout = new javax.swing.GroupLayout(out_naprawa.getContentPane());
        out_naprawa.getContentPane().setLayout(out_naprawaLayout);
        out_naprawaLayout.setHorizontalGroup(
            out_naprawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        out_naprawaLayout.setVerticalGroup(
            out_naprawaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out_naprawaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        p1.setMaximumSize(new java.awt.Dimension(464, 326));
        p1.setMinimumSize(new java.awt.Dimension(464, 326));
        p1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                p1MouseMoved(evt);
            }
        });

        Data1.setForeground(new java.awt.Color(102, 102, 102));
        Data1.setText("Data dzisiejsza :");

        Data2.setForeground(new java.awt.Color(102, 102, 102));
        Data2.setText("Data z przesunięciem:");

        inf.setText("About Application");
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        tytul.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tytul.setText("Formularz do obsługi bazy danych");

        subtytul.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        subtytul.setText("krzeminska_kk_3i");

        p2.setBackground(new java.awt.Color(102, 102, 102));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tytul2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tytul2.setText("Generatory raportów :");

        wplywy.setText("Suma wpływów");
        wplywy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wplywyActionPerformed(evt);
            }
        });

        samochody.setText("Najczęściej w naprawie");
        samochody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samochodyActionPerformed(evt);
            }
        });

        samochody2.setText("Najrzadziej w naprawie");
        samochody2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samochody2ActionPerformed(evt);
            }
        });

        wypozyczane.setText("Najczęściej wypożyczane");
        wypozyczane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczaneActionPerformed(evt);
            }
        });

        wypozyczane2.setText("Najdłużej wypożyczane");
        wypozyczane2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wypozyczane2ActionPerformed(evt);
            }
        });

        raport.setText("Raport zbiorczy");
        raport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raportActionPerformed(evt);
            }
        });

        data_in_2.setText("rrrr-mm-dd");

        data_in_1.setText("rrrr-mm-dd");

        jLabel1.setText("Suma wpływów z okresu:");

        jLabel19.setText("Raport z okresu :");

        data_in_5.setText("rrrr-mm-dd");

        data_in_4.setText("rrrr-mm-dd");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(samochody)
                            .addComponent(samochody2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wypozyczane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wypozyczane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(tytul2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addComponent(data_in_1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data_in_2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(wplywy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(data_in_4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_in_5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(raport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
            .addComponent(jSeparator5)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tytul2)
                .addGap(23, 23, 23)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wplywy)
                    .addComponent(data_in_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_in_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wypozyczane)
                    .addComponent(samochody))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(samochody2)
                    .addComponent(wypozyczane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raport)
                    .addComponent(data_in_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_in_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_samochód", "Nazwa", "Ilość instancji"
            }
        ));
        table.setViewportView(tabela);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("oprac. Katarzyna Krzemińska, grupa: 3i, indeks: 3819");

        d2.setText("...");

        d1.setText("...");

        b1.setText("Rejestruj WYPOŻYCZENIE auta");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Rejestruj ZWROT auta");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        naprawa_in.setText("Oddaj auto DO naprawy");
        naprawa_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naprawa_inActionPerformed(evt);
            }
        });

        naprawa_out.setText("Wróć auto Z naprawy");
        naprawa_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naprawa_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addComponent(Data1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d1))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addComponent(Data2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inf)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addComponent(table)
                        .addContainerGap())
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(tytul)
                                    .addComponent(subtytul)))
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naprawa_in)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(naprawa_out)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Data1)
                            .addComponent(d1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Data2)
                            .addComponent(d2)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inf)))
                .addGap(18, 18, 18)
                .addComponent(tytul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtytul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naprawa_in)
                    .addComponent(naprawa_out))
                .addGap(18, 18, 18)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void wplywyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wplywyActionPerformed
     //   String x = "Select count(oplata_kk_3i) from wypozyczenie_kk_3i where zaplacone_kk_3i = true";
       String s = data_in_1.getText(), s2 = data_in_2.getText();

       String Query = "Select oplata_kk_3i from wypozyczenie_kk_3i where zaplacone_kk_3i = true && data_out_kk_3i > '" + s +"' && data_out_kk_3i < '" + s2 + "';";
       float suma = 0;
       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
            System.out.println(Query);
            Class.forName("com.mysql.jdbc.Driver");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            while(rs.next()) {
                suma = suma + Float.parseFloat(rs.getString(1));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(new JFrame(), suma + " zł.", "Suma wpływów:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_wplywyActionPerformed

    private void samochodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samochodyActionPerformed
        String Query = "Select * from samochod_kk_3i;", Query2 = "Select * from naprawa_kk_3i;";
        
        ArrayList<Samochod> lista = new ArrayList();

       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                
                while(rs.next()) {
                    Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                    lista.add(s);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query2);
                
                while(rs.next()) {
                    int x = Integer.valueOf(rs.getString(3));
                    
                    for(int i=0; i<lista.size(); i++)
                        if(lista.get(i).samochodID() == x)
                            lista.get(i).setIterator(1);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       clearTable();

       int j = 0;
       for(int i=0; i<lista.size(); i++)
           if(lista.get(i).samochodIterator() > 2) {
            tabela.getModel().setValueAt(lista.get(i).samochodID(), j, 0);
            tabela.getModel().setValueAt(lista.get(i).samochodNazwa(), j, 1);
            tabela.getModel().setValueAt(lista.get(i).samochodIterator(), j, 2);
            j++;
           }

    }//GEN-LAST:event_samochodyActionPerformed

    private void samochody2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samochody2ActionPerformed

        String Query = "Select * from samochod_kk_3i;", Query2 = "Select * from naprawa_kk_3i;";
        
        ArrayList<Samochod> lista = new ArrayList();

       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                
                while(rs.next()) {
                    Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                    lista.add(s);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query2);
                
                while(rs.next()) {
                    int x = Integer.valueOf(rs.getString(3));
                    
                    for(int i=0; i<lista.size(); i++)
                        if(lista.get(i).samochodID() == x)
                            lista.get(i).setIterator(1);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       clearTable();
       
       int j = 0;
       for(int i=0; i<lista.size(); i++)
           if(lista.get(i).samochodIterator() <= 2) {
                tabela.getModel().setValueAt(lista.get(i).samochodID(), j, 0);
                tabela.getModel().setValueAt(lista.get(i).samochodNazwa(), j, 1);
                tabela.getModel().setValueAt(lista.get(i).samochodIterator(), j, 2);
                j++;
           }

    }//GEN-LAST:event_samochody2ActionPerformed

    private void wypozyczaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczaneActionPerformed
        
        String Query = "Select * from samochod_kk_3i;", Query2 = "Select * from wypozyczenie_kk_3i;";
        
        ArrayList<Samochod> lista = new ArrayList();

       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                
                while(rs.next()) {
                    Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                    lista.add(s);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query2);
                
                while(rs.next()) {
                    int x = Integer.valueOf(rs.getString(5));
                    
                    for(int i=0; i<lista.size(); i++)
                        if(lista.get(i).samochodID() == x)
                            lista.get(i).setIterator(1);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       clearTable();
       
       int j = 0;
       for(int i=0; i<lista.size(); i++)
           if(lista.get(i).samochodIterator() > 0) { 
                tabela.getModel().setValueAt(lista.get(i).samochodID(), j, 0);
                tabela.getModel().setValueAt(lista.get(i).samochodNazwa(), j, 1);
                tabela.getModel().setValueAt(lista.get(i).samochodIterator(), j, 2);
                j++;
           }
    }//GEN-LAST:event_wypozyczaneActionPerformed

    private void wypozyczane2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczane2ActionPerformed
        String Query = "Select (data_out_kk_3i - data_in_kk_3i), id_samochod_kk_3i from wypozyczenie_kk_3i;";
        String Query2 = "Select * from samochod_kk_3i";
        
        ArrayList<Samochod> lista = new ArrayList();

       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query);
                
                while(rs.next() && rs.getString(1) != null) {
                    Samochod s = new Samochod(Integer.valueOf(rs.getString(2)));
                    s.setIterator(Integer.valueOf(rs.getString(1)));
                    lista.add(s);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(Query2);
                
                while(rs.next()) {
                    int x = Integer.valueOf(rs.getString(4));
                    
                    for(int i=0; i<lista.size(); i++)
                        if(lista.get(i).samochodID() == x)
                            lista.get(i).setNazwa(rs.getString(1));
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       clearTable();
       
       int j = 0;
       for(int i=0; i<lista.size(); i++)
           if(lista.get(i).samochodIterator() > 0) { 
                tabela.getModel().setValueAt(lista.get(i).samochodID(), j, 0);
                tabela.getModel().setValueAt(lista.get(i).samochodNazwa(), j, 1);
                tabela.getModel().setValueAt(lista.get(i).samochodIterator(), j, 2);
                j++;
           }
    }//GEN-LAST:event_wypozyczane2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Dialog dlg = new Dialog(this, "Wypożyczenie", "message", frame_Wyp, wypozyczenie);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Dialog dlg = new Dialog(this, "Zwrot", "message", frame_Zwrot, zwrot);
    }//GEN-LAST:event_b2ActionPerformed

    private void s_szukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_szukajActionPerformed
        
        if(!"".equals(s_nazwa.getText())) {
            
            String Query = "Select * from samochod_kk_3i where nazwa_kk_3i like '" + s_nazwa.getText() + "%';";
            
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    
                    rs.next();
                    if(Integer.valueOf(rs.getString(3)) == 1) {
                        
                        Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                        s.setCena(Float.parseFloat(rs.getString(2)));
                        s_nazwa.setText(s.samochodNazwa());
                        s_cena.setText(s.samochodCena() + " zł.");
                        dostepny.setForeground(Color.GREEN);
                        dostepny.setText("Dostępny");
                        DaneZBazy = s;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono samochodu.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(s_cena.getText() != null) {
            String Query = "Select * from samochod_kk_3i where cena_kk_3i like " + s_cena.getText() + ";";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    rs.next();
                    if(Integer.valueOf(rs.getString(3)) == 1) {
                        Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                        s.setCena(Float.parseFloat(rs.getString(2)));
                        s_nazwa.setText(s.samochodNazwa());
                        s_cena.setText(String.valueOf(s.samochodCena()));
                        dostepny.setForeground(Color.GREEN);
                        dostepny.setText("Dostępny");
                        DaneZBazy = s;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono samochodu.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(p1, "Nie znaleziono samochodu.");
    }//GEN-LAST:event_s_szukajActionPerformed

    private void k_szukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_szukajActionPerformed
        if(!"".equals(k_nazwisko.getText())) {
            
            String Query = "Select * from klient_kk_3i where nazwisko_kk_3i like '" + k_nazwisko.getText() + "%';";
            
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    
                    rs.next();
                    Klient k = new Klient(Integer.valueOf(rs.getString(4)),rs.getString(2),rs.getString(1),rs.getString(3));
                    if(k.getImie() != null) {
                        k_nazwisko.setText(k.getNazwisko());
                        k_imie.setText(k.getImie());
                        klient.setForeground(Color.GREEN);
                        klient.setText("Dostępny");
                        DaneZBazy2 = k;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono klienta.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_k_szukajActionPerformed

    private void k_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_dodajActionPerformed
        if(n_nazwisko.getText() != null && n_imie.getText() != null && n_telefon.getText() != null) {
            
            String Query = "Insert into klient_kk_3i value ('" + n_imie.getText() + "', '" + n_nazwisko.getText() + "', '" + n_telefon.getText() + "', null);";
            String Query2 = "SELECT * FROM klient_kk_3i WHERE id_klient_kk_3i IN (SELECT MAX(id_klient_kk_3i) FROM klient_kk_3i);";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Statement st = con.createStatement();
                    st.executeUpdate(Query);
                    
                    ResultSet rs = st.executeQuery(Query2);
                    rs.next();
                    
                    Klient k = new Klient(Integer.valueOf(rs.getString(4)),rs.getString(2),rs.getString(1),rs.getString(3));
                    DaneZBazy2 = k;

                    klient.setForeground(Color.GREEN);
                    klient.setText("Dostępny");
                    JOptionPane.showMessageDialog(p1, "Dodano nowego klienta.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_k_dodajActionPerformed

    private void wypozyczenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wypozyczenieActionPerformed
        if(DaneZBazy != null && DaneZBazy2 != null) {
            String Query = "insert into wypozyczenie_kk_3i value (now(), null, null, false, " + DaneZBazy.samochodID() + ", " + DaneZBazy2.getID() + ", null);";
            String Query2 = "UPDATE samochod_kk_3i set dostepnosc_kk_3i = false where id_samochod_kk_3i = " + DaneZBazy.samochodID() + ";";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Statement st = con.createStatement();
                    st.executeUpdate(Query);
                    st.executeUpdate(Query2);
                    
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DaneZBazy = null;
            DaneZBazy2 = null;
            
            JOptionPane.showMessageDialog(p1, "Zarejestrowano nowe wypożyczenie.");
        }
        else
            JOptionPane.showMessageDialog(p1, "Aby dodać instancję należy znaleźć istniejącego Klienta oraz dostępny Samochód");
    }//GEN-LAST:event_wypozyczenieActionPerformed

    private void szukaj_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szukaj_kActionPerformed
        if(!"".equals(klient_nazwisko.getText())) {
            
            
            String Query = "Select * from klient_kk_3i where nazwisko_kk_3i like '" + klient_nazwisko.getText() + "%';";
            
            
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    rs.next();
                    Klient k = new Klient(Integer.valueOf(rs.getString(4)),rs.getString(2),rs.getString(1),rs.getString(3));
                    if(k.getImie() != null) {
                        klient_nazwisko.setText(k.getNazwisko());
                        klient_imie.setText(k.getImie());
                        poszukiwany.setForeground(Color.GREEN);
                        poszukiwany.setText("Dostępny");
                        DaneZBazy2 = k;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono klienta.");
                    
                    Query = "SELECT * from wypozyczenie_kk_3i where id_klient_kk_3i = " + k.getID() + ";";
                    rs = st.executeQuery(Query);
                    while(rs.next()) {
                        if(rs.getString(2) == null) {
                            Samochod s = new Samochod(Integer.valueOf(rs.getString(5)), Integer.valueOf(rs.getString(7)));
                            listaS.add(s);
                        }
                    }
                    Query = "SELECT id_samochod_kk_3i, datediff(now() , data_in_kk_3i) from wypozyczenie_kk_3i where id_klient_kk_3i = " + k.getID() + ";";
                    rs = st.executeQuery(Query);
                    while(rs.next()) {
                            for(int i=0; i<listaS.size(); i++)
                                if(listaS.get(i).samochodID() == Integer.valueOf(rs.getString(1))) 
                                    listaS.get(i).setCena(Float.parseFloat(rs.getString(2)));

                    }
                    Query = "SELECT * from samochod_kk_3i;";
                    rs = st.executeQuery(Query);
                    while(rs.next()) {
                            float roznicaDni;
                    
                            for(int i=0; i<listaS.size(); i++) 
                                if(listaS.get(i).samochodID() == Integer.valueOf(rs.getString(4))){
                                    listaS.get(i).setNazwa(rs.getString(1));
                                    roznicaDni = listaS.get(i).samochodCena();
                                    listaS.get(i).setCena(roznicaDni * Float.parseFloat(rs.getString(2)));
                                }
                        
                    }
                    
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel model = (DefaultTableModel)tabelka.getModel(); 
                int rows = model.getRowCount(); 
                for(int i = rows - 1; i >=0; i--) {
                    model.removeRow(i); 
                }    
                
                
            DefaultTableModel model2 = new DefaultTableModel() {
                public Class<?> getKlasaKolumny(int col) {
                    switch(col) {
                        case 0:
                            return Integer.class;
                        case 1:
                            return String.class;
                        case 2:
                            return Float.class;
                        case 3:
                            return Boolean.class;
                        default:
                            return String.class;
                    }
                } 
            };
            tabelka.setModel(model2);
            
            model2.addColumn("ID");
            model2.addColumn("Samochod");
            model2.addColumn("Cena");
            model2.addColumn("Zwrot");
            
            int j = 0;
            for(int i=0; i<listaS.size(); i++) { 
                        model2.addRow(new Object[0]);
                        model2.setValueAt(listaS.get(i).samochodID(), j, 0);
                        model2.setValueAt(listaS.get(i).samochodNazwa(), j, 1);
                        model2.setValueAt(listaS.get(i).samochodCena(), j, 2);
                        model2.setValueAt(false, j, 3);
                        j++;
                   }
        }
    }//GEN-LAST:event_szukaj_kActionPerformed

    private void zwrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwrotActionPerformed
        if(listaS != null) {
            
            DefaultTableModel model = (DefaultTableModel)tabelka.getModel();
            for(int i=0; i<model.getRowCount(); i++) {
                Boolean check = Boolean.valueOf(tabelka.getValueAt(i, 3).toString());
                String column = tabelka.getValueAt(i, 1).toString();
                if(check) {
                    for(int j=0; j<listaS.size(); j++) 
                        if(listaS.get(j).samochodNazwa().equals(column)){
                            listaS.get(j).setIterator(1);
                    }
                }
                
            }
            
            String Query = "UPDATE wypozyczenie_kk_3i set data_out_kk_3i = now(), oplata_kk_3i = ", Query2 =", zaplacone_kk_3i = true where id_wypozyczenie_kk_3i = ";
            String Query3 = "UPDATE samochod_kk_3i set dostepnosc_kk_3i = true where id_samochod_kk_3i = ";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Statement st = con.createStatement();
                    int id = 0;
                    float koszt = 0;
                    for(int j=0; j<listaS.size(); j++) 
                        if(listaS.get(j).samochodIterator() == 1){
                           id = listaS.get(j).samochodid_wyp();
                           koszt = listaS.get(j).samochodCena();
                    }
                    Query = Query + koszt + Query2 + id + ";";
                    if(id != 0)
                        st.executeUpdate(Query);
                    
                    for(int j=0; j<listaS.size(); j++) 
                        if(listaS.get(j).samochodIterator() == 1){
                           id = listaS.get(j).samochodID();
                           koszt = 0;
                    }
                    Query3 = Query3 + id + ";";
                    if(id != 0 && koszt == 0)
                        st.executeUpdate(Query3);
                    
                    for(int j=0; j<listaS.size(); j++) 
                        if(listaS.get(j).samochodIterator() == 1){
                           String str = "Dokonano zwrotu auta : " + listaS.get(j).print();
                        
                        JOptionPane.showMessageDialog(p1, str);
                    }
                    
                    listaS = null;
                   
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        else JOptionPane.showMessageDialog(p1, "Nie znaleziono klienta.");
    }//GEN-LAST:event_zwrotActionPerformed

    private void raportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raportActionPerformed
        String s1 = data_in_4.getText(), s2 = data_in_5.getText();
        
        if(s1 != null && s2 != null) {
            String Query = "Select oplata_kk_3i, id_samochod_kk_3i from wypozyczenie_kk_3i where zaplacone_kk_3i = true && data_out_kk_3i > '" + s1 +"' && data_out_kk_3i < '" + s2 + "';";

            String Query2 = "Select * from samochod_kk_3i;";
            ArrayList<Samochod> lista = new ArrayList();

           try {

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);

                    
                    while(rs.next()) {
                        Samochod s = new Samochod(Integer.valueOf(rs.getString(2)));
                        s.setCena(Float.parseFloat(rs.getString(1)));
                        lista.add(s);
                    }

                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query2);

                    while(rs.next()) {
                        for(int i=0;i<lista.size();i++) {
                            int x = Integer.parseInt(rs.getString(4));
                            if(lista.get(i).samochodID() == x)
                                lista.get(i).setNazwa(rs.getString(1));
                        }
                    }
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

           clearTable();

           int j = 0;
           for(int i=0; i<lista.size(); i++)
               if(lista.get(i).samochodIterator() <= 2) {
                    tabela.getModel().setValueAt(lista.get(i).samochodID(), j, 0);
                    tabela.getModel().setValueAt(lista.get(i).samochodNazwa(), j, 1);
                    tabela.getModel().setValueAt(lista.get(i).samochodCena(), j, 2);
                    j++;
               }
        }
        else
            JOptionPane.showMessageDialog(p1, "Wybierz przedział czasowy.");
    }//GEN-LAST:event_raportActionPerformed

    private void p1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseMoved

       String Query = "select curdate() from dual;";
       String Query2 = "SELECT DATE_ADD(curdate(), INTERVAL 3819 DAY) from dual;";
       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
            
            Class.forName("com.mysql.jdbc.Driver");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            d1.setText(rs.getString(1));
            rs = st.executeQuery(Query2);
            rs.next();
            d2.setText(rs.getString(1));
            

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p1MouseMoved

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        Dialog dlg = new Dialog(this, "Dokumentacja", "message", Info, close);
        
    }//GEN-LAST:event_infActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed

        FileReader fileReader;
        try {
            fileReader = new FileReader("Dokumentacja.txt");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String textLine = bufferedReader.readLine();
                do {
                    dokumentacja.append(textLine + "\n");
                    System.out.println(textLine);
                    textLine = bufferedReader.readLine();
                } while(textLine != null);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_closeActionPerformed

    private void naprawa_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naprawa_inActionPerformed
        Dialog dlg = new Dialog(this, "Zwrot", "message", in_naprawa, dodaj);
    }//GEN-LAST:event_naprawa_inActionPerformed

    private void naprawa_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naprawa_outActionPerformed
        Dialog dlg = new Dialog(this, "Zwrot", "message", out_naprawa, wroc);
    }//GEN-LAST:event_naprawa_outActionPerformed

    private void szukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szukajActionPerformed
        if(!"".equals(txt.getText())) {
            
            String Query = "Select * from samochod_kk_3i where nazwa_kk_3i like '" + txt.getText() + "%';";
            
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    
                    rs.next();
                    if(Integer.valueOf(rs.getString(3)) == 1) {
                        
                        Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                        s.setCena(Float.parseFloat(rs.getString(2)));
                        txt.setText(s.samochodNazwa());
                        txt2.setForeground(Color.GREEN);
                        txt2.setText("Dostępny");
                        DaneZBazy = s;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono samochodu.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_szukajActionPerformed

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed
        if(DaneZBazy != null) {
            String Query = "insert into naprawa_kk_3i value (now(), null, " + DaneZBazy.samochodID() + ", null);";
            String Query2 = "UPDATE samochod_kk_3i set dostepnosc_kk_3i = false where id_samochod_kk_3i = " + DaneZBazy.samochodID() + ";";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Statement st = con.createStatement();
                    st.executeUpdate(Query);
                    st.executeUpdate(Query2);
                    
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DaneZBazy = null;
            
            JOptionPane.showMessageDialog(p1, "Auto wydano do naprawy. \n Auto niedostępne.");
        }
    }//GEN-LAST:event_dodajActionPerformed

    private void szukaj_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szukaj_autoActionPerformed
        if(!"".equals(auto.getText())) {
            
            String Query = "Select * from samochod_kk_3i where nazwa_kk_3i like '" + auto.getText() + "%';";
            
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(Query);
                    
                    
                    rs.next();
                    if(Integer.valueOf(rs.getString(3)) == 0) {
                        
                        Samochod s = new Samochod(Integer.valueOf(rs.getString(4)),rs.getString(1));
                        s.setCena(Float.parseFloat(rs.getString(2)));
                        auto.setText(s.samochodNazwa());
                        czy.setForeground(Color.GREEN);
                        czy.setText("Dostępny");
                        DaneZBazy = s;
                    }
                    else JOptionPane.showMessageDialog(p1, "Nie znaleziono samochodu.");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_szukaj_autoActionPerformed

    private void wrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrocActionPerformed
        if(DaneZBazy != null) {
            String Query = "update naprawa_kk_3i set out_kk_3i = now() where id_naprawa_kk_3i = " + DaneZBazy.samochodID() + ";";
            String Query2 = "UPDATE samochod_kk_3i set dostepnosc_kk_3i = true where id_samochod_kk_3i = " + DaneZBazy.samochodID() + ";";
            try {
                
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/krzeminska_3i", "root", "punish69")) {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Statement st = con.createStatement();
                    st.executeUpdate(Query);
                    st.executeUpdate(Query2);
                    
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DaneZBazy = null;
            
            JOptionPane.showMessageDialog(p1, "Pomyślnie zwrócono auto.");
        }
    }//GEN-LAST:event_wrocActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    
    class Samochod {
        int ID;
        int id_wyp;
        String Nazwa;
        int iterator;
        float cena;

        
        public Samochod(int i, String s) {
            this.ID = i;
            this.Nazwa = s;
            this.iterator = 0;
            this.cena = 0;
        }
        public Samochod(int i) {
            this.ID = i;
            this.Nazwa = null;
            this.iterator = 0;
            this.cena = 0;
        }
        public Samochod(int i, int i2) {
            this.ID = i;
            this.id_wyp = i2;
            this.Nazwa = null;
            this.iterator = 0;
            this.cena = 0;
        }
        
        public int samochodID() {
            return this.ID;
        }
        public String samochodNazwa() {
            return this.Nazwa;
        }
        public int samochodIterator() {
            return this.iterator;
        }
        public float samochodCena() {
            return this.cena;
        }
        public int samochodid_wyp() {
            return this.id_wyp;
        }
        
        public void setIterator(int i) {
            this.iterator = this.iterator + i;
        }
        public void setNazwa(String s) {
            this.Nazwa = s;
        }
        public void setCena(float s) {
            this.cena = s;
        }
        public void setID(int i) {
            this.ID = i;
        }
        
        ////////////////////////////////////////////////////////
        public String print() {
            return (ID + " " + Nazwa + " " + iterator);
        }

        
    }
    
    class Klient {
        int ID;
        String Nazwisko;
        String Imie;
        String Telefon;
        
        public Klient(int i, String s1, String s2, String s3) {
            this.ID = i;
            this.Nazwisko = s1;
            this.Imie = s2;
            this.Telefon = s3;
        }
        public String getImie() {
            return this.Imie;
        }
        public int getID() {
            return this.ID;
        }
        public String getNazwisko() {
            return this.Nazwisko;
        }
    }
   
    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel)tabela.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--) {
            model.removeRow(i); 
        }
        for(int i=0;i<100;i++) {
            model.addRow(new Object[]{null,null,null});
        }
    }
   
    public class Dialog extends JDialog implements ActionListener {
        public Dialog(JFrame parent, String title, String message, JInternalFrame f, JButton b) {
            super(parent, title, true);
            if (parent != null) {
                Dimension parentSize = parent.getSize(); 
                Point p = parent.getLocation(); 
                setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
            }
            JPanel messagePane = new JPanel();
            getContentPane().add(messagePane);
            messagePane.add(f);
            getContentPane().add(b, BorderLayout.SOUTH);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            pack(); 
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            setVisible(false); 
            dispose(); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data1;
    private javax.swing.JLabel Data2;
    private javax.swing.JInternalFrame Info;
    private javax.swing.JScrollPane Manual;
    private javax.swing.JTextField auto;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton close;
    private javax.swing.JLabel czy;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JTextField data_in_1;
    private javax.swing.JTextField data_in_2;
    private javax.swing.JTextField data_in_4;
    private javax.swing.JTextField data_in_5;
    private javax.swing.JButton dodaj;
    private javax.swing.JTextArea dokumentacja;
    private javax.swing.JLabel dostepny;
    private javax.swing.JInternalFrame frame_Wyp;
    private javax.swing.JInternalFrame frame_Zwrot;
    private javax.swing.JInternalFrame in_naprawa;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton k_dodaj;
    private javax.swing.JTextField k_imie;
    private javax.swing.JTextField k_nazwisko;
    private javax.swing.JButton k_szukaj;
    private javax.swing.JLabel klient;
    private javax.swing.JTextField klient_imie;
    private javax.swing.JTextField klient_nazwisko;
    private javax.swing.JTextField n_imie;
    private javax.swing.JTextField n_nazwisko;
    private javax.swing.JTextField n_telefon;
    private javax.swing.JButton naprawa_in;
    private javax.swing.JButton naprawa_out;
    private javax.swing.JInternalFrame out_naprawa;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p_Wyp;
    private javax.swing.JPanel p_zwrot;
    private javax.swing.JLabel poszukiwany;
    private javax.swing.JButton raport;
    private javax.swing.JTextField s_cena;
    private javax.swing.JTextField s_nazwa;
    private javax.swing.JButton s_szukaj;
    private javax.swing.JButton samochody;
    private javax.swing.JButton samochody2;
    private javax.swing.JLabel subtytul;
    private javax.swing.JButton szukaj;
    private javax.swing.JButton szukaj_auto;
    private javax.swing.JButton szukaj_k;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelka;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel tytul;
    private javax.swing.JLabel tytul2;
    private javax.swing.JButton wplywy;
    private javax.swing.JButton wroc;
    private javax.swing.JButton wypozyczane;
    private javax.swing.JButton wypozyczane2;
    private javax.swing.JButton wypozyczenie;
    private javax.swing.JButton zwrot;
    // End of variables declaration//GEN-END:variables
}
