/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Lab Informatika
 */
public class User {
    String nama, asalKampus;
    Double ipk;

    public User(String nama, String asalKampus, Double ipk) {
        this.nama = nama;
        this.asalKampus = asalKampus;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalKampus() {
        return asalKampus;
    }

    public Double getIpk() {
        return ipk;
    }
}
