/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Nidzzz
 */
public class MainTugas3 {

    public static void main(String[] args) {
        MakanandanMinuman y = new MakanandanMinuman();
        y.contoh();
        y.jumlahBarang();

        System.out.println("");
        Barang p = (Barang) y;
        p.nama("Club");
        p.tampil();
        p.input(5, 5000);
        p.display();
        p.informasi();
    }
}
