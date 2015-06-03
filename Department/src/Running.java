/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Running {
    public static void main (String[] args){
    Division dipicion1 = new Division();
    Division dipicion2 = new Division("A1");
    Division dipicion3 = new Division("A1", "Keuangan");
    
    Division dip1 = new Division ("A3","Tata Usaha", "Pusing");
    Division dip2 = new Division ();
    
    dipicion1.tampilkanInfo();
    dipicion2.tampilkanInfo();
    dipicion3.tampilkanInfo();
    
    dip1.tampilkanInfo();
    dipicion1.hitungGaji(2000000);
    dip1.tampilkanInfo();
    dipicion2.hitungGaji(3000000);
    }
            
    
}
