/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rafli
 */
public class MainFrame extends JFrame implements ActionListener {

  JPanel panel;
  JLabel title;
  JButton btnPersegi, btnSegitiga;

  public MainFrame() {
    panel = new JPanel();
    title = new JLabel("PT XYZ");
    btnPersegi = new JButton("Persegi");
    btnSegitiga = new JButton("Segitiga");

    setSize(300, 300);
    add(panel);
    panel.setLayout(null);

    title.setHorizontalAlignment(SwingConstants.CENTER);
    title.setBounds(0, 10, 300, 20);
    btnPersegi.setBounds(98, 80, 100, 30);
    btnSegitiga.setBounds(98, 120, 100, 30);
    panel.add(title);
    panel.add(btnPersegi);
    panel.add(btnSegitiga);

    setLocationRelativeTo(null);
    setDefaultCloseOperation(3);
    setVisible(true);

    btnPersegi.addActionListener(this);
    btnSegitiga.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnPersegi) new PersegiFrame();
    else if (e.getSource() == btnSegitiga) new SegitigaFrame();
    dispose();
  }
}
