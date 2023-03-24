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
public class Designer extends User {

    private Double portofolio, prototyping, creativity;

    public Designer(String nama, String asalKampus, Double ipk, Double portofolio, Double prototyping, Double creativity) {
        super(nama, asalKampus, ipk);
        this.portofolio = portofolio;
        this.prototyping = prototyping;
        this.creativity = creativity;
    }

    public double hasil() {
        return 0.3 * portofolio + 0.45 * prototyping + 0.25 * creativity;
    }
}
