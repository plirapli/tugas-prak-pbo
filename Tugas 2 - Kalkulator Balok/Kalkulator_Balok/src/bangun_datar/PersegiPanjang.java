/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author rafli
 */
public class PersegiPanjang implements MenghitungBidang {
  private double panjang, lebar;

  public PersegiPanjang(double p, double l) {
    this.panjang = p;
    this.lebar = l;
  }

  public double getPanjang() {
    return panjang;
  }

  public double getLebar() {
    return lebar;
  }

  @Override
  public double keliling() {
    return 2 * (this.panjang + this.lebar);
  }

  @Override
  public double luas() {
    return this.panjang * this.lebar;
  }
}
