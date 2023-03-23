/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author rafli
 */
public class CiptaPuisi {
  private double keindahan, eyd, struktur, kreativitas;

  public CiptaPuisi(double keindahan, double eyd, double struktur, double kreativitas) {
    this.keindahan = 0.3 * keindahan;
    this.eyd = 0.2 * eyd;
    this.struktur = 0.2 * struktur;
    this.kreativitas = 0.3 * kreativitas;
  }
  
  public double getHasil() {
    return keindahan + eyd + struktur + kreativitas;
  }
}
