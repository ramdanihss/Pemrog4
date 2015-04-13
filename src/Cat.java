public class Cat extends Animal implements Pet{
    protected String name;
    public Cat() {
        System.out.println("Cat adopted");
    }
    public Cat(String name) {
        System.out.println("This cat called " + name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String newName){
        name = newName;
    }
    @Override
    public void play(){
        System.out.println("Cat is playing");
    }
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}