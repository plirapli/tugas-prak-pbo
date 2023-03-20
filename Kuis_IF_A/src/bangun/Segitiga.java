/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

/**
 *
 * @author rafli
 */
public class Segitiga {
  private double alas, tinggi;

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public double getAlas() {
    return alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }
  
  public double hitungLuas() {
    return getAlas() * getTinggi() / 2;
  }
}
