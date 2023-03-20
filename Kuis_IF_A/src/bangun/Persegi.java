/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

/**
 *
 * @author rafli
 */
public class Persegi {
  private double sisi;

  public Persegi(double sisi) {
    this.sisi = sisi;
  }

  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
  
  public double hitungLuas() {
    return getSisi() * getSisi();
  }
}
