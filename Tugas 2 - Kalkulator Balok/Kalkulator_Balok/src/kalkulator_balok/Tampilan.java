/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_balok;

import bangun_ruang.Balok;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rafli
 */
public class Tampilan extends JFrame implements ActionListener {

  private JPanel panelMain, panelTengah, panelInput, panelTombol, panelJawaban;
  private JLabel labelTitle, labelPanjang, labelLebar, labelTinggi;
  private JLabel labelHasil, labelKeliling, labelLuas, labelLuasPermukaan, labelVolume;
  private JTextField inputPanjang, inputLebar, inputTinggi;
  private JButton btnHitung, btnReset;

  Tampilan() {
    super("Kalkulator Balok");

    // Bikin komponen
    panelMain = new JPanel(new BorderLayout(0, 10));
    panelTengah = new JPanel(new GridLayout(2, 1, 0, 8));
    panelInput = new JPanel(new GridLayout(3, 2, 2, 2));
    panelJawaban = new JPanel(new GridLayout(5, 1, 2, 2));
    panelTombol = new JPanel(new GridLayout(1, 2, 5, 0));
    labelTitle = new JLabel("Kalkulator Balok");

    labelPanjang = new JLabel("Panjang");
    inputPanjang = new JTextField("0", 7);

    labelLebar = new JLabel("Lebar");
    inputLebar = new JTextField("0", 7);

    labelTinggi = new JLabel("Tinggi");
    inputTinggi = new JTextField("0", 7);

    labelHasil = new JLabel("Hasil");
    labelKeliling = new JLabel();
    labelLuas = new JLabel();
    labelKeliling = new JLabel();
    labelLuasPermukaan = new JLabel();
    labelVolume = new JLabel();

    btnHitung = new JButton("Hitung");
    btnReset = new JButton("Reset");

    // Bikin layout
    setLayout(new FlowLayout());
    setResizable(true);
    add(panelMain);

    panelMain.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    panelMain.add(labelTitle);
    labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
    panelMain.add(labelTitle, "North");
    panelMain.add(panelTengah, "Center");
    panelMain.add(panelTombol, "South");
    
    panelTengah.add(panelInput);
    panelTengah.add(labelHasil);
    panelTengah.add(panelJawaban);
    
    panelInput.add(labelPanjang);
    panelInput.add(inputPanjang);
    panelInput.add(labelLebar);
    panelInput.add(inputLebar);
    panelInput.add(labelTinggi);
    panelInput.add(inputTinggi);
    
    panelJawaban.add(labelHasil);
    labelHasil.setHorizontalAlignment(SwingConstants.CENTER);
    panelJawaban.add(labelKeliling);
    panelJawaban.add(labelLuas);
    panelJawaban.add(labelLuasPermukaan);
    panelJawaban.add(labelVolume);

    panelTombol.add(btnHitung);
    panelTombol.add(btnReset);

    pack();
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Bikin event listener
    btnHitung.addActionListener(this);
    btnReset.addActionListener(this);
  }

  // Event handler
  public void actionPerformed(ActionEvent event) {
    double panjang, lebar, tinggi;
    String textInputPanjang = inputPanjang.getText();
    String textInputLebar = inputLebar.getText();
    String textInputTinggi = inputTinggi.getText();

    if (event.getSource() == btnHitung) {
      if (textInputPanjang.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Panjang cannot empty");
      } else if (textInputLebar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lebar cannot empty");
      } else if (textInputTinggi.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tinggi cannot empty");
      } else {
        try {
          panjang = Double.parseDouble(textInputPanjang);
          lebar = Double.parseDouble(textInputLebar);
          tinggi = Double.parseDouble(textInputTinggi);

          Balok balok = new Balok(panjang, lebar, tinggi);

          labelKeliling.setText("Keliling Persegi: " + balok.keliling());
          labelLuas.setText("Luas Persegi: " + balok.luas());
          labelLuasPermukaan.setText("Luas Permukaan Balok: " + balok.luasPermukaan());
          labelVolume.setText("Volume Balok: " + balok.volume());
        } catch (NumberFormatException error) {
          JOptionPane.showMessageDialog(this, error.getMessage());
        }
      }
    }

    if (event.getSource() == btnReset) {
      // Reset jawaban
      labelKeliling.setText(" ");
      labelLuas.setText(" ");
      labelLuasPermukaan.setText(" ");
      labelVolume.setText(" ");
      
      // Reset input
      inputPanjang.setText("0");
      inputLebar.setText("0");
      inputTinggi.setText("0");
    }
  }
}
