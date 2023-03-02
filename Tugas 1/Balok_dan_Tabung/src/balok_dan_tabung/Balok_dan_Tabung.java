/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok_dan_tabung;

import java.util.Scanner;

import balok_dan_tabung.bangun_ruang.Balok;
import balok_dan_tabung.bangun_ruang.Tabung;

/**
 *
 * @author Muhammad Rafli
 */
public class Balok_dan_Tabung {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try (Scanner menuScanner = new Scanner(System.in)) {
			int inputMenu;

			do {
				System.out.println("----------");
				System.out.println("Menu Utama");
				System.out.println("----------");
				System.out.println("[1] Hitung Balok ");
				System.out.println("[2] Hitung Tabung");
				System.out.println("[0] Exit");
				System.out.print("Pilih > ");
				inputMenu = menuScanner.nextInt();

				switch (inputMenu) {
					case 1:
						inputBalok();
						break;

					case 2:
						inputTabung();
						break;

					default:
						System.out.println("Menu tidak tersedia. \n");
						break;
				}

				if (inputMenu != 0) {
					System.out.println("Ulangi? (Ya: 1, Tidak: 0) > ");
					inputMenu = menuScanner.nextInt();
				}
			} while (inputMenu != 0);
		}
	}

	public static void inputBalok() {
		try (Scanner hitung = new Scanner(System.in)) {
			double p, l, t;

			// Input
			System.out.println("----------------");
			System.out.println("Menghitung Balok");
			System.out.println("----------------");

			System.out.print("Input Panjang > ");
			p = hitung.nextInt();

			System.out.print("Input Lebar > ");
			l = hitung.nextInt();

			System.out.print("Input Tinggi > ");
			t = hitung.nextInt();

			hitungHasil(p, l, t);
		}
	}

	public static void inputTabung() {
		try (Scanner hitung = new Scanner(System.in)) {
			double r, t;

			// Input
			System.out.println("----------------");
			System.out.println("Menghitung Tabung");
			System.out.println("----------------");

			System.out.print("Input Jari-jari > ");
			r = hitung.nextDouble();

			System.out.print("Input Tinggi > ");
			t = hitung.nextInt();

			hitungHasil(r, t);
		}

	}

	public static void hitungHasil(double p, double l, double t) {
		Balok balok = new Balok(p, l, t);

		// Hasil
		System.out.println("------");
		System.out.println("\nHasil");
		System.out.println("------");

		System.out.println("Luas Persegi Panjang: " + balok.luas());
		System.out.println("Keliling Persegi Panjang: " + balok.keliling());
		System.out.println("Volume Balok: " + balok.volume());
		System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
	}

	// Overloading method hitungHasil
	public static void hitungHasil(double r, double t) {
		Tabung tabung = new Tabung(r, t);

		// Hasil
		System.out.println("------");
		System.out.println("\nHasil");
		System.out.println("------");

		System.out.println("_________OUTPUT_________");
		System.out.println("Luas Lingkaran: " + tabung.luas());
		System.out.println("Keliling Lingkaran: " + tabung.keliling());
		System.out.println("Volume Tabung: " + tabung.volume());
		System.out.println("Luas Permukaan Tabung: " + tabung.luasPermukaan());
	}
}
