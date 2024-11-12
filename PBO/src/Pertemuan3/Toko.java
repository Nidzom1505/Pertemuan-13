/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Nidzzz
 */
public abstract class Toko {

    String nama;
    
    public abstract void jumlahBarang();

    void nama(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Nama produknya " + nama);
    }
}
