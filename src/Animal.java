public class Animal{
    protected int legs;
    
    public Animal(){
        
    }

    /**
     *
     * @RAMDANIHS legs
     */
    protected Animal(int legs){
        System.out.println(" Animal");
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animal can walk");
    }

    public void eat(){
        System.out.println("Animal can eat");
    }
}