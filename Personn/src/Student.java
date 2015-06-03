/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7
 */
public class Student extends Person {
      private String StudentID;
 public Student (){
        System.out.println("Person eat");
    }
        public Student(String StudentID) {
        System.out.println("Person eat " + StudentID);
        }
       
        public String getStudentID(){
        return StudentID;
        }
        
        public void setSTudentID(String StudentID){
        StudentID = new StudentID;
        }
        public void learn(){
        System.out.println("Person eat");
    }
            
      @Override
        public void sleep(){
        System.out.println("Person sleep 8 Jam"+StudentID);
    }
}
