/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Buku extends Barang{
    public String judul;
    public Buku(){
        System.out.println("ini konstruktor buku default");
    }
    public Buku (String judul){
        this.judul = judul;
        System.out.println("ini konstruktor buku berparameter");
    }
    @Override
    public void setHarga (double harga){
        System.out.println("ini override metode setHarga milik kelas buku");
        this.harga = harga;
    }
}
