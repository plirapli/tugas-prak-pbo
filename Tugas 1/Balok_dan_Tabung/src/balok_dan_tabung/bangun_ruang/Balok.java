package balok_dan_tabung.bangun_ruang;

import balok_dan_tabung.bangun_datar.PersegiPanjang;

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
