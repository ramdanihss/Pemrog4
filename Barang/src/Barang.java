/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Barang {
       protected double harga;
       public Barang () {
           System.out.println("Ini konstruktor barang default");
       }
       public Barang (double harga){
           this.harga = harga;
           System.out.println("Ini konstruktor barang berparameter");
       }
       public void setHarga (double harga){
           System.out.println("ini metode setHarga milik kelas Barang");
           this.harga = harga;
       }
       public double getHarga(){
           System.out.println("ini metode getHarga milik kelas barang");
           return harga;
       }
}
