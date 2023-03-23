/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author rafli
 */
public class User {
  private String nama, jurusan, nim;

  public User(String nama, String jurusan, String nim) {
    this.nama = nama;
    this.jurusan = jurusan;
    this.nim = nim;
  }

  public String getNama() {
    return nama;
  }

  public String getJurusan() {
    return jurusan;
  }

  public String getNim() {
    return nim;
  }
}
