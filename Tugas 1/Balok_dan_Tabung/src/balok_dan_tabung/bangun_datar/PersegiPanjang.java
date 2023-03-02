package balok_dan_tabung.bangun_datar;

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
