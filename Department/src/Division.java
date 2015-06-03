/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Division extends Department{
    private String KepalaDivisi;
    
    public Division (){
    super();
    }
    
    public Division (String id){
    super(id);
    }
    
    public Division (String id, String nama_dept){
    super (id, nama_dept);
    }
    
    public Division (String id, String nama_dept, String new_kd){
    super (id, nama_dept);
    KepalaDivisi = new_kd;
    }

    /**
     *
     */
    @Override
    
    public void tampilkanInfo(){
        System.out.println("ID" + id);
        System.out.println ("Departmen" + nama_dept);
        System.out.println("Kepala Divisi" + KepalaDivisi);
    }
    
    public void HitungGaji(int gaji){
        System.out.println("Gajinya adalah");
        System.out.println ("Departmen" + nama_dept);
        System.out.println("Kepala Divisi" + KepalaDivisi);
    }
    
    public void hitungGaji (int gj){
        System.out.println("Gaji : RP." + gj);
    }
    
}

