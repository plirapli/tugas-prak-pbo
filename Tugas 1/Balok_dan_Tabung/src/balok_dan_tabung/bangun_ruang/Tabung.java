package balok_dan_tabung.bangun_ruang;

import balok_dan_tabung.bangun_datar.Lingkaran;

public class Tabung extends Lingkaran implements MenghitungRuang {
  private double tinggi;

  public Tabung(double r, double t) {
    super(r);
    this.tinggi = t;
  }

  public double getTinggi() {
    return tinggi;
  }

  @Override
  public double volume() {
    return this.luas() * getTinggi();
  }

  @Override
  public double luasPermukaan() {
    return 2 * this.luas() + this.keliling() * getTinggi();
  }
}
