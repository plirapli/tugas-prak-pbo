/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

import bangun_datar.PersegiPanjang;

/**
 *
 * @author rafli
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
  private double tinggi;

  public Balok(double p, double l, double t) {
    super(p, l);
    this.tinggi = t;
  }

  public double getTinggi() {
    return this.tinggi;
  }

  @Override
  public double volume() {
    return this.luas() * getTinggi();
  }

  @Override
  public double luasPermukaan() {
    double p = getPanjang();
    double l = getLebar();
    double t = getTinggi();

    return 2 * ((p * l) + (p * t) + (l * t));
  }
}
