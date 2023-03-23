/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import javax.swing.JOptionPane;
import logic.CiptaPuisi;
import logic.KaryaTulis;
import logic.User;

/**
 *
 * @author rafli
 */
public class BiodataPenilaianPuisi extends javax.swing.JFrame {

  /**
   * Creates new form BiodataPenilaianKaryaTulis
   */
  public BiodataPenilaianPuisi() {
    initComponents();
    setDefaultCloseOperation(3);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    inputNama = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    inputJurusan = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    inputNim = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    inputKeindahan = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    inputEyd = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    inputStruktur = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    inputKreativitas = new javax.swing.JTextField();
    btnSimpan = new javax.swing.JButton();
    btnBatal = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Penilaian Puisi");

    jLabel2.setText("Form Biodata");

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel3.setText("Nama");

    inputNama.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputNamaActionPerformed(evt);
      }
    });

    jLabel4.setText("Jurusan");

    inputJurusan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputJurusanActionPerformed(evt);
      }
    });

    jLabel5.setText("NIM");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(jLabel3)
          .addComponent(jLabel5))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(inputNama)
          .addComponent(inputJurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
          .addComponent(inputNim, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGap(8, 8, 8))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel3)
          .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel4)
          .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel5)
          .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel6.setText("Form Penilaian (0-100)");

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel7.setText("Keindahan");

    inputKeindahan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputKeindahanActionPerformed(evt);
      }
    });

    jLabel8.setText("EYD");

    inputEyd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputEydActionPerformed(evt);
      }
    });

    jLabel9.setText("Struktur");

    jLabel10.setText("Kreativitas");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel8)
          .addComponent(jLabel7)
          .addComponent(jLabel9)
          .addComponent(jLabel10))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(inputKeindahan)
          .addComponent(inputEyd, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
          .addComponent(inputStruktur, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(inputKreativitas, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGap(8, 8, 8))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(5, 5, 5)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel7)
          .addComponent(inputKeindahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel8)
          .addComponent(inputEyd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel9)
          .addComponent(inputStruktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel10)
          .addComponent(inputKreativitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    btnSimpan.setText("Simpan");
    btnSimpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSimpanActionPerformed(evt);
      }
    });

    btnBatal.setText("Batal");
    btnBatal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBatalActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(131, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addContainerGap(131, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel6)
              .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBatal)
            .addGap(18, 18, 18)
            .addComponent(btnSimpan)))
        .addGap(24, 24, 24))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel2)
        .addGap(10, 10, 10)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(16, 16, 16)
        .addComponent(jLabel6)
        .addGap(10, 10, 10)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSimpan)
          .addComponent(btnBatal))
        .addGap(24, 24, 24))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputNamaActionPerformed

  private void inputJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJurusanActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputJurusanActionPerformed

  private void inputKeindahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeindahanActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputKeindahanActionPerformed

  private void inputEydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEydActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputEydActionPerformed

  private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    // TODO add your handling code here:
    try {
      // Biodata
      String nama = inputNama.getText();
      String nim = inputNim.getText();
      String jurusan = inputJurusan.getText();
      
      // Penilaian
      double keindahan = Double.parseDouble(inputKeindahan.getText());
      double eyd = Double.parseDouble(inputEyd.getText());
      double struktur = Double.parseDouble(inputStruktur.getText());
      double kreativitas = Double.parseDouble(inputKreativitas.getText());
      
      if (keindahan > 100 || keindahan < 0 || eyd > 100 || eyd < 0 || struktur > 100 || struktur < 0 || kreativitas > 100 || kreativitas < 0) {
        throw new Exception("Input tidak valid!");
      } else {
        CiptaPuisi ciptaPuisi = new CiptaPuisi(keindahan, eyd, struktur, kreativitas);
        double hasil = ciptaPuisi.getHasil();
        new HasilPenilaian(new User(nama, nim, jurusan), hasil);
        this.dispose();
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }//GEN-LAST:event_btnSimpanActionPerformed

  private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    // TODO add your handling code here:
    new KategoriLomba();
    this.dispose();
  }//GEN-LAST:event_btnBatalActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(BiodataPenilaianPuisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BiodataPenilaianPuisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BiodataPenilaianPuisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BiodataPenilaianPuisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BiodataPenilaianPuisi().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBatal;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JTextField inputEyd;
  private javax.swing.JTextField inputJurusan;
  private javax.swing.JTextField inputKeindahan;
  private javax.swing.JTextField inputKreativitas;
  private javax.swing.JTextField inputNama;
  private javax.swing.JTextField inputNim;
  private javax.swing.JTextField inputStruktur;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  // End of variables declaration//GEN-END:variables
}
