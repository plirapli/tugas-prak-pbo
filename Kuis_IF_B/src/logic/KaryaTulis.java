/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author rafli
 */
public class KaryaTulis {
  private double tataBahasa, eyd, struktur, kreativitas, hasil;

  public KaryaTulis(double tataBahasa, double eyd, double struktur, double kreativitas) {
    this.tataBahasa = 0.15 * tataBahasa;
    this.eyd = 0.35 * eyd;
    this.struktur = 0.25 * struktur;
    this.kreativitas = 0.25 * kreativitas;
    hitungHasil();
  }
  
  private double hitungHasil() {
    hasil = tataBahasa + eyd + struktur + kreativitas;
    return hasil;
  }
  
  public double getHasil() {
    return hasil;
  }
}
