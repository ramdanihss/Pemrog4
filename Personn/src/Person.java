/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Person {
    private String Name ;
    public Person (){
        System.out.println("Person eat");
    }
        public Person(String Name) {
        System.out.println("Person eat " + Name);
        }
       
        public String getName(){
        return Name;
        }
        
        public void setName(String newName){
        Name = newName;
        }
        public void eat(){
        System.out.println("Person eat");
    }
            
        public void sleep(){
        System.out.println("Person sleep 8 Jam");
    }
}
