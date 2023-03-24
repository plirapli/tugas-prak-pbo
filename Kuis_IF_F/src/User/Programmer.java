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
public class Programmer extends User {

    private Double knowledge, cleanCode, debugging;

    public Programmer(String nama, String asalKampus, Double ipk, Double knowledge, Double cleanCode, Double debugging) {
        super(nama, asalKampus, ipk);
        this.knowledge = knowledge;
        this.cleanCode = cleanCode;
        this.debugging = debugging;
    }

    public double hasil() {
        return 0.6 * knowledge + 0.15 * cleanCode + 0.25 * debugging;
    }
}
