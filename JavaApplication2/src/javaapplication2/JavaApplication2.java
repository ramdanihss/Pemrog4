/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this ramdanihsssss template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author RamdanihsPC
 */
public class Hotel {
    String Nama;
public BangunanDatar(){
}
public void setNama(String NamaBangunan){
    Nama=NamaBangunan;    
}
public String getNama(){
    System.out.println( Nama);
    return Nama;
}
public void Panjang(int Panjang){
    System.out.println("Panjang : "+ Panjang);
}
public void Lebar(int Lebar){
    System.out.println("Lebar :"+ Lebar);
}
public void Tinggi(int Tinggi){
    System.out.println("Tinggi :"+ Tinggi);
}
public void Sisi(int Sisi){
    System.out.println("Sisi :"+ Sisi);
}
public void Alas(int Alas){
    System.out.println("Alas :"+ Alas);
}
public void Luas(int Sisi){
    System.out.println("Luas Persegi = "+ Sisi*Sisi);
}
public void Luas1(int Panjang,int Lebar){
    System.out.println("Luas Persegi Pangjang = "+ Panjang*Lebar);
}
public void Luas2(int Tinggi,int Alas){
    System.out.println("Luas Segi Tiga = "+ Tinggi*Alas*1/2);
}
public void Keliling(int Sisi){
    System.out.println("Keliling Persegi ="+ Sisi*4);
}
public void Keliling1(int Panjang,int Lebar){
    System.out.println("Keliling Persegi Panjang ="+ 2*(Panjang+Lebar));
}
public void Keliling2(int SisiA,int Alas,int SisiB){
    System.out.println("Keliling Segi Tiga ="+ (SisiA+Alas+SisiB));
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunanDatar bgn1 = new BangunanDatar();
        bgn1.setNama("Persegi");
        bgn1.getNama();
        bgn1.Sisi(4);
        bgn1.Luas(4);
        bgn1.Keliling(4);
        
        BangunanDatar bgn2 = new BangunanDatar();
        bgn2.setNama("\nPersegi Panjang");
        bgn2.getNama();
        bgn2.Panjang(9);
        bgn2.Lebar(6);
        bgn2.Luas1(4, 8);
        bgn1.Keliling1(4, 7);
        
        BangunanDatar bgn3 = new BangunanDatar();
        bgn3.setNama("\nSegi Tiga");
        bgn3.getNama();
        bgn3.Alas(18);
        bgn3.Tinggi(20);
        bgn3.Luas2(9, 10);
        bgn3.Keliling2(9, 4,6);
    }
    
}

