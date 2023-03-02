package balok_dan_tabung.bangun_datar;

public class Lingkaran implements MenghitungBidang {
  double jari;
  final double PHI = ((double) 22 / 7);

  public Lingkaran(double jari) {
    this.jari = jari;
  }

  public double getJari() {
    return this.jari;
  }

  public void setJari(double jari) {
    this.jari = jari;
  }

  @Override
  public double luas() {
    return PHI * this.jari * this.jari;
  }

  @Override
  public double keliling() {
    return PHI * this.jari * 2;
  }
}
