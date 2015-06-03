interface Vechile {
        void drive();
}

class Car implements Vechile{
    @Override
    public void drive (){
        System.out.println("Car drive");
    }
}

class truck implements Vechile{
    @Override
    public void drive(){
        System.out.println("Truck Drive");
    }
}
public class Driver {
    public static void main (String args[]){
        truck Tru = new truck();
        Car cr = new Car();
        
        Tru.drive();
        cr.drive();
    }
}
