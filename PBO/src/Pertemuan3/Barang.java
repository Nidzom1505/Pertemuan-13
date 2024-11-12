/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Nidzzz
 */
public class Barang extends Toko {

    int noRak;
    int jumlah;

    void input(int noRak, int harga) {
        this.noRak = noRak;
        this.jumlah = harga;
    }

    void display() {
        System.out.println("LETAK RAK: " + noRak);
        System.out.println("JUMLAH: " + jumlah);
    }

    void informasi() {
        System.out.println("Selamat berbelanja di Toko...");
    }

    @Override
    public void jumlahBarang() {
        System.out.println("Ini abstrak Method");
    }
    

}
