/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Nidzzz
 */
public class MakanandanMinuman extends Barang implements Halal, Kandungan {

    @Override
    public void infoRmasi() {
        System.out.println("Ini makanan Sehat");
    }

    @Override
    public void informasi() {
        System.out.println("ini makanan halal");
    }

    public void cek() {
        super.informasi();
        this.infoRmasi();
        this.informasi();
        super.jumlahBarang();
    }

    public void contoh() {
        super.nama("Good Time");
        super.tampil();
        super.input(01, 3000);
        super.display();
        this.cek();
    }
    
    public void contoh1(){
        super.nama("Club");
        super.tampil();
        super.input(5, 5000);
        super.display();
        this.cek();
    }
}
