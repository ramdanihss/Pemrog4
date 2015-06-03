public class Department {
    protected String id;
    protected String nama_dept;
    
    public Department(){
        id = "(id)";
        nama_dept = "(Nama Dept)";
    }
    
    
     
    public Department(String NewID){
        id = NewID;
    }
        public Department(String NewID, String NewNama_dept){
        id = NewID;
        nama_dept = NewNama_dept;
       
    }
    
    
    public void tampilkanInfo(){
        System.out.println("ID" + id);
        System.out.println("Departmen :" + nama_dept);
    }
    
}
